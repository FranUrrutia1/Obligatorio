public class Jugador extends Persona implements Precalentar, Salario{
    private String posicion;
    private String equipo;
    private int minutosJugados;

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public Jugador(int cedula, String nombre, String apellido, String posicion, String equipo, int minutosJugados) {
        super(cedula, nombre, apellido);
        this.posicion = posicion;
        this.equipo = equipo;
        this.minutosJugados = minutosJugados;
    }

    @Override
    public void precalentar(){
        System.out.println("El jugador ha precalentado 15 minutos.");
    }
    @Override
    public void calcularSalario(){

    }
}
