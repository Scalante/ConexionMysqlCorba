package conexionmysqlcorba.Terceros;


public interface TerceroOperations 
{
  boolean insertarTercero (String nombre, String apellido, String telefono);
  boolean actualizarTercero (int id, String nombre, String apellido, String telefono);
  boolean eliminarTercero (int id);
  String consultarTercero (int id);
  void shutdown ();
} // interface TerceroOperations
