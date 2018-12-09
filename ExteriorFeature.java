public class ExteriorFeature implements Feature { 
 
   private String exteriorFeature; 
 
 public ExteriorFeature() {    
   this.exteriorFeature = "Generic"; } 
 
 public ExteriorFeature(String exteriorFeature) {     
   this.exteriorFeature = exteriorFeature; } 
   
 public String getFeature() {     
   return this.exteriorFeature; }   
   
 public void setFeature(String feature) {    
   this.exteriorFeature = feature; }             

 public String toString() {     
     
     return "Exterior [" + this.exteriorFeature + "]"; }
     
}
