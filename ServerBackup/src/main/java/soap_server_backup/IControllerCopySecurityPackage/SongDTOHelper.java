package soap_server_backup.IControllerCopySecurityPackage;


/**
* soap_server_backup/IControllerCopySecurityPackage/SongDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from IServerBackup.idl
* Monday, August 8, 2022 10:20:54 AM COT
*/

abstract public class SongDTOHelper
{
  private static String  _id = "IDL:soap_server_backup/IControllerCopySecurity/SongDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, soap_server_backup.IControllerCopySecurityPackage.SongDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static soap_server_backup.IControllerCopySecurityPackage.SongDTO extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [6];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "artist",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "title",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "type",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[4] = new org.omg.CORBA.StructMember (
            "sizeMB",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_octet);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (soap_server_backup.IControllerCopySecurityPackage.streamBytesHelper.id (), "streamBytes", _tcOf_members0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "arrayBytes",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (soap_server_backup.IControllerCopySecurityPackage.SongDTOHelper.id (), "SongDTO", _members0);
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

  public static soap_server_backup.IControllerCopySecurityPackage.SongDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    soap_server_backup.IControllerCopySecurityPackage.SongDTO value = new soap_server_backup.IControllerCopySecurityPackage.SongDTO ();
    value.id = istream.read_long ();
    value.artist = istream.read_string ();
    value.title = istream.read_string ();
    value.type = istream.read_string ();
    value.sizeMB = istream.read_long ();
    value.arrayBytes = soap_server_backup.IControllerCopySecurityPackage.streamBytesHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, soap_server_backup.IControllerCopySecurityPackage.SongDTO value)
  {
    ostream.write_long (value.id);
    ostream.write_string (value.artist);
    ostream.write_string (value.title);
    ostream.write_string (value.type);
    ostream.write_long (value.sizeMB);
    soap_server_backup.IControllerCopySecurityPackage.streamBytesHelper.write (ostream, value.arrayBytes);
  }

}
