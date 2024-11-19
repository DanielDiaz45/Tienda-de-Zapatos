
import java.util.ArrayList;

public class VentaCalzado {
    public static void main(String[] args) {
        // Crear lista de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Agregar empleados de ventas
        EmpleadoVentas vendedor1 = new EmpleadoVentas("Juan", 50000, 10, 500);
        EmpleadoVentas vendedor2 = new EmpleadoVentas("Ana", 45000, 5, 600);
        
        // Agregar empleados de soporte
        EmpleadoSoporte soporte1 = new EmpleadoSoporte("Pedro", 40000, 5, 200);
        EmpleadoSoporte soporte2 = new EmpleadoSoporte("Laura", 42000, 8, 250);

        empleados.add(vendedor1);
        empleados.add(vendedor2);
        empleados.add(soporte1);
        empleados.add(soporte2);

        // Mostrar los salarios de los empleados
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Sueldo total: $" + empleado.calcularSalario());
            System.out.println("-----------");
        }
    }
}
