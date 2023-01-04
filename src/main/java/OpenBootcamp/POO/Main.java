package OpenBootcamp.POO;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juan = new Empleado("Juan",28,3600000.0,true);
        Empleado Abel = new Empleado("Abel",27,3600000.0,true);
        Empleado Angel = new Empleado("Angel",28,3600000.0,true);

        // guardar empleados
        empleadoCRUD.guardar(juan);
        empleadoCRUD.guardar(Abel);
        empleadoCRUD.guardar(Angel);

        //consultar empleados

        List<Empleado> empleados = empleadoCRUD.verEmpleados();

        System.out.println(Abel);
        for (int i = 0; i < empleados.size(); i++){
            System.out.println(empleados.get(i).getNombre());
            System.out.println(empleados.get(i).getEdad());
            System.out.println(empleados.get(i).getSalario());
            System.out.println(empleados.get(i).isAlta());
        }





    }
}