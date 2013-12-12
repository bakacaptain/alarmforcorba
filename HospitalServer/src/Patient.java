import java.util.List;


public class Patient {
	private String PatientID;
	ThresholdPair SBPThresholds;
	ThresholdPair DBPThresholds;
	ThresholdPair HRPThresholds;
	ThresholdPair SatThresholds;
	List<Integer> SBPValues;
	List<Integer> DBPValues;
	List<Integer> HRPValues;
	List<Integer> SatValues;
	String getPatientID() {
		return PatientID;
	}
	void setPatientID(String patientID) {
		PatientID = patientID;
	}
}
