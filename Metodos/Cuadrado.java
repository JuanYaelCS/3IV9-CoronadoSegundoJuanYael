import javax.swing.JOptionPane;
public class Cuadrado extends Figura{

    
    public Cuadrado(double lado){
        super(lado);
    }
    
    public void Area(){
        double area = (getLado()*getLado());
        JOptionPane.showMessageDialog(null,"El area es: "+area);
    }
    public void Perimetro(){
        double perimetro = (4*getLado());
        JOptionPane.showMessageDialog(null,"El perimetro es: "+perimetro);
    }
}