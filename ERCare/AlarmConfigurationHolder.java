package ERCare;

/**
* ERCare/AlarmConfigurationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ServerAlarmConfig.idl
* Thursday, December 5, 2013 3:31:07 PM CET
*/

public final class AlarmConfigurationHolder implements org.omg.CORBA.portable.Streamable
{
  public ERCare.AlarmConfiguration value = null;

  public AlarmConfigurationHolder ()
  {
  }

  public AlarmConfigurationHolder (ERCare.AlarmConfiguration initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ERCare.AlarmConfigurationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ERCare.AlarmConfigurationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ERCare.AlarmConfigurationHelper.type ();
  }

}
