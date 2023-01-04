package conInterfaces;

import OpenBootcamp.POO.Empleado;

import java.util.List;

// SE DECLARAN LOS METODOS, NO SE IMPLEMENTAN

// DICE LO QUE HAY QUE HACER PERO NO LO HACE
public interface EmpleadoCRUD {

    static void guardar() {

    }

    static List<Empleado> findAll() {
        return null;
    }


    void delete(Empleado empleado);
}
