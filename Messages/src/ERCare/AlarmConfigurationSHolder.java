package ERCare;


/**
* ERCare/AlarmConfigurationSHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ServerAlarmConfig.idl
* Wednesday, December 11, 2013 1:20:33 PM CET
*/

public final class AlarmConfigurationSHolder implements org.omg.CORBA.portable.Streamable
{
  public ERCare.AlarmConfiguration value[] = null;

  public AlarmConfigurationSHolder ()
  {
  }

  public AlarmConfigurationSHolder (ERCare.AlarmConfiguration[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ERCare.AlarmConfigurationSHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ERCare.AlarmConfigurationSHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ERCare.AlarmConfigurationSHelper.type ();
  }

}
