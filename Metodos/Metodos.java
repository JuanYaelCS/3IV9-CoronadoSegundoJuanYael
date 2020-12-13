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
                                                                    +"\n4.-Calcular sueldo del empleado"
                                                                    +"\n5.-Proovedores"
                                                                    +"\n6.-Libros"
                                                                    +"\n7.-Salir"));
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
        Empleado emp = new Empleado();
        Supervisor sup = new Supervisor();
        id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Id: "));
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        puesto = JOptionPane.showInputDialog(null, "Ingrese su puesto: ");
        emp.setId();
        emp.setNombre();
        emp.setPuesto();
        sup.setId();
        sup.setNombre();
        sup.setPuesto();
        if(puesto=="supervisor"){
            sueldo=8000;
            sueldo=(8000)-(8000*0.2)-(8000*0.1)-(8000*0.16);
            sup.setSueldo();
            sup.mostrar();
        } else {
            if(puesto=="empleado"){
            sueldo=5000;
            int Hd = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese sus horas extras diurnas: "));
            int HdT= (Hn*50);
            int Hn = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese sus horas extras nocturnas: "));
            int HnT= (Hn*60);
            sueldo=(5000)+(HdT+Hnt);
            emp.setSueldo();
            emp.mostrar();
        }
        }
        

        break;
        
        case 5:
        
        break;
        
        case 6:
        
        break;
        
        case 7:
        System.exit(0);
        break;
        }
    opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea repetir presione 0"));
         
    }while(opcion1==0);

    
}
   
}
