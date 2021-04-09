package model;

/**
 *
 * @author jmmm9_000
 */
public class TrianguloEquilatero {
    
    public int RArea; 
    public int RPerimetro; 
    
    public void perimetroT (String Base){
        int perimeter= Integer.parseInt(Base)*3; this.setResultadoPerimetro(perimeter);
    }
    
    public void areaT(String Base, String Altura){
        int area = Integer.parseInt(Base)* Integer.parseInt(Altura)/2; this.setResultadoArea(area);
        
        
    }
    

    public void setResultadoArea(int RArea) {
       this.RArea = RArea;
    }

 
    public void setResultadoPerimetro(int RPerimetro) {
        this.RPerimetro = RPerimetro;
    }
    
    public int getResultadoArea() {
        return RArea; 
    }
    
      public int getResultadoPerimetro() {
        return RPerimetro;
    }
   
}
    

   

   