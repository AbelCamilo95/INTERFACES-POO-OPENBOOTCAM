package conInterfaces;

public class MainInterfaces {

    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args) {

        EmpleadoCRUD.findAll();
        EmpleadoCRUD.guardar();
    }
}
