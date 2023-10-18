public class Tecnico extends Persona implements Salario{
    private String equipo;

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Tecnico(int cedula, String nombre, String apellido, String equipo) {
        super(cedula, nombre, apellido);
        this.equipo = equipo;
    }

    @Override
    public void calcularSalario(){

    }
}
