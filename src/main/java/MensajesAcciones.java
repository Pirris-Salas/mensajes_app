import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection connection = db_connect.get_connection()) {
            String query = "SELECT * from mensajes";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID: "+ rs.getInt("id_mensaje"));
                System.out.println("Mensaje: "+ rs.getString("mensaje"));
                System.out.println("Autor: "+ rs.getString("autor_mensaje"));
                System.out.println("Fecha: "+ rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        }catch (SQLException e){
            System.out.println("No fué posible traer los mensajes");
            System.out.println(e);
        }
    }


    public static void borrarMensajeBD(int mensajeID){

    }

    public static void actualizarMensajeBD(Mensajes mensaje){

    }
}
