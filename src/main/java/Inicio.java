import java.sql.Connection;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("-------------------------------------------------");
            System.out.println("Aplicación de Mensajes");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("0. Cerrar programa");
            //leemos la opcion del usuario
            opcion = sc.nextInt();

            switch (opcion){

                case 1: MensajesServicio.crearMensaje();
                    break;

                case 2: MensajesServicio.listarMensajes();
                break;

                case 3: MensajesServicio.editarMensaje();
                break;

                case 4: MensajesServicio.borrarMensaje();
                break;

                case 0:
                    System.out.println("Hasta pronto!");
                    sc.close();
                break;

                default:
                    System.out.println("Número digitado no se encuentra entre la lista de opciones disponibles");
                    break;
            }

        }while (opcion != 0);



    }

}
