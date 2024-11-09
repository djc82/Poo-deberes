
package clase1;


public class car {
    public String Color;
    public String Marca;
    public int vmax;

    public car(String Color, String Marca, int vmax) {
        this.Color = Color;
        this.Marca = Marca;
        this.vmax = vmax;
    }
    
    public void informacion(){
        System.out.println("El color es: "+Color);
        System.out.println("La marca es: "+Marca);
        System.out.println("Alcanza una vmax de: "+vmax);
        
    }
    
}
