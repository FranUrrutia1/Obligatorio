public class Arbitro extends Persona implements Precalentar, Salario{
    private int cantDePartidosDirigidos;

    public int getCantDePartidosDirigidos() {
        return cantDePartidosDirigidos;
    }

    public void setCantDePartidosDirigidos(int cantDePartidosDirigidos) {
        this.cantDePartidosDirigidos = cantDePartidosDirigidos;
    }

    public Arbitro(int cedula, String nombre, String apellido, int cantDePartidosDirigidos) {
        super(cedula, nombre, apellido);
        this.cantDePartidosDirigidos = cantDePartidosDirigidos;
    }

    @Override
    public void precalentar(){
        System.out.println("El arbitro ha precalentado 10 minutos.");
    }
    @Override
    public void calcularSalario(){

    }
}
