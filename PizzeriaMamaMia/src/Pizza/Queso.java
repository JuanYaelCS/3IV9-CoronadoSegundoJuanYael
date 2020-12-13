package Pizza;

import java.util.Scanner;
import pizzeriamamamia.Menu;

public class Queso extends Pizza{
    public static int precio;
    String queso;
    public static int quesonumero;
    public Queso() {
    }

    public Queso(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[2];
        this.ingredientes[0] = "Parmesano";
        this.ingredientes[1] = "Mozzarela";
    }
    
    public String elegirtipoqueso(){
        
        Scanner entrada = new Scanner(System.in);
        do{
        System.out.println("Elije el queso que deseas");
        System.out.println("1.- Parmesano");
        System.out.println("2.- Mozzalera");
        
        try
        {
        queso = entrada.nextLine();
        quesonumero=Integer.parseInt(queso);

        }catch(NumberFormatException  ex){
         System.out.println("No es un numero");
         queso="";
        }finally{
             
        }
        }while((queso=="")||((quesonumero!=1)&&(quesonumero!=2)));
        this.quesonumero = quesonumero;
        
    return queso;
    }
    

    public int preciotamanoqueso(int quesonumero,int cantcortes){
        int preciotaman = 0;
        
        if(quesonumero == 1){
            
            if(cantcortes == 4){
                    preciotaman = 89;
            }else{
            if(cantcortes == 8){
                    preciotaman = 115;
            }else{
                if(cantcortes==12){
                    preciotaman = 135;
                }else{
                    preciotaman = 175;
                }
            }
        }
            
        }else{
        if(quesonumero == 2){
            
        if(cantcortes == 4){
                    preciotaman = 75;
            }else{
            if(cantcortes == 8){
                    preciotaman = 89;
            }else{
                if(cantcortes==12){
                    preciotaman = 112;
                }else{
                    preciotaman = 135;
                }
            }
        }
        
        
    }else{System.out.println("khee");}
    }
    this.precio+=preciotaman;
    return preciotaman;
    
    }
}
