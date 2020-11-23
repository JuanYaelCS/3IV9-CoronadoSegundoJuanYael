import java.util.*;
import javax.swing.JOptionPane;

public class Eje2{
    double lado,radio,altura;  
    public void menu(){
        int opcionm;
        opcionm=Integer.parseInt(JOptionPane.showInputDialog(null, "Se calculara el perimetro de:"
                                                        +"\nSeleccione una opcion"
                                                        +"\n1.-Circulo"
                                                        +"\n2.-Rectangulo"
                                                        +"\n3.-Cuadrado"
                                                        +"\n4.-Triangulo Equilatero"
                                                        +"\n5.-Salir"));
        switch(opcionm){
        case 1:
            ValoresCir();
            lado=radio;
            Circulo cir = new Circulo(lado,3.1416);
            cir.Area();
            cir.Perimetro();
        break;

        case 2:
            Base();
            Altura();
            Rectangulo rect = new Rectangulo(lado,altura);
            rect.Area();
            rect.Perimetro();
        break;

        case 3:
            Base();
            Cuadrado cua = new Cuadrado(lado);
            cua.Area();
            cua.Perimetro();
        break;
            
        case 4:
            Base();
            Altura();
            Triangulo tria = new Triangulo(lado,altura);
            tria.Area();
            tria.Perimetro();
        break;
        
    }

    }
    public double ValoresCir(){
    radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio"));
    return radio;
    
    }
    public double Base(){
        lado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));
        return lado;
    }
    public double Altura(){
        altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura"));
        return altura;
    }

}