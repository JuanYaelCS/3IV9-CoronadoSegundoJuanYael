import java.time.*;
import java.util.*;
import java.util.Date.*;
import javax.swing.JOptionPane;

public class Metodos{

    public static void main (String[] args){
    
    int opcion,opcion1;
    do{
    
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al programa"
                                                                    +"\nSeleccione una opcion"
                                                                    +"\n1.-Calcular la edad"
                                                                    +"\n2.-Perimetros y areas"
                                                                    +"\n3.-Compania telefononica"
                                                                    +"\n4.-Salir"));
        switch(opcion){
                case 1:
                
        Eje1 obj = new Eje1();
        obj.Datos();
        obj.Fechaa();
        obj.Calcu();
        break;

        case 2:
        Eje2 obj1 = new Eje2();
        obj1.menu();
        break;

        case 3:
        Eje3 obj2 = new Eje3();
        obj2.menu();        
        break;
                
        case 4:
        System.exit(0);
        break;
        }
    opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea repetir presione 0"));
         
    }while(opcion1==0);

    
}
   
}
