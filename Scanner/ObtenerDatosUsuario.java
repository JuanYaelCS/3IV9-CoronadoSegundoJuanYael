import java.util.Scanner;

class ObtenerDatosUsuario{

    public static void main(String[] args){

    Scanner leer = new Scanner(System.in);
    String nombre;
    int edad;
    float beca;    

    System.out.println("Dime tu nombre:  ");
    nombre = leer.nextLine();
    System.out.println("Dime tu edad: ");    
    edad = leer.nextInt();    
    System.out.println("Tu beca es de que monto?: ");    
    beca = leer.nextFloat();

    System.out.println("Tu nombre es: "+nombre);
    System.out.println("Tu edad es: "+edad);
    System.out.println("Tu beca es de: "+beca);
}
}