import java.util.Scanner;

public class Ejercicios{

    Scanner entrada = new Scanner(System.in);

    //calculadora que tendra conversion de unidades
    //cuadritos y movimient

    public void menu(){

        char op;

        System.out.println("Bienvenidos a este programa");
        System.out.println("a.-calculadora");
        System.out.println("b.-conversion de unidades");
        System.out.println("c.-creacion de cuadros");
        System.out.println("d.-movimiento de cuadros");
    
        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                Calculadora();
                break;

            case 'b':
                Conversion();
                break;

            case 'c':
                Creacuadros();
                break;

            case 'd':
                MoviCuadros();
                break;

            default:
                break;
        }
    }

    public void Calculadora(){
    
        double numero = 0.00,suma =0.00, multi=0.00;
        char operacion,p;

        System.out.println("Seleccione la operacion deseada");
        System.out.println("a.-Suma y resta");
        System.out.println("b.-Multiplicacion");
        System.out.println("c.-Divison");

        operacion = entrada.next().charAt(0);
        
        switch (operacion) {
            case 'a':
                do{
                    System.out.println("Para para la operacion precione '0' ");
                    System.out.println("Ingrese el valor a sumar");
                    numero = entrada.nextDouble();

                    suma += numero;
                }while((numero!=0));
                System.out.println("La suma de los numeros es de: "+suma);
                break;
            case 'b':
                do{
                System.out.println("Para para la operacion precione '0' ");
                System.out.println("Ingrese el valor a multiplicar");
                numero = entrada.nextDouble();

                if(numero>0){
                    multi += numero;
                }else{
                    System.out.println("Solo positivos");
                }
                }while((numero!=0));
                System.out.println("La suma de los numeros es de: "+suma);
                break;
            case 'c':
                break;

            default:
                break;
        }

    }
    public void Conversion(){
    }
    public void Creacuadros(){
    }
    public void MoviCuadros(){
    }
}