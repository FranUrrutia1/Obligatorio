public class Persona {
    private int cedula;
    private String Nombre;
    private String Apellido;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Persona(int cedula, String nombre, String apellido) {
        this.cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
    }
}
