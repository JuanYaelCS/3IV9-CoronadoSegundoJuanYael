package pizzeriamamamia;

import java.util.Scanner;
import Pizza.*;

public class Menu {
    int cantcortes;
    String queso="";
    
    Scanner entrada = new Scanner(System.in);
    int opc;
    public void MenuOperaciones(){
        
        do{

        Pizza piza = null;
        
        System.out.println("Bienvenidos a la Pizzeria Los Tacos");
        System.out.println("¿Que desea ordenar?");
        System.out.println("1.- Pizza de Queso");
        System.out.println("2.- Pizza de Peperoni");
        System.out.println("3.- Pizza de Vegetariana");
        System.out.println("4.- Pagar");
        
        try
        {
        opc = Integer.parseInt(entrada.nextLine());
        
        }catch(NumberFormatException  ex){
         System.out.println("No es un numero");
         opc=5;
        }finally{
             
        }
        
        
        switch(opc){
            case 1:
             
                piza = new Queso();
                
                Queso ques = new Queso();
                ques.elegirtipoqueso();
                preguntatamano();
                ques.preciotamanoqueso(Queso.quesonumero,cantcortes);
                piza.hornear();
                piza.cortar(cantcortes);
                piza.empacar();
                break;
            case 2:
                piza = new Peperonni();
                Peperonni pepe = new Peperonni();
                preguntatamano();
                pepe.preciotamanopepe(cantcortes);
                piza.hornear();
                piza.cortar(cantcortes);
                piza.empacar();
                
                break;
            case 3: 
                piza = new Vegetariana();
                Vegetariana vege = new Vegetariana();
                preguntatamano();
                vege.preciotamanovege(cantcortes);
                piza.hornear();
                piza.cortar(cantcortes);
                piza.empacar();
                break;
            default:
            
            case 4:
                pagar();
                
            break;
        }
        
        System.out.println("¿Quiere comprar otra pizza?");
        System.out.println("1.-Si");
        System.out.println("2.-No");
        try
        {
        opc = Integer.parseInt(entrada.nextLine());
        
        }catch(NumberFormatException  ex){
         System.out.println("No es un numero");
         pagar();
        }finally{
             
        }
        
        }while(opc == 1);
        pagar();
       
    }

    public int preguntatamano() {
      String eleccion; 
      int eleccionnum=0;
    do{
        System.out.println("¿De que tamano seria la pizza?");
        System.out.println("1.- chica");
        System.out.println("2.- mediana");
        System.out.println("3.- grande");
        System.out.println("4.- familiar");
        try
        {
        eleccionnum = Integer.parseInt(entrada.nextLine());
        
        }catch(NumberFormatException  ex){
         System.out.println("No es un numero");
        }finally{
             cantcortes=0;
        }
        if(eleccionnum == 1){
            cantcortes=4;
        }else{
            if(eleccionnum == 2){
                cantcortes=8;
            }else{
                if(eleccionnum==3){
                    cantcortes=12;
                }else{
                    if(eleccionnum==4){
                    cantcortes=16;
                    }else{
                        cantcortes=0;
                        System.out.println("Ingrese una opcion valida");
                    }
                }
            
            }
        }
    }while(cantcortes == 0);
            
    
    return cantcortes;
    }

    
    
    
    public int pagar() {
        
    if((Queso.precio!=0)||(Peperonni.precio!=0)||(Vegetariana.precio!=0)){
        System.out.println("Tiene que pagar: $"+(Queso.precio+Peperonni.precio+Vegetariana.precio));
        System.out.println("Hasta luego gracia por su compra UwU");
        System.exit(0);
    }else{
        System.out.println("No compro nada, Hasta luego");
    }
    
    return 0;
    }

}
