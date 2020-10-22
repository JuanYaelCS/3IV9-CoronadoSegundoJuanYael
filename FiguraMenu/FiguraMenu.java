import java.util.Scanner;
class FiguraMenu{

    public static void main(String[] args){

        

        Scanner entrada = new Scanner(System.in);
        int opcion=0,opcion1=0;
        int altura, base;
        double resultado;
        char inicio;
        
    do {
        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1.- Calcular area");
        System.out.println("2.- Calcular perimetro");
        System.out.println("Presione s para salir");

            inicio = entrada.next().charAt(0);

            if(inicio == 's'){
            System.exit(0); 
            } else {
            if(inicio == 'S'){
            System.exit(0); 
            } else {
            opcion1 =Integer.parseInt(String.valueOf(inicio));
            }
            }


        switch(opcion1){
           
        case 1:
            System.out.println("Eligio calcular area elija una figura");    
            System.out.println("1.- Calcular area de un cuadrado");
            System.out.println("2.- Calcular area de un triangulo");
            System.out.println("3.- Calcular area de un circulo");
            System.out.println("4.- Calcular area de un rectangulo");
            System.out.println("5.- Calcular area de un rombo");
            System.out.println("6.- Calcular area de un hexagono");
            System.out.println("7.- Salir");
    
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingresa el valor de un lado");
                    try {
                    base = entrada.nextInt();
                    resultado = base*base;
                    System.out.println("El area es de: "+resultado);
                    } catch (Exception e) {
                    System.out.println("Ingresa un numero entero positivo");
                    }
                    break;
    
                case 2:
                    System.out.println("Ingresa el valor de la base");
                    try{
                    base = entrada.nextInt();
                    System.out.println("Ingresa el valor de la altura");
                    altura = entrada.nextInt();
                    resultado = (base*altura)/2;
                    System.out.println("El area es de: "+resultado);
                    } catch (Exception e) {
                    System.out.println("Ingresa un numero entero positivo");
                    }
                    break;
    
                case 3:
                    System.out.println("Ingresa el valor del radio");
                    try{
                    base = entrada.nextInt();
                    resultado = 3.1416*(base*base);
                    System.out.println("El area es de: "+resultado);
                    } catch (Exception e) {
                    System.out.println("Ingresa un numero entero positivo");
                    }
                    break;
                case 4:
                    System.out.println("Ingresa el valor de la base");
                    try{
                    base = entrada.nextInt();
                    System.out.println("Ingresa el valor de la altura");
                    altura = entrada.nextInt();
                    resultado =(base*altura);
                    System.out.println("El area es de: "+resultado);
                    } catch (Exception e) {
                    System.out.println("Ingresa un numero entero positivo");
                    }
                    break;
                case 5:
                    System.out.println("Ingresa el valor de diagonal mayor");
                    try{
                    base = entrada.nextInt();
                    System.out.println("Ingresa el valor de diagonal menor");
                    altura = entrada.nextInt();
                    resultado = (base*altura)/2;
                    System.out.println("El area es de: "+resultado);
                    } catch (Exception e) {
                    System.out.println("Ingresa un numero entero positivo");
                    }
                    break;
                case 6:
                    System.out.println("Ingresa el perimetro");
                    try{
                    base = entrada.nextInt();
                    System.out.println("Ingresa la apotema");
                    altura = entrada.nextInt();
                    resultado = (base*altura)/2;
                    System.out.println("El area es de: "+resultado);
                    } catch (Exception e) {
                    System.out.println("Ingresa un numero entero positivo");
                    }
                    break;
                default:
                    System.out.println("Gracias por venir. nwn/");
            }
        break; 
    
        case 2:
            System.out.println("1.- Calcular perimetro de un cuadrado");
            System.out.println("2.- Calcular perimetro de un triangulo");
            System.out.println("3.- Calcular perimetro de un circulo");
            System.out.println("4.- Calcular perimetro de un rectangulo");
            System.out.println("5.- Calcular perimetro de un rombo");
            System.out.println("6.- Calcular perimetro de un hexagono");
            System.out.println("7.- Salir");

            opcion = entrada.nextInt();

            switch(opcion){
            case 1:
                System.out.println("Ingresa el valor de un lado");
                try{
                base = entrada.nextInt();
                resultado = base+base+base+base;
                System.out.println("El perimetro es de: "+resultado);
                } catch (Exception e) {
                System.out.println("Ingresa un numero entero positivo");
                }
                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                try{
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = (base*2+altura*2);
                System.out.println("El perimetro es de: "+resultado);
                } catch (Exception e) {
                System.out.println("Ingresa un numero entero positivo");
                }
                break;

            case 3:
                System.out.println("Ingresa el valor del radio");
                try{
                base = entrada.nextInt();
                resultado = 3.1416*(base*2);
                System.out.println("El perimetro es de: "+resultado);
                } catch (Exception e) {
                System.out.println("Ingresa un numero entero positivo");
                }
                break;
            case 4:
                System.out.println("Ingresa el valor de la base");
                try{
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = (base*2)+(altura*2);
                System.out.println("El perimetro es de: "+resultado);
                } catch (Exception e) {
                System.out.println("Ingresa un numero entero positivo");
                }
                break;
            case 5:
                System.out.println("Ingresa el valor de lado");
                try{
                base = entrada.nextInt();
                resultado = (base*4);
                System.out.println("El perimetro es de: "+resultado);
                } catch (Exception e) {
                System.out.println("Ingresa un numero entero positivo");
                }
                break;
            case 6:
                System.out.println("Ingresa el valor del lado");
                try{
                base = entrada.nextInt();
                resultado = (base*6);
                System.out.println("El perimetro es de: "+resultado);
                } catch (Exception e) {
                System.out.println("Ingresa un numero entero positivo");
                }
                break;
            default:
                System.out.println("Gracias por venir. nwn/");
            }
        break;
         
              
        }

    } while ((inicio != 's') && (inicio !='S'));
System.out.println("Bye");  
    }
}