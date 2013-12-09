package ERCare;


/**
* ERCare/SubmitDataPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Messages.idl
* Monday, December 9, 2013 11:27:40 AM CET
*/

public abstract class SubmitDataPOA extends org.omg.PortableServer.Servant
 implements ERCare.SubmitDataOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("SBPData", new java.lang.Integer (0));
    _methods.put ("DBPData", new java.lang.Integer (1));
    _methods.put ("HRPData", new java.lang.Integer (2));
    _methods.put ("SatData", new java.lang.Integer (3));
    _methods.put ("SetMinThreshold", new java.lang.Integer (4));
    _methods.put ("SetMaxThreshold", new java.lang.Integer (5));
    _methods.put ("GetValues", new java.lang.Integer (6));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // ERCare/SubmitData/SBPData
       {
         String patientID = in.read_string ();
         int value = in.read_long ();
         this.SBPData (patientID, value);
         out = $rh.createReply();
         break;
       }

       case 1:  // ERCare/SubmitData/DBPData
       {
         String PatientID = in.read_string ();
         int value = in.read_long ();
         this.DBPData (PatientID, value);
         out = $rh.createReply();
         break;
       }

       case 2:  // ERCare/SubmitData/HRPData
       {
         String PatientID = in.read_string ();
         int value = in.read_long ();
         this.HRPData (PatientID, value);
         out = $rh.createReply();
         break;
       }

       case 3:  // ERCare/SubmitData/SatData
       {
         String PatientID = in.read_string ();
         int value = in.read_long ();
         this.SatData (PatientID, value);
         out = $rh.createReply();
         break;
       }

       case 4:  // ERCare/SubmitData/SetMinThreshold
       {
         String patientID = in.read_string ();
         String dataType = in.read_string ();
         int value = in.read_long ();
         this.SetMinThreshold (patientID, dataType, value);
         out = $rh.createReply();
         break;
       }

       case 5:  // ERCare/SubmitData/SetMaxThreshold
       {
         String patientID = in.read_string ();
         String dataType = in.read_string ();
         int value = in.read_long ();
         this.SetMaxThreshold (patientID, dataType, value);
         out = $rh.createReply();
         break;
       }

       case 6:  // ERCare/SubmitData/GetValues
       {
         String patientID = in.read_string ();
         String dataType = in.read_string ();
         int $result[] = null;
         $result = this.GetValues (patientID, dataType);
         out = $rh.createReply();
         ERCare.PatientValuesHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ERCare/SubmitData:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SubmitData _this() 
  {
    return SubmitDataHelper.narrow(
    super._this_object());
  }

  public SubmitData _this(org.omg.CORBA.ORB orb) 
  {
    return SubmitDataHelper.narrow(
    super._this_object(orb));
  }


} // class SubmitDataPOA
