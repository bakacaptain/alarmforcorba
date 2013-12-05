package ERCare;


/**
* ERCare/MeasurementStructure.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ERCare.idl
* Thursday, December 5, 2013 3:18:31 PM CET
*/

public final class MeasurementStructure implements org.omg.CORBA.portable.IDLEntity
{
  public int SBP = (int)0;
  public int DBP = (int)0;
  public int HRP = (int)0;
  public int SAT = (int)0;
  public String PatID = null;
  public int timestamp = (int)0;

  public MeasurementStructure ()
  {
  } // ctor

  public MeasurementStructure (int _SBP, int _DBP, int _HRP, int _SAT, String _PatID, int _timestamp)
  {
    SBP = _SBP;
    DBP = _DBP;
    HRP = _HRP;
    SAT = _SAT;
    PatID = _PatID;
    timestamp = _timestamp;
  } // ctor

} // class MeasurementStructure
