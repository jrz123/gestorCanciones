package soap_server_backup;


/**
* soap_server_backup/_IControllerCopySecurityStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from IServerBackup.idl
* Monday, August 8, 2022 10:20:54 AM COT
*/

public class _IControllerCopySecurityStub extends org.omg.CORBA.portable.ObjectImpl implements soap_server_backup.IControllerCopySecurity
{

  public boolean saveCopySong (soap_server_backup.IControllerCopySecurityPackage.SongDTO objSong)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("saveCopySong", true);
                soap_server_backup.IControllerCopySecurityPackage.SongDTOHelper.write ($out, objSong);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return saveCopySong (objSong        );
            } finally {
                _releaseReply ($in);
            }
  } // saveCopySong

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:soap_server_backup/IControllerCopySecurity:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _IControllerCopySecurityStub
