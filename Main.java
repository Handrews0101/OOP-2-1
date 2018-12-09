import java.util.Date;

public class Main {

  public static void main(String[] args) {
    //different parts in Main 
    //testVehicleChassis();
    //testVehicleFrame();
    //testManufacturedEngine();
    //testFeatures();
    //testVehicle();
    //testCar();
  }

  public static void testVehicleChassis() {
    // Creates two objects, one with the default constructor
    // and the other with the constructor with parameters.
    // Give sample data for the parameters.

    System.out.println("-------------------------------------------------------------"); 

    VehicleChassis vc1 = new VehicleChassis();     
    System.out.println(vc1);          
    System.out.println("-------------------------------------------------------------");       
    VehicleChassis vc2 = new VehicleChassis("Test Chassis");       
    System.out.println(vc2);      
    System.out.println("-------------------------------------------------------------"); 
    
  }  
  

  public static void testVehicleFrame() {
     System.out.println("--------------------------------------------------------");    
     VehicleFrame vf1 = new VehicleFrame();    
     System.out.println(vf1);      
     System.out.println("--------------------------------------------------------"); 
   
     VehicleFrame vf2 = new VehicleFrame("Ladder Frame");    
     System.out.println(vf2);    
     System.out.println("--------------------------------------------------------");   }  

  public static void testManufacturedEngine() {
    System.out.println("--------------------------------------------------------");   
    
    ManufacturedEngine me1 = new ManufacturedEngine();     
    System.out.println(me1); 
 
    System.out.println("--------------------------------------------------------");    
    ManufacturedEngine me2 =       new ManufacturedEngine( "Ford", new Date(1325599999999L) 
    , "H-Series", "H23A1"                                                    
    , "2WD: Two-Wheel Drive", 4                                                    
    , "88 AKI");     
    System.out.println(me2);    
    System.out.println("--------------------------------------------------------");      
    
  } 
    

  public static void testFeatures() {
      System.out.println("------------------------------------------------");     
      InteriorFeature if1 = new InteriorFeature();     
      System.out.println(if1);          
      System.out.println("----------------------------------------------"); 

      InteriorFeature if2 = new InteriorFeature("Climate Control");       
      System.out.println(if2);             
      System.out.println("------------------------------------------------");  
      
      ExteriorFeature ef1 = new ExteriorFeature();    
      System.out.println(ef1);          
      System.out.println("-----------------------------------------------------");      
      
      ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");       
      System.out.println(ef2);  
      System.out.println("--------------------------------------------------------");        
    
  }


  public static void testVehicle() {
 
   Vehicle v1 = new Vehicle();     
   System.out.println(v1);      
   System.out.println("-------------------------------------------------");  
   
   Vehicle v2 = new Vehicle( "Ford", new Date(1325599999999L), "Ford", "Mustang", "Coupe"                             
   , new VehicleChassis("Unibody")                             
   , new ManufacturedEngine("Ford", new Date(), "HSeries", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI")); 
   
   System.out.println(v2);     
   System.out.println("-------------------------------------------------"); 
   
   v2.setEngineCylinders(6);    
   System.out.println(v2);    
   System.out.println("-------------------------------------------------");   }
   
   
  public static void testCar() {

   Car c1 = new Car();    
   System.out.println("-------------------------------------------------------------");    
   System.out.println(c1); 
 
   System.out.println("-------------------------------------------------");    
 
   Feature[] f = { new InteriorFeature("AM/FM Radio")                   
   , new ExteriorFeature("Flying")                   
   , new InteriorFeature("Air Conditioning")                   
   , new ExteriorFeature("Moonroof")};          
   
   Car c2 = new Car( "Ford", new Date(1325599999999L)                     
   , "Ford", "Mustang", "Coupe"                     
   , new VehicleChassis("Unibody")                     
   , new ManufacturedEngine(                             
     "Ford", new Date(), "H-Series", "H23A1"                            
     , "2WD: Two-Wheel Drive", 4                            
     , "88 AKI")                     
     , f, 2);     
     System.out.println(c2); 
 
     System.out.println("-------------------------------------------------");    
 
    Vehicle v = (Vehicle) new Car( "Ford", new Date(1325599999999L)                                  
    , "Ford", "Mustang", "Coupe"                                   
    , new VehicleChassis("Unibody")                                  
    , new ManufacturedEngine(                                      
      "Ford", new Date()                                    
      , "H-Series", "H23A1"                                    
      , "2WD: Two-Wheel Drive", 4                                    
      , "88 AKI")                                  
      , f, 2); 
      
      System.out.println(((Car) v).getExteriorFeatures());         
      System.out.println("-------------------------------------------------");        
      System.out.println("Exterior Features   : " +                         
      c2.getExteriorFeatures());     
      System.out.println("Interior Features   : " +                        
      c2.getInteriorFeatures());     
      System.out.println("-------------------------------------------------");      } } 
