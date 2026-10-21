public class Dispositivo {
    private int ID;
    private String nombre;
    private boolean estado;
    private static int cont;

    //Constructor

    public Dispositivo(int ID, String nombre) {
        if (ID > 0 && nombre != null && !nombre.trim().isEmpty()) {
            this.ID = ID;
            this.nombre = nombre;
            cont++;
        } else {
            throw new IllegalArgumentException("Datos de dispositivo no validos");
        }

    }
  public int getID() {
        return ID;
  }

  public String getNombre() {
        return nombre;
  }

  public boolean getEstado() {
        return estado;
  }

  public void setNombre(String nombre) {
        this.nombre = nombre;
  }

    public String desactivar (){
        if(estado == true){

         this.estado = true;

        }else{
            return ("false");
        }
    }
}



