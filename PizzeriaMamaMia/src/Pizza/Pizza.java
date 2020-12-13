package Pizza;

public class Pizza {
    
    private String masa;
    private String[] salsa;
    protected String[] ingredientes;

    
    public Pizza(){
    }

    public Pizza(String masa, String[] salsa, String[] ingredientes) {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
      
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String[] getSalsa() {
        return salsa;
    }

    public void setSalsa(String[] salsa) {
        this.salsa = salsa;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    
    public void hornear(){
        System.out.println("Hornear pizza toma 15 min");
    }
    
    public void cortar(int cantcortes){
        if(cantcortes == 4){
           System.out.println("La pizza se corta en "+cantcortes+ " porciones");
        }else{
            if(cantcortes == 8){
                    System.out.println("La pizza se corta en "+cantcortes+ " porciones");
            }else{
                if(cantcortes==12){
                    System.out.println("La pizza se corta en "+cantcortes+ " porciones");
                }else{
                    System.out.println("La pizza se corta en "+cantcortes+ " porciones");
                }
            }
        }
    }
    
    public void empacar(){
        System.out.println("La pizza se empaca en una cajita de corazon");
    }
    
    
    

    
    
}