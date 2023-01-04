package OpenBootcamp.POO;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    //estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    // guardar empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> verEmpleados(){
        return empleados;
    }
}
