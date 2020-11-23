import javax.swing.JOptionPane;
public class Circulo extends Figura{

    private double pi=0;
        
    
    public Circulo(double lado,double pi){
        super(lado);
        this.pi=pi;
    }
    public double getPi(){
        return pi;
    }
    
    public void setPi(double pi){
        this.pi = pi;
    }

    public void Area(){
        double area = (getPi()*(getLado()*getLado()));
        JOptionPane.showMessageDialog(null,"El area es: "+area);
    }
    public void Perimetro(){
        double perimetro = ((2*getPi())*getLado());
        JOptionPane.showMessageDialog(null,"El perimetro es: "+perimetro);
    }
}