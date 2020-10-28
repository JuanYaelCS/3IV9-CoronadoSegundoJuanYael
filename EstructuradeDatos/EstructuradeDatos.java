import java.util.*;

class EstructuradeDatos{

    public static void main(String[] args){

    Scanner leer=new Scanner(System.in);
    
    int opcion, edad,abono,numerod,opcion2,numeros,n,n2,n3,n4,posit=0,nega=0,fare,repit=0,f,nmc7;
    double op1,op2,op3,r1, r2, r3,numero,digit,celc,kel,rank;
    char si;
    double a,b,c,d;
    
    
do{
    System.out.println("3IV9-CORONADO-SEGUNDO-JUAN-YAEL");
    System.out.println("Menu de estructura de datos");
    System.out.println("Elija una opcion");
    System.out.println("1.-Abono segun la edad");
    System.out.println("2.-Conversion de decimal a binario");
    System.out.println("3.-Conversion de temperatura");
    System.out.println("4.-Contador de numeros positivos y negativos");
    System.out.println("5.-Factura");
    System.out.println("6.-Areas, perimetros y volumenes");
    System.out.println("7.-Tabla");
    System.out.println("8.-Lectura de un entero no negativo y su factorial");
    System.out.println("9.-Lectura de lados de un cuadrado");
    System.out.println("10.-Lectura e impresion de un cuadrado hueco");
    System.out.println("11.-Lectura e impresion de un patron");
    System.out.println("12.-Lectura e impresion de diamante");
    System.out.println("13.-Calculadora");
    System.out.println("14.-Salir");

    opcion=leer.nextInt();

    switch(opcion){
    case 1:
        do{
        System.out.println("Ingrese su edad");
        edad=leer.nextInt();
        System.out.println("Ingrese su abono");
        abono=leer.nextInt();
        if (edad>65){
        op1 = abono*0.40;
        r1 = abono-op1;
        System.out.println("Su abono es de: "+r1);
        }else{
        if(edad<21){
        System.out.println("¿Sus padres son socios?");
        System.out.println("Presione s de si");
        si=leer.next().charAt(0);   
        if(si=='s' || si=='S'){          
        op2 = abono*0.45;
        r2 = abono-op2;
        System.out.println("Su abono es de: "+r2);
        }else{
        op3 = abono*0.25;
        r3 = abono-op3;
        System.out.println("Su abono es de: "+r3);
        }
        }
        }
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;
   
    case 2:
        do{  
            int dec=25;
            String binario="";
            System.out.println("Escriba el numero decimal");
            
            dec = leer.nextInt();
            

            while(dec>0){
                binario=(dec%2)+binario;
                dec/=2;
            }
            System.out.println(binario);
                  
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;
            
            
    case 3:
        do{
        System.out.println("Elija el tipo de conversion que desea hacer");
        System.out.println("1.- Fahrenheit a Celcius");
        System.out.println("2.- Fahrenheit a Kelvine");
        System.out.println("3.- Fahrenheit a Rankine");
        
        opcion2=leer.nextInt();
        
        switch(opcion2){
        
        case 1:
            System.out.println("Ingrese los grados Fahrenheit");
            fare = leer.nextInt();
            celc = ( (fare-32)*(5) ) / (9) ;
            System.out.println(fare + " en celcius son: "+celc);
        break;

        case 2:
            System.out.println("Ingrese los grados Fahrenheit");
            fare = leer.nextInt();
            kel = ((5)*(fare-32) / 9) + 273.15;
            System.out.println(fare + " en kelvin son:"+kel);
        break;

        case 3:
            System.out.println("Ingrese los grados Fahrenheit");
            fare = leer.nextInt();
            rank = (fare + 459.67);
            System.out.println(fare + " en rankine son :"+rank);
        break;

        }
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;
    
    case 4:
        do{
        System.out.println("¿Cuantos numeros ingresara?");
        numeros = leer.nextInt();
        
        do{
        System.out.println("Inserte un numero");
        n = leer.nextInt();
        if(n == 0){
        posit = posit + 0;
        } else { 
        if(n > 0){
        posit = posit + 1 ;
        }else{
        nega = nega + 1;
        }
        }
        numeros = numeros-1;
        }while (numeros!=0);
        System.out.println("Ingreso "+ posit + " positivos");
        System.out.println("Y "+nega + " negativos");
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;
    
    case 5:
        int prod,i;
        double fac,prc ;
        do{
        do{    
        System.out.println("Cuantos productos desea ingresar?");
        prod = leer.nextInt();
        if(prod<0){
            System.out.println("Porfavor ingrese un numero positivo");
        }
        }while(prod<0);
        fac = 0.00;
        for (i=1;i<=prod;i++){
            do{
                System.out.println("Ingrese el precio del producto "+i);
                prc = leer.nextDouble();
                if(prc<0){
                    System.out.println("Porfavor ingrese un valor positivo");
                }else{
                    fac = fac+prc;
                }
            }while(prc<0);
        }
        System.out.println();
        System.out.println("Productos comprados: " + prod);
        System.out.println("Factura:" + fac);
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;

    case 6:
        int l=0;
        do{
        do{
        System.out.println("Elija que hacer");
        System.out.println("1.-Area y perimetro de un rectangulo");
        System.out.println("2.-Area y perimetro de un triangulo");
        System.out.println("3.-Volumen de una esfera y un cilindro");
        opcion = leer.nextInt();
        
        switch(opcion){
        
        case 1:
            
            do{
            System.out.println("Ingrese la base");
            a = leer.nextDouble();
            System.out.println("Ingrese la altura del cilindro");
            b = leer.nextDouble();
            if((a<0)||(b<0)){
            System.out.println("Ingrese un numero positivo");
            }
            }while((a<0)||(b<0));
            c = (b*2)+(a*2);
            d = a*b;
            System.out.println("El perimetro es: "+c);
            System.out.println("El area es: "+d);
            l = 1;
        break;

        case 2:
            do{
            System.out.println("Ingrese la base");
            a = leer.nextDouble();
            System.out.println("Ingrese la altura");
            b = leer.nextDouble();
            if((a<0)||(b<0)){
            System.out.println("Ingrese un numero positivo");
            }
            }while((a<0)||(b<0));
            c = a*3;
            d = a*b;
            System.out.println("El perimetro es: "+c);
            System.out.println("El area es: "+d);
        break;
        case 3:
            do{
            System.out.println("Ingrese el radio");
            a = leer.nextDouble();
            System.out.println("Ingrese la altura");
            b = leer.nextDouble();
            if((a<0)||(b<0)){
            System.out.println("Ingrese un numero positivo");
            }
            }while((a<0)||(b<0));
            c = (3.1416*(a*a))*b;
            d = (4*3.1416*(a*a*a))/3;
            System.out.println("El volumen del cilindro es: "+c);
            System.out.println("El volumen de la esfera: "+d);
            l = 1;
        break; 

        default:
        System.out.println("Porfavor ingrese un valor valido");
        break;

        }
        }while(l!=1);                      
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;

    case 7:
        do{
        do{
        System.out.println("Ingrese las filas de la tabla");
        f = leer.nextInt();
        if(f <= 0){
        System.out.println("Escriba un numero mayor que cero");
        }
        }while(f <=0 );
        for(nmc7=1;nmc7<=f;++nmc7){
        System.out.print(" "+nmc7+" ");
        System.out.print(" "+(nmc7*10)+" ");
        System.out.print(" "+(nmc7*100)+" ");
        System.out.println(" "+(nmc7*1000));
        }
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;

    case 8:
        do{
        do{
        System.out.println("Ingrese un numero");
        n = leer.nextInt();
        if(n < 0){
        System.out.println("Ingrese un numero positivo");
        }}while(n < 0);
        n2 = 1;
        if(n>0){
        for(n3=1;n3<=n;++n3){
        n2 = n2*n3;
        }
        } 
        System.out.println("El factorial de "+n+" es : "+n2);                                    
        do{
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;

    case 9:
        do{
        do{
        System.out.println("Ingrese el valor de un lado");
        n = leer.nextInt();
        System.out.println();
        if((n >20)||(n<1)){
        System.out.println("Ingrese un numero entre 1 y 20");
        }}while((n>20)||(n<1));
        for(n2 = 1;n2 <= n; ++ n2){
        for(n3 = 2;n3 <= n; ++n2){
        System.out.print("*");}
        System.out.println("*");}
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;

    case 10:
        do{
        do{
        System.out.println("Ingrese el valor de un lado");
        n = leer.nextInt();
        System.out.println();
        if((n > 20) || (n < 1)){
        System.out.println("Por favor ingrese un numero entre 1 y 20");
        }}while((n > 20) || (n < 1));
        if(n == 1){
        System.out.print("*");
        }else{
        for(n2 = 2;n2 <= n; ++ n2){
        System.out.print("*");}
        System.out.println("*");
        for(n3 = 3;n3 <= n;++ n3){
        System.out.print("*");
        for(n2 = 3;n2 <= n;++ n2){
        System.out.print(" ");}
        System.out.println("*");}
        for(n2 = 1;n2 <= n;++ n2){
        System.out.print("*");
        }}
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;
         
    case 11:
        do{
        do{
        System.out.println("Ingrese la cantidad de filas");
        n = leer.nextInt();
        System.out.println();
        if(n < 1){
        System.out.println("Ingrese un numero positivo");
        }
        }while(n < 1);
        for(n2 = 1;n2 <= n; ++n2){
        n3 = n2 % 2;
        if(n3 == 0){
        System.out.print(" ");
        }
        for(n4 = 2;n4 <= n;++ n4){
        System.out.print("*");}
        System.out.println("*");}  
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;

    case 12:
        do{
        do{
        System.out.println("Ingrese el tamaño");
        n = leer.nextInt();
        System.out.println();
        if(n < 1){
        System.out.println("Ingrese un numero positivo");
        }
        }while(n < 1);
        for(n2 = 1;n2 <= n;++n2){
        for(n3 = n-n2;n3 > 0;--n3){
        System.out.print(" ");}
        for(n4 = 1;n4 < 2*n2;++n4){
        System.out.print("*");}
        System.out.println(" ");}
        for(n2 = n-1;n2 >= 1;--n2){
        for(n3 = n-n2;n3 >0;--n3){
        System.out.print(" ");}
        for(n4 = 1;n4 <2*n2;++n4){
        System.out.print("*");}
        System.out.println(" ");}                                          
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;

    case 13:
        String s;
        
        do{                       
            System.out.println("Simbolos para operaciones");
            System.out.println("+.- Suma");
            System.out.println("-.- Resta");
            System.out.println("*.- Multiplicacion");
            System.out.println("/.- Division");
            System.out.println("=.- Resultado");
            System.out.println(); 
            a = leer.nextDouble();
            b = a;
        do{
        s = leer.next();                   
        switch(s){
        case "+":
        a = leer.nextDouble(); 
        b = b+a;
        break;
        case "-":
        a = leer.nextDouble(); 
        b = b-a;
        break;

        case "*":
        a = leer.nextDouble(); 
        b = b*a;
        break;

        case "/":
        a = leer.nextDouble(); 
        b = b/a;
        break;

        case "=":
        a = 0.0;
        break;
        default:
        System.out.println("Caracter no valido");
        break;

        }
        System.out.println();
        }while(a!=0);
        System.out.println("El resultado es: "+b);                          
        do{                                   
            System.out.println();
            System.out.println("1.- Repetir");
            System.out.println("2.- Menu principal");
            System.out.println("3.- Salir");
            repit = leer.nextInt();
            System.out.println();
            if((repit!=3)&&(repit!=2)&&(repit!=1)){
            System.out.println("Ingrese un valor valido");
            }
            }while((repit!=3)&&(repit!=2)&&(repit!=1));
            if(repit==3){
            System.out.println("Byeee UuUr");
            }
            }while((repit!=2)&&(repit!=3));
    break;


    case 14:
        System.out.println("Byeee UuUr");
        System.exit(0);
    break;
     
    default:                  
    System.out.println("Ingrese un valor valido");
    break;
    }
}while((opcion!=14)&&(repit!=3));
}
}