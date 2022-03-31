public class Nodo {
    ClsAlumno dato; 
    Nodo enlace;
    
    //Creando el constructor inicial (cabeza)
    public Nodo(ClsAlumno x){
    
        dato = x;
        enlace = null;
    }
    
    //Segundo constructor para crear nodo y enlazar
    public Nodo(ClsAlumno x, Nodo n){
        dato = x;
        enlace = n;
    }
    
    public ClsAlumno getDato(){
        return dato;
    }
    
    public Nodo getEnlace(){
        return enlace;
    }
    
    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }
}
