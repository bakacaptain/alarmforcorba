package ERCare;


/**
* ERCare/PatientValuesStructureHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SubscribePatient.idl
* Wednesday, December 11, 2013 1:20:38 PM CET
*/

abstract public class PatientValuesStructureHelper
{
  private static String  _id = "IDL:ERCare/PatientValuesStructure:1.0";

  public static void insert (org.omg.CORBA.Any a, ERCare.PatientValuesStructure that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ERCare.PatientValuesStructure extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "countOfValues",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "PatID",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (ERCare.PatientValuesStructureHelper.id (), "PatientValuesStructure", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ERCare.PatientValuesStructure read (org.omg.CORBA.portable.InputStream istream)
  {
    ERCare.PatientValuesStructure value = new ERCare.PatientValuesStructure ();
    value.countOfValues = istream.read_long ();
    value.PatID = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ERCare.PatientValuesStructure value)
  {
    ostream.write_long (value.countOfValues);
    ostream.write_string (value.PatID);
  }

}
