
public class MetodosOrdenamiento {
    ///1. Metodo que devuelve un arreglo de
    ///enteros ordenados por burbuja
    //Agregar una condicion que me imprima o no los pasos
    public int[] sorbyBubble(int[] arreglo, boolean logs){

        //Code sort
        //Obtener el tamano del arreglo
        int tamano = arreglo.length;
        
        //Bucle externo que va a recorrer todo el arreglo
        for(int i=0;i<tamano;i++){
            if(logs){
                System.out.println("\nPasasdo numero "+i);
            }

            //Bucle for interno que comparta el elemento actual con los siguientes
            for(int j=i+1;j<tamano;j++){
                System.out.println("i="+arreglo[i]+"j="+arreglo[j]);
                if(arreglo[i]>arreglo[j]){
                    //Intercambiamos los elementos
                    System.out.println("-Si es mayor asi que cambio");
                    int temporal=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;
                    System.out.print("");
                    imprime(arreglo);
                }
           

            }
            
        }
        return arreglo;

    }
    //2
    //3
    //4. Metodo que imprime un arreglo
    public void imprime(int[] arreglo){
        for(int i=0; i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
            
        }
        System.out.println();
    }
    
        
    
}
