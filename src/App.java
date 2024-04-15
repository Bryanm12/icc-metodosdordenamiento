import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
         //Crear la instancia de la (clase u objeto) MetodosOrdenamiento
        MetodosOrdenamiento metodosOrdenamiento=new MetodosOrdenamiento();
        //Creo un arreglo de enteros int()

        int[]numeros={ 30, 7, 12, 5};

        //Mandar a imprimir mi arreglo
        //metodosOrdenamiento.imprime(numeros);

        //Llamo al metodo sortByBubble
        //int[] arreglosOrdenadoBuble=metodosOrdenamiento.sorbyBubble(numeros, false);
        //metodosOrdenamiento.imprime(arreglosOrdenadoBuble);

        /// TODO: Hacer un menu que elija el metodo

        int num;
        Scanner imprimirScanner=new Scanner(System.in);
        System.out.println("Introduzca -1- para el procedimiento o -2- para solo sacar la lista.");
        num=imprimirScanner.nextInt();
        if(num==1){
            int[] arreglosOrdenadoBuble=metodosOrdenamiento.sorbyBubble(numeros, false);
            

            if(num==2){
                metodosOrdenamiento.imprime(numeros);
                metodosOrdenamiento.imprime(arreglosOrdenadoBuble);
            }
        }
    }
}