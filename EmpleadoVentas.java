public class EmpleadoVentas extends Empleado {
    private int ventasRealizadas;
    private double comisionPorVenta;

    public EmpleadoVentas(String nombre, double sueldoBase, int ventasRealizadas, double comisionPorVenta) {
        super(nombre, sueldoBase);
        this.ventasRealizadas = ventasRealizadas;
        this.comisionPorVenta = comisionPorVenta;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase + (ventasRealizadas * comisionPorVenta);
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }
}
