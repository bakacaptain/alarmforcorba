package ERCare;


/**
* ERCare/SubmitDataOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Messages.idl
* Monday, December 9, 2013 11:06:22 AM CET
*/

public interface SubmitDataOperations 
{
  void SBPData (String patientID, int value);
  void DBPData (String PatientID, int value);
  void HRPData (String PatientID, int value);
  void SatData (String PatientID, int value);
  void SetMinThreshold (String patientID, String dataType, int value);
  void SetMaxThreshold (String patientID, String dataType, int value);
  int[] GetValues (String patientID, String dataType);
} // interface SubmitDataOperations
