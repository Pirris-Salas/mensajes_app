import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesAcciones {

    public static void crearMensajeBD(Mensajes mensaje){
        Conexion db_connect = new Conexion();

        try(Connection connection = db_connect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado correctamente");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void leerMensajesBD(){

    }

    public static void borrarMensajeBD(int mensajeID){

    }

    public static void actualizarMensajeBD(Mensajes mensaje){

    }
}
