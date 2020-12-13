package Pizza;

public class Peperonni extends Pizza{
    public static int precio;
    public Peperonni() {
    }

    public Peperonni(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "rodajas";
        this.ingredientes[1] = "Rodajas con Parmesano";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[3] = "Doble Peperoni en Rodajas";
    }
    public int preciotamanopepe(int cantcortes){
        
        int preciotaman;
       
        if(cantcortes == 4){
                    preciotaman = 96;
            }else{
            if(cantcortes == 8){
                    preciotaman = 119;
            }else{
                if(cantcortes==12){
                    preciotaman = 131;
                }else{
                    preciotaman = 167;
                }
            }
        }
        
        this.precio+=preciotaman;
    return preciotaman;
    }
}
