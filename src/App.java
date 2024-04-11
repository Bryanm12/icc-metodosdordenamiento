public class App {
    public static void main(String[] args) throws Exception {
         //Crear la instancia de la (clase u objeto) MetodosOrdenamiento
        MetodosOrdenamiento metodosOrdenamiento=new MetodosOrdenamiento();
        //Creo un arreglo de enteros int()

        int[]numeros={ 30, 7, 12, 5};

        //Mandar a imprimir mi arreglo
        metodosOrdenamiento.imprime(numeros);

        //Llamo al metodo sortByBubble
        int[] arreglosOrdenadoBuble=metodosOrdenamiento.sorbyBubble(numeros, false);
        //metodosOrdenamiento.imprime(arreglosOrdenadoBuble);

        /// TODO: Hacer un menu que elija el metodo
        metodosOrdenamiento.imprimir();
    }
}