package ERCare;


/**
* ERCare/PatientValuesStructuresHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SubscribePatient.idl
* Wednesday, December 11, 2013 1:20:38 PM CET
*/

abstract public class PatientValuesStructuresHelper
{
  private static String  _id = "IDL:ERCare/PatientValuesStructures:1.0";

  public static void insert (org.omg.CORBA.Any a, ERCare.PatientValuesStructure[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ERCare.PatientValuesStructure[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ERCare.PatientValuesStructureHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ERCare.PatientValuesStructuresHelper.id (), "PatientValuesStructures", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ERCare.PatientValuesStructure[] read (org.omg.CORBA.portable.InputStream istream)
  {
    ERCare.PatientValuesStructure value[] = null;
    int _len0 = istream.read_long ();
    value = new ERCare.PatientValuesStructure[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = ERCare.PatientValuesStructureHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ERCare.PatientValuesStructure[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      ERCare.PatientValuesStructureHelper.write (ostream, value[_i0]);
  }

}
