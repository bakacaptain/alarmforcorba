import java.util.ArrayList;
import java.util.List;


public class DataStore {
	List<Patient> patients;
	private static DataStore singletonObject;
	// Note that the constructor is private
	private DataStore() {
		patients = new ArrayList<Patient>();
	}
	
	public void addPatient(Patient patient)
	{
		patients.add(patient);
	}
	
	public void DeletePatient(Patient patient)
	{
		patients.remove(patient);
	}
	public void DeletePatient(String patientID)
	{
		for(Patient p : patients)
		{
			if(p.getPatientID().equalsIgnoreCase(patientID))
			{
				patients.remove(p);
				break;
			}
		}
	}
	
	public Patient getPatient(String patientID)
	{
		for(Patient p : patients)
		{
			if(p.getPatientID().equalsIgnoreCase(patientID))
			{
				return p;
			}
		}
		return null;
	}
	
	public static DataStore getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new DataStore();
		}
		return singletonObject;
	}
}
