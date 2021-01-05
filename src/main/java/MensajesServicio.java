import java.util.Scanner;

public class MensajesServicio {

    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite el mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Por favor digite su nombre");
        String autor = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(autor);

        MensajesAcciones.crearMensajeBD(registro);
    }

    public static void listarMensajes(){
        MensajesAcciones.leerMensajesBD();
    }

    public static void borrarMensaje(){

    }

    public static void editarMensaje(){

    }

}
