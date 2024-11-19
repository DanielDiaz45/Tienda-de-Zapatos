

public class EmpleadoSoporte extends Empleado {
    private int horasExtra;
    private double bonificacionPorHora;

    public EmpleadoSoporte(String nombre, double sueldoBase, int horasExtra, double bonificacionPorHora) {
        super(nombre, sueldoBase);
        this.horasExtra = horasExtra;
        this.bonificacionPorHora = bonificacionPorHora;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase + (horasExtra * bonificacionPorHora);
    }

    public int getHorasExtra() {
        return horasExtra;
    }
}
