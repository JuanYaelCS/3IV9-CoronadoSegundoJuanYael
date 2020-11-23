import javax.swing.JOptionPane;
public class Triangulo extends Figura{

    private double altura;
        
    
    public Triangulo(double lado,double altura){
        super(lado);
        this.altura=altura;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }

    public void Area(){
        double area = ((getAltura()*getLado())/2);
        JOptionPane.showMessageDialog(null,"El area es: "+area);
    }
    public void Perimetro(){
        double perimetro = (3*getLado());
        JOptionPane.showMessageDialog(null,"El perimetro es: "+perimetro);
    }
}