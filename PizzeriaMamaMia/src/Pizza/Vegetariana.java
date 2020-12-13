package Pizza;

public class Vegetariana extends Pizza{
    public static int precio;
    public Vegetariana() {
    }

    public Vegetariana(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Champiñones";
        this.ingredientes[1] = "Piña";
        this.ingredientes[2] = "Pimiento";
        this.ingredientes[3] = "Elote";
    }
    public int preciotamanovege(int cantcortes){
        
        int preciotaman;
       
        if(cantcortes == 4){
                    preciotaman = 88;
            }else{
            if(cantcortes == 8){
                    preciotaman = 97;
            }else{
                if(cantcortes==12){
                    preciotaman = 111;
                }else{
                    preciotaman = 157;
                }
            }
        }
        
        this.precio+=preciotaman;
    return preciotaman;
    }
}
