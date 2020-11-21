import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); 
        char fin;
        do{
        Arreglos arr = new Arreglos();
        arr.menu();
        System.out.println("Si desea repetir presione X");
        fin=leer.nextLine().charAt(0);
    }while((fin == 'x')||(fin == 'X'));
    
      
}
}