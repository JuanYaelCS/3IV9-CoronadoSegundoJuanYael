import java.time.*;
import java.util.*;
import java.util.Date.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Eje1{
 
    int dia,mes,anio;
    int day,month,year;
    
    public void Datos(){
        
        this.dia=Integer.parseInt(JOptionPane.showInputDialog("Ingese su dia de nacimiento en formato dd"));

        this.mes=Integer.parseInt(JOptionPane.showInputDialog("Ingese su mes de nacimiento en formato mm"));
        
        this.anio=Integer.parseInt(JOptionPane.showInputDialog("Ingese su anio de nacimiento en formato yyyy"));
        
    }

    public void Fechaa(){
        
        Date hoy = new Date();
        
        SimpleDateFormat formato1 = new SimpleDateFormat("dd");
        this.day = Integer.parseInt(formato1.format(hoy));
        
        SimpleDateFormat formato2 = new SimpleDateFormat("MM");
        this.month = Integer.parseInt(formato2.format(hoy));
        
        SimpleDateFormat formato3 = new SimpleDateFormat("YYYY");
        this.year = Integer.parseInt(formato3.format(hoy));
    }
    public void Calcu(){
       int aniosact = ((year-anio)-1);
       if (month >= mes ){
           if(day >= dia){
            JOptionPane.showMessageDialog(null, "Tiene "+(aniosact+1)+" anios");
           }else{
            JOptionPane.showMessageDialog(null, "Tiene "+(aniosact)+" anios");
            
           }
       }
    }
}
