package ERCare;

/**
* ERCare/SubmitDataHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Messages.idl
* Monday, December 9, 2013 11:06:22 AM CET
*/

public final class SubmitDataHolder implements org.omg.CORBA.portable.Streamable
{
  public ERCare.SubmitData value = null;

  public SubmitDataHolder ()
  {
  }

  public SubmitDataHolder (ERCare.SubmitData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ERCare.SubmitDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ERCare.SubmitDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ERCare.SubmitDataHelper.type ();
  }

}
