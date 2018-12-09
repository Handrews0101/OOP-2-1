import java.util.Date; 
 
 // Here is some more stuff that google helped me kind of learn 
 // So I could put it in here and have it be a semi useful program
 // Does every car company use the same types of engines and things
 // This is why people should just all buy teslas...
 
 public class ManufacturedEngine implements Engine {   
   private String     engineManufacturer;  
   private Date       engineManufacturedDate;  
   private String     engineMake;   
   private String     engineModel;   
   private int        engineCylinders;   
   private String     engineType;   
   private String  driveTrain; 
 
  public ManufacturedEngine() {        
    this.engineManufacturer = "Generic";     
    this.engineManufacturedDate = new Date();     
    this.engineMake = "Generic";     
    this.engineModel = "Generic";     
    this.engineCylinders = 0;     
    this.engineType = "85 AKI";     
    this.driveTrain = "2WD: Two-Wheel Drive"; } 
 
  
public ManufacturedEngine( String engineManufacturer, Date engineManufacturedDate, String engineMake, String engineModel, String driveTrain, int engineCylinders, String engineType ) {       
  this.engineManufacturer = engineManufacturer;     
  this.engineManufacturedDate = engineManufacturedDate;     
  this.engineMake = engineMake;    
  this.engineModel = engineModel;     
  this.driveTrain = driveTrain;     
  this.engineCylinders = engineCylinders;     
  this.engineType = engineType; } 
 
public final void setEngineManufacturedDate(Date date) {    
  this.engineManufacturedDate = date; }   
  
public final void setEngineManufacturer(String manufacturer) {    
  this.engineManufacturer = manufacturer; }   
  
public void setEngineMake(String engineMake) {    
  this.engineMake = engineMake; }   
  
public void setEngineModel(String engineModel) {    
  this.engineModel = engineModel; }  
  
public final void setEngineType(String fuel) {     
  this.engineType = fuel; }   
  
public void setEngineCylinders(int engineCylinders) {     
  this.engineCylinders = engineCylinders; }  
  
public void setDriveTrain(String driveTrain) {     
  this.driveTrain = driveTrain; } 
 
   public String toString() { 

// Teslas don't have engines. js
// this program would be shunk immensely if it was a tesla

 return "Engine Manufacturer : " + this.engineManufacturer + "\n" +         
 "Engine Manufactured : " + 
 this.engineManufacturedDate.toString() + "\n" +         
 "Engine Make         : " + this.engineMake + "\n" +         
 "Engine Model        : " + this.engineModel + "\n" +         
 "Engine Type         : " + this.engineType + "\n" +         
 "Engine Cylinders    : " + this.engineCylinders + "\n" +         
 "Drive Train         : " + this.driveTrain; }
 }
 
  
  
