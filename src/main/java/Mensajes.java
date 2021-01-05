import org.w3c.dom.ls.LSOutput;

public class Mensajes {

   private int idMensaje;
   private String mensaje;
   private String autorMensaje;
   private String fechaMensaje;

   public Mensajes(){}

   public Mensajes(String mensaje, String authorMensaje, String fechaMensaje){
       this.mensaje = mensaje;
       this.autorMensaje = authorMensaje;
       this.fechaMensaje = fechaMensaje;
   }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }
}
