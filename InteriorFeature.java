public class InteriorFeature implements Feature {   
  private String interiorFeature; 
  
  public InteriorFeature() {    
    this.interiorFeature = "Generic"; } 
 
  public InteriorFeature(String interiorFeature) {     
    this.interiorFeature = interiorFeature; } 
 
  public String getFeature() {     
    return this.interiorFeature; }   
    
    public void setFeature(String feature) {     
      this.interiorFeature = feature; }
      
    public String toString() {     
        return "Interior [" + this.interiorFeature + "]";  }
}
 
