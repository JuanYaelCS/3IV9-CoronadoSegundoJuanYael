import javax.swing.JOptionPane;

public class Supervisor extends Trabajador{

    private String puesto="";
    private int sueldo;
    
    public Supervisor(int id,String nombre,String puesto,int sueldo){
        super(id,nombre);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
    public String getPuesto(){
        return puesto;
    } 
    public void setPuesto(){
        this.puesto = puesto;
    }
    public int getSueldo(){
        return sueldo;
    }
    public void setSueldo(){
        this.sueldo = sueldo;
    }
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"El Id es: "+id
                                        +"\nEl nombre es: "+nombre
                                        +"\nEl puesto es: "+puesto
                                        +"\nEl sueldo es: "+sueldo);
    }
}