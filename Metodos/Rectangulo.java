import javax.swing.JOptionPane;
public class Rectangulo extends Figura{

    private double altura;
        
    
    public Rectangulo(double lado,double altura){
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
        double area = (getAltura()*getLado());
        JOptionPane.showMessageDialog(null,"El area es: "+area);
    }
    public void Perimetro(){
        double perimetro = ((2*getAltura())*(2*getLado()));
        JOptionPane.showMessageDialog(null,"El perimetro es: "+perimetro);
    }
}