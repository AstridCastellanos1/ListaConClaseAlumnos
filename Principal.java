public class Principal {
    public static void main(String[] args) {
        ClsAlumno al = new ClsAlumno();
        ClsLista lista = new ClsLista();

        System.out.println("\n----------------------------------------------------------");
        System.out.println("DATOS INSERTADOS POR LA CABEZA\n");
        al.carnet = "00010101001";
        al.nombre = "Juan perez";
        al.promedio = 7.5;
        lista.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.carnet = "00020202002";
        al.nombre = "María Aguilar";
        al.promedio = 6.0;
        lista.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.carnet = "00030303003";
        al.nombre = "Samanta Hernandez";
        al.promedio = 8.0;
        lista.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.carnet = "00040404004";
        al.nombre = "Karina Gómez";
        al.promedio = 5.0;
        lista.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.carnet = "00050505005";
        al.nombre = "Manuel Alfaro";
        al.promedio = 9.0;
        lista.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.carnet = "00060606006";
        al.nombre = "Pablo Gonsales";
        al.promedio = 7.5;
        lista.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.carnet = "00070707007";
        al.nombre = "Sady Ramirez";
        al.promedio = 6.5;
        lista.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.carnet = "00080808008";
        al.nombre = "Juana de Arco";
        al.promedio = 5.5;
        lista.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.carnet = "00090909009";
        al.nombre = "Frida Calo";
        al.promedio = 8.5;
        lista.insertarCabezaLista(al);
        al = new ClsAlumno();
        al.carnet = "10101010101";
        al.nombre = "Estiven Cano";
        al.promedio = 9.5;
        lista.insertarCabezaLista(al);
        lista.visualizar();
        
        System.out.println("\n----------------------------------------------------------");
        System.out.println("INSERTAR UN DATO AL FINAL\n");
        System.out.println("Datos a ingresar: \nNombre: Jualia Marroquin\nCarnet: 20202020202\nPromedio: 7.9\n");
        System.out.println("LISTA\n");
        al = new ClsAlumno();
        al.carnet = "20202020202";
        al.nombre = "Jualia Marroquin";
        al.promedio = 7.9;
        lista.insertarUltimo("00010101001", al);
        lista.visualizar();
        
        System.out.println("\n----------------------------------------------------------");
        System.out.println("BUSQUEDA DE UN DATO INGRESANDO EL CARNET\n\nCarnet ingresado: 00050505005\n");
        System.out.println(lista.buscarLista("00050505005").getDato());
        
        System.out.println("\n----------------------------------------------------------");
        System.out.println("LISTA AL INSERTAR UN DATO EN EL MEDIO\n");
        System.out.println("Datos a ingresar: \nNombre: Angela Maldonado\nCarnet: 30303030303\nPromedio: 6.2\n");
        System.out.println("LISTA\n");
        al = new ClsAlumno();
        al.carnet = "30303030303";
        al.nombre = "Angela Maldonado";
        al.promedio = 6.2;
        lista.insertarLista("00070707007", al);
        lista.visualizar();
        
        System.out.println("\n----------------------------------------------------------");
        System.out.println("BUSQUEDA DE UN DATO INGRESANDO LA POSICION\n\nPosicion ingresada: 5\n");
        System.out.println(lista.buscarPosicion(5).getDato());
        
        System.out.println("\n----------------------------------------------------------");
        System.out.println("LISTA AL ELIMINAR UN DATO\n");
        System.out.println("Carnet eliminado: 00090909009\n");
        lista.eliminar("00090909009");
        lista.visualizar();
    }
}
