public class ClsLista {
    
    public Nodo primero; //Esta será la cabeza o la raíz
    
    public ClsLista(){
        primero = null;
    }
    
    
    //Insertar nuevo dato en la cabeza
    public ClsLista insertarCabezaLista(ClsAlumno entrada){
        
      Nodo nuevo;
      nuevo = new Nodo(entrada);
      nuevo.enlace = primero; //Enlaza el nuevo nodo al frente de la lista(lo apunta)
      primero = nuevo; //Mueve a primero y apunta al nodo nuevo
      return this; //Retorna la referencia del objeto lista
    }
    
    //Método para ver qué hay en nuestra lista
    public void visualizar(){
    
        Nodo n;
        int k = 0;
        n = primero;
        
        while(n != null){
        
            System.out.println(n.dato.toString()+" ");
            n = n.enlace;
            k++;
            System.out.print((k%15 != 0 ? " ": "\n") );
        }
    }
    
    //Método para insertar desde la cola
    public ClsLista insertarUltimo(String valorBuscarInsertar, ClsAlumno entrada){
    
        Nodo ultimo;
        ultimo = buscarLista(valorBuscarInsertar);
        ultimo.enlace = new Nodo(entrada);
        ultimo = ultimo.enlace;
        
        return this;
    }

    //Método para buscar un valor en la lista
    public Nodo buscarLista(String valorBuscar){
    
        Nodo indice;
        
        for (indice = primero; indice != null; indice = indice.enlace){
            if(valorBuscar.equals(indice.dato.carnet)){ //(valorBuscar.equals(indice.dato)) para datos String
                return indice;
            }
        }
        return null;
    }

    //Método para insertar en medio de la lista
    public ClsLista insertarLista(String valorBuscarInsertar, ClsAlumno entrada){
        Nodo nuevo, anterior;
        anterior = buscarLista(valorBuscarInsertar);
        if(anterior != null){
            nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }
    
    //Método para buscar por posición
    public Nodo buscarPosicion(int posicion){
        Nodo indice;
        int i;
        if(posicion < 0) return null;
        
        indice = primero;
        for(i = 1;(i < posicion)&&(indice !=null); i++){
            indice = indice.enlace;
        }
        return indice;
    }
    
    //Método para eliminar valores de la lista
    public void eliminar (String entrada){
    
        Nodo actual, anterior;
        boolean encontrado;
        //Inicializar los apuntadores
        actual = primero;
        anterior = null;
        encontrado = false;
        
        //Buscar en el nodo
        while((actual != null) && (!encontrado)){
            encontrado = (actual.dato.carnet.equals(entrada)); //equals
            if(!encontrado){
                anterior = actual;
                actual = actual.enlace;
            }
        }
        
        //Enlazar del nodo anterior con el siguiente nodo
        if(actual!= null){
            //Distingue que el nodo no sea la cabeza
            if(actual == primero){
                primero = actual.enlace;
            }else{
                anterior.enlace = actual.enlace;
            }
            actual = null; //Ya que es una variable local no es necesario.
        }
    }
}
