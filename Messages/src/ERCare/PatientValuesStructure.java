package ERCare;


/**
* ERCare/PatientValuesStructure.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SubscribePatient.idl
* Wednesday, December 11, 2013 1:20:38 PM CET
*/

public final class PatientValuesStructure implements org.omg.CORBA.portable.IDLEntity
{
  public int countOfValues = (int)0;
  public String PatID = null;

  public PatientValuesStructure ()
  {
  } // ctor

  public PatientValuesStructure (int _countOfValues, String _PatID)
  {
    countOfValues = _countOfValues;
    PatID = _PatID;
  } // ctor

} // class PatientValuesStructure