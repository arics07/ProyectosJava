import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
      String tipoOp = pedirOperacion();
      operar(tipoOp);
    }

    public static String pedirOperacion(){  //entradas
        Scanner reader = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        System.out.println("==============================");

        System.out.println("Introduce la opción:");
        String tipoOperacion = reader.nextLine();
        return tipoOperacion;
    }

    public static double pedirNumero() {
        Scanner reader = new Scanner(System.in);  // recibo datos del usuario (lector)
        System.out.println("Ingrese un número: ");
        double numero = reader.nextInt();
        return numero;
    }

    public static void imprimirResultado(double resultado){ //salida
        System.out.println("El resultado es: " + resultado);
    }

    public static void operar(String tipoOp){
        switch (tipoOp) {
            case "1":
                sumar();
                break;
            case "2":
                restar();
                break;
            case "3":
                multiplicar();
                break;
            case "4":
                dividir();
                break;
            default:
                System.out.println("TIPO DE OPERACIÓN INVÁLIDA");
                break;
        }

    }

    public static void sumar(){
        Scanner reader = new Scanner(System.in);
        System.out.println("¿Cuántos números vas a sumar? ");
        int cantidad = reader.nextInt();
        int[] arreglo = new int[cantidad];

        for (int i=0; i<arreglo.length; i++) {
            System.out.println("Ingrese el dato " + (i+1) + ": ");
            arreglo[i] = reader.nextInt();
        }

        //imprimir el arreglo
        for (int i=0; i< arreglo.length-1; i++){
            System.out.print(arreglo[i] + " + ");
        }
        System.out.println(arreglo[arreglo.length-1]);

        //sumar los elementos del arreglo
        int sum = 0;
        for (int i=0; i< arreglo.length; i++){
            sum = sum + arreglo[i];
        }

        imprimirResultado(sum);

    }

    public static void restar(){
        Scanner reader = new Scanner(System.in);
        System.out.println("¿Cuántos números vas a restar? ");
        int cantidad = reader.nextInt();
        int[] arreglo = new int[cantidad];

        for (int i=0; i<arreglo.length; i++) {
            System.out.println("Ingrese el dato " + (i+1) + ": ");
            arreglo[i] = reader.nextInt();
        }

        //imprimir el arreglo
        for (int i=0; i< arreglo.length-1; i++){
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println(arreglo[arreglo.length-1]);

        //sumar los elementos del arreglo
        int resta = 0;
        for (int i=0; i< arreglo.length; i++){
            resta = resta - arreglo[i];
        }

        imprimirResultado(resta);
    }

    public static void multiplicar(){
        Scanner reader = new Scanner(System.in);
        System.out.println("¿Cuántos números vas a multiplicar? ");
        int cantidad = reader.nextInt();
        int[] arreglo = new int[cantidad];

        for (int i=0; i<arreglo.length; i++) {
            System.out.println("Ingrese el dato " + (i+1) + ": ");
            arreglo[i] = reader.nextInt();
        }

        //imprimir el arreglo
        for (int i=0; i< arreglo.length-1; i++){
            System.out.print(arreglo[i] + " x ");
        }
        System.out.println(arreglo[arreglo.length-1]);

        //multiplicar los elementos del arreglo
        int mult = 1;
        for (int i=0; i< arreglo.length; i++){
            mult = mult * arreglo[i];
        }

        //imprime el resultado
        imprimirResultado(mult);
    }

    public static void dividir(){
        double resultado = 0;
        double num1 = pedirNumero();
        double num2 = pedirNumero();
        if (num2 != 0) {
            resultado = num1 / num2;  //resultado de la división
        } else {
            System.out.println("La operación es inválida.");
        }
        System.out.println(resultado);
    }

}
