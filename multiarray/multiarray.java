import javax.swing.JOptionPane;

public class multiarray{
    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Introduce el tamaño del arreglo");

        int tamanio = Integer.parseInt(texto);
        
        int array1[] = new int[tamanio];
        int array2[];

        //relleno de numeros aleatorios
        //array indice inicial e incdice final
       
        

        array1 = new int[tamanio];

        rellenarNumAleatorioArray(array1,10,100);
        
        array2 = array1;


        int array3[] = multiplicador(array1,array2);
        
        System.out.println("Los datos del arreglo 1: ");
        
        mostrarArray(array1);
        
        System.out.println("Los datos del arreglo 2: ");
        
        mostrarArray(array2);
        
        System.out.println("Los datos del arreglo 3: ");
        
        mostrarArray(array3);

    }
        public static void rellenarNumAleatorioArray(int lista[],int a,int b){
            for(int i = 0;i<lista.length;i++){
                lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
            }
        }
        public static void mostrarArray(int lista[]){
            for(int i=0;i<lista.length;i++){
                System.out.println("En la posicion "+i+" esta el valor"+lista[i]);

            }

        }

        public static int[] multiplicador(int array1[],int array2[]){
            int array3[] = new int[array1.length];
            for(int i =0;i<array1.length;i++){
                array3[i]=array1[i]*array2[i];

            } 
        return array3;
        }
}