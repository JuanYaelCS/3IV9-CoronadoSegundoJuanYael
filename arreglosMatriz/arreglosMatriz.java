import java.util.*;

public class arreglosMatriz{
    public static void main(String[] args){

    //   int arreglo[] = new int [10];

      //  for(int i = 5; i<arreglo.length;i++){
        //    System.out.println("Magia: " +arreglo[i]);
        
    Scanner entrada = new Scanner(System.in);
    int matriz[][] = new int [3][3];
    
    float sumarfilas = 0;
    
    for(int i =0; i<matriz.length; i ++){
        for(int j =0; j<matriz.length; j++){

        System.out.println("Ingresa el valor de la fila: "
        +i+" y la columna : " +j+"");
        matriz[i][j]=entrada.nextInt();
        }

    }
    for(int i =0;i<matriz.length;i++){
        sumarfilas=0;
        for(int j=0;j<matriz.length;j++){
            sumarfilas += matriz[i][j];
            System.out.print(String.format("%d",matriz[i][j]));
        }
        System.out.println(String.format("\nSumar de las filas: %f,Promedio de la fila: %f",sumarfilas,sumarfilas/matriz.length));
    }
    
    
    }
        
    }
