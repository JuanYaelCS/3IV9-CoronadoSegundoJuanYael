import java.util.*;

public class Operaciones{

    Scanner entrada = new Scanner(System.in);
    int y;

    public void Ejemplo(){
        try {
            System.out.println("Ingresa un valor numerico");
            y = entrada.nextInt();
            System.out.println("El valor fue: "+y);
            System.exit(0); 
                }catch(Exception e){
                    System.out.println("Ingresa solo numeros enteros");
                    System.out.println("El tipo de error: "+e.getMessage());

        }
    }
    public void Otrometodo(){
        System.out.println("Hola muno mundito mundial");
    }

}