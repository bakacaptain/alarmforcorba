package ERCare;


/**
* ERCare/PatientValuesStructuresHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SubscribePatient.idl
* Wednesday, December 11, 2013 1:20:38 PM CET
*/

public final class PatientValuesStructuresHolder implements org.omg.CORBA.portable.Streamable
{
  public ERCare.PatientValuesStructure value[] = null;

  public PatientValuesStructuresHolder ()
  {
  }

  public PatientValuesStructuresHolder (ERCare.PatientValuesStructure[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ERCare.PatientValuesStructuresHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ERCare.PatientValuesStructuresHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ERCare.PatientValuesStructuresHelper.type ();
  }

}
