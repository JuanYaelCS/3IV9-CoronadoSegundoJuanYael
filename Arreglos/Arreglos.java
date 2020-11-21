import java.util.Scanner;

public class Arreglos{
        Scanner entrada = new Scanner(System.in);        
        public void menu(){
        char op;
        System.out.println("Bienvenidos a este programa");
        System.out.println("a.-Ejercicio 1");
        System.out.println("b.-Ejercicio 2");
        System.out.println("c.-Ejercicio 3");
        System.out.println("d.-Ejercicio 4");
    
        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                Ejercicio1();
                break;

            case 'b':
                Ejercicio2();
                break;

            case 'c':
                Ejercicio3();
                break;

            case 'd':
                Ejercicio4();
                break;

            default:
                break;
        }
    }

    public void Ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        
        int i,j;
        double suma=0,resultado=0;
        double diez[] = new double[10];

        System.out.println("Ingrese 10 numeros enteros");
        System.out.println("Se calculara el promedio");
        
        for (i=0 ; i<diez.length; i++ ) {
        System.out.println("Ingrese un numero"); 
        diez[i] = entrada.nextDouble();
        }

        for(j=0; j<diez.length; j++){
        suma += diez[j];
        }
        resultado=suma/10;
        System.out.println(resultado);
    }
    public void Ejercicio2(){
        Scanner entrada = new Scanner(System.in);
        
        int i,j;
        double suma=0,resultado=0;
        double diez[] = new double[10];

        System.out.println("Ingrese 10 numeros enteros");
        System.out.println("Se calculara el promedio en posiciones pares");
        
        for (i=0 ; i<diez.length; i++ ) {
        System.out.println("Ingrese un numero"); 
        diez[i] = entrada.nextDouble();
        }

        for(i=0; i<diez.length; i++){
            if(i==0){suma += diez[i];
            }else{
                if(i%2==0){suma += diez[i];}
            }

        }
        resultado=(suma/5);
        System.out.println(resultado);
    }
    public void Ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        
        int i,j,k=0,apro=0,repro=0;
        double mayor=0,menor=0;
        double suma=0,suma2=0,resultado=0;
        double diez[] = new double[10];

        System.out.println("Ingrese 10 calificaciones");
        
        for (i=0 ; i<diez.length; i++ ) {
        System.out.println("Ingrese su calificacion "+(i+1)); 
        diez[i] = entrada.nextDouble();
        }
        for (i=0 ; i<diez.length; i++ ) {
            System.out.println("Calificacion "+(i+1)+": "+diez[i]); 
           
        }

        for(j=0; j<diez.length; j++){
        suma += diez[j];
        }
        resultado=suma/10;
        System.out.println("\nPromedio: "+resultado);
        
        for(j=0; j<diez.length; j++){
            
            if(diez[j]>mayor){
            mayor = diez[j];
            }
        }
        menor = mayor;
        System.out.println("\nLa mayor calificacion es: "+mayor);
        for(j=0; j<diez.length; j++){
        if((diez[j]<mayor)&&(diez[j]<menor)){
            menor =diez[j];
        }
        }
        System.out.println("\nLa menor calificacion es: "+menor);
        for(j=0; j<diez.length; j++){
            if(diez[j]>resultado){
                k += 1;
            }
        }
        System.out.println("\n"+k+" Calificaciones arriba del promedio");
        for(j=0; j<diez.length; j++){
            if(diez[j]<6){
                repro += 1;
            }else{
                apro += 1;
            }
        }
        System.out.println("\n"+"Aprobados="+apro+" Reprobados="+repro);

    }
    public void Ejercicio4(){
        Scanner entrada = new Scanner(System.in);
        
        int i,j,k;
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int S[][] = new int[3][3];
   
        System.out.println("LLennara la primera matriz");
        for(i = 0; i<A.length; i++){
         
            for(j = 0; j<A.length; j++){
              
                System.out.println("Ingresa el valor de la fila: "
                + (i+1) + " y la columna : "+ (j+1) + " ");
               
                A[i][j]=entrada.nextInt();
            }
        }
        System.out.println("\nLLennara la segunda matriz");
        for(i = 0; i<B.length; i++){
         
            for(j = 0; j<B.length; j++){
                
                System.out.println("Ingresa el valor de la fila: "
                + (i+1) + " y la columna : "+ (j+1) + " ");
               
                B[i][j]=entrada.nextInt();
            }
        }
        for(i = 0; i<S.length; i++){
         
            for(j = 0; j<S.length; j++){
                S[i][j] = (A[i][j] + B[i][j]);
            }
        } 
         
        System.out.println("\nLa matriz A Y B sumadas son S");
        System.out.println("La matriz S es:");
        for(i = 0; i<S.length; i++){
         
            for(j = 0; j<S.length; j++){
               System.out.print(S[i][j]);
            }
            System.out.println("");
        }
    }
}