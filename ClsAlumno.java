public class ClsAlumno {
    String nombre;
    String carnet;
    double promedio;

    public ClsAlumno(){

    }

    public ClsAlumno(String nombre, String carnet, double promedio){
        this.nombre = nombre;
        this.carnet = carnet;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "ClsAlumno{" + "nombre=" + nombre + ", carnet=" + carnet + ", promedio=" + promedio + '}';
    }
}
