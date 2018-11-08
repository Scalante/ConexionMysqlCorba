package conexionmysqlcorba.Terceros;


abstract public class TerceroHelper
{
  private static String  _id = "IDL:Terceros/Tercero:1.0";

  public static void insert (org.omg.CORBA.Any a, conexionmysqlcorba.Terceros.Tercero that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static conexionmysqlcorba.Terceros.Tercero extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (conexionmysqlcorba.Terceros.TerceroHelper.id (), "Tercero");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static conexionmysqlcorba.Terceros.Tercero read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_TerceroStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, conexionmysqlcorba.Terceros.Tercero value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static conexionmysqlcorba.Terceros.Tercero narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof conexionmysqlcorba.Terceros.Tercero)
      return (conexionmysqlcorba.Terceros.Tercero)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      conexionmysqlcorba.Terceros._TerceroStub stub = new conexionmysqlcorba.Terceros._TerceroStub ();
      stub._set_delegate(delegate);
      return (Tercero) stub;
    }
  }

  public static conexionmysqlcorba.Terceros.Tercero unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof conexionmysqlcorba.Terceros.Tercero)
      return (conexionmysqlcorba.Terceros.Tercero)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      conexionmysqlcorba.Terceros._TerceroStub stub = new conexionmysqlcorba.Terceros._TerceroStub ();
      stub._set_delegate(delegate);
      return (Tercero) stub;
    }
  }

}
