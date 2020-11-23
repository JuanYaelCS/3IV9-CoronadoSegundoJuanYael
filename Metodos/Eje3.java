import javax.swing.JOptionPane;
import java.time.*;
import java.util.*;
import java.util.Date.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Eje3{
    String numeromio ="551234567890";
    double credito=10;;
    String numll; 

    public void menu(){
        int opcion;
        do{
        JOptionPane.showMessageDialog(null,"Bienvenido a Telmexico"
                                        +"\nSu numero es "+numeromio);
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opcion"
                                                        +"\n1.-Llamar"
                                                        +"\n2.-Consultar credito"
                                                        +"\n3.-Salir"));
        
        switch(opcion){
        
        case 1:
            Llamar();
        break;

        case 2:
        JOptionPane.showMessageDialog(null,"Eligio consultar credito"
                                    +"\nCredito actual: "+credito);
        break;
        }
        }while(opcion!=3);
    }

    public void Llamar(){
        int hora,minutos,segundos;
        int opcion1;
        opcion1=Integer.parseInt(JOptionPane.showInputDialog(null,"\nSeleccione una opcion"
                                                        +"\n1.-Llamada Nacional"
                                                        +"\n2.-Llamada Internacional"
                                                        +"\n3.-Llamada a Celular"
                                                        +"\n4.-Salir"));
        
        switch(opcion1){
                case 1:
                    double tarifaN=0.5;
                    String nacional =JOptionPane.showInputDialog(null,"Ingresa el numero");
                    
                    if (credito<0.5){
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                    }else{
                        JOptionPane.showMessageDialog(null,"LLamando");
                    
                    Date inicio = new Date();
                   
                    DateFormat formato1 = new SimpleDateFormat("HH");
                    hora = Integer.parseInt(formato1.format(inicio));
                    
                    DateFormat formato2 = new SimpleDateFormat("mm");
                    minutos = Integer.parseInt(formato2.format(inicio));
                    
                    
                    String colgar =JOptionPane.showInputDialog(null,"Para colgar presione X");

                    Date finalll = new Date();
                   
                    DateFormat formato3 = new SimpleDateFormat("HH");
                    int horaf =hora-( Integer.parseInt(formato3.format(finalll)));
                    DateFormat formato4 = new SimpleDateFormat("mm");
                    int minutosf =  minutos-Integer.parseInt(formato4.format(finalll));

                    if(horaf >=1 ){
                        
                        minutosf += (horaf*60);
                        JOptionPane.showMessageDialog(null,"Llamada finalizada"
                                                        +"\nHablo a:" +nacional
                                                        +"\nCosto total de la llamada:"+(minutosf*tarifaN)
                                                        );
                        credito= credito-(minutosf*tarifaN);
                    }else{if(minutosf<=1){
                            JOptionPane.showMessageDialog(null,"Llamada finalizada"
                                                        +"\nHablo a: " +nacional
                                                        +"\nCosto total de la llamada:"+(tarifaN)
                                                    );
                        credito = credito-tarifaN;
                    }else{
                        JOptionPane.showMessageDialog(null,"Llamada finalizada"
                                                        +"\nHablo a: " +nacional
                                                        +"\nCosto total de la llamada:"+(minutosf*tarifaN)
                                                        );
                        credito= credito-(minutosf*tarifaN);
                    }}}
                    
                break;
    
                case 2:
                    double tarifaI=0.6;
                    String inacional =JOptionPane.showInputDialog(null,"Ingresa el numero");
                
                    if (credito<0.6){
                    JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                    }else{
                    JOptionPane.showMessageDialog(null,"LLamando");
                
                    Date inicio = new Date();
               
                    DateFormat formato1 = new SimpleDateFormat("HH");
                    hora = Integer.parseInt(formato1.format(inicio));
                
                    DateFormat formato2 = new SimpleDateFormat("mm");
                    minutos = Integer.parseInt(formato2.format(inicio));
                
                
                    String colgar =JOptionPane.showInputDialog(null,"Para colgar presione X");

                    Date finalll = new Date();
               
                    DateFormat formato3 = new SimpleDateFormat("HH");
                    int horaf =hora-( Integer.parseInt(formato3.format(finalll)));
                    DateFormat formato4 = new SimpleDateFormat("mm");
                    int minutosf =  minutos-Integer.parseInt(formato4.format(finalll));

                    if(horaf >=1 ){
                    
                    minutosf += (horaf*60);
                    JOptionPane.showMessageDialog(null,"Llamada finalizada"
                                                    +"\nHablo a:" +inacional
                                                    +"\nCosto total de la llamada:"+(minutosf*tarifaI)
                                                    );
                    credito= credito-(minutosf*tarifaI);
                    }else{if(minutosf<=1){
                        JOptionPane.showMessageDialog(null,"Llamada finalizada"
                                                    +"\nHablo a: " +inacional
                                                    +"\nCosto total de la llamada:"+(tarifaI)
                                                );
                    credito = credito-tarifaI;
                    }else{
                    JOptionPane.showMessageDialog(null,"Llamada finalizada"
                                                    +"\nHablo a: " +inacional
                                                    +"\nCosto total de la llamada:"+(minutosf*tarifaI)
                                                    );
                    credito= credito-(minutosf*tarifaI);
                    }}}
                break;
    
                case 3:
                    double tarifaC=0.2;
                    String celular  =JOptionPane.showInputDialog(null,"Ingresa el numero");
                
                    if (credito<0.2){
                    JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                    }else{
                    JOptionPane.showMessageDialog(null,"LLamando");
                
                    Date inicio = new Date();
               
                    DateFormat formato1 = new SimpleDateFormat("HH");
                    hora = Integer.parseInt(formato1.format(inicio));
                
                    DateFormat formato2 = new SimpleDateFormat("mm");
                    minutos = Integer.parseInt(formato2.format(inicio));
                
                
                    String colgar =JOptionPane.showInputDialog(null,"Para colgar presione X");

                    Date finalll = new Date();
               
                    DateFormat formato3 = new SimpleDateFormat("HH");
                    int horaf =hora-( Integer.parseInt(formato3.format(finalll)));
                    DateFormat formato4 = new SimpleDateFormat("mm");
                    int minutosf =  minutos-Integer.parseInt(formato4.format(finalll));

                    if(horaf >=1 ){
                    
                    minutosf += (horaf*60);
                    JOptionPane.showMessageDialog(null,"Llamada finalizada"
                                                    +"\nHablo a:" +celular
                                                    +"\nCosto total de la llamada:"+(minutosf*tarifaC)
                                                    );
                    credito= credito-(minutosf*tarifaC);
                    }else{if(minutosf<=1){
                        JOptionPane.showMessageDialog(null,"Llamada finalizada"
                                                    +"\nHablo a: " +celular
                                                    +"\nCosto total de la llamada:"+(tarifaC)
                                                );
                    credito = credito-tarifaC;
                    }else{
                    JOptionPane.showMessageDialog(null,"Llamada finalizada"
                                                    +"\nHablo a: " +celular
                                                    +"\nCosto total de la llamada:"+(minutosf*tarifaC)
                                                    );
                    credito= credito-(minutosf*tarifaC);
                    }}}
                break;
    }
}
}