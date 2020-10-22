import java.util.*;

class Sumar2Numeros{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, acumulador;
        int resultado=0;

        do{
            System.out.println("Ingresa el primer numero a sumar: ");
            num1 = leer.nextInt();
            resultado = num1 + acumulador; 
        }while(num1!=0);

        System.out.println("La suma de los numeros es: " + resultado);
    }
}