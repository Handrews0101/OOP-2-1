import java.util.Date;

// This is about engines. 
// Something I know nothing about but google helped me out
// And now the program will tell you what google maybe taught me

public interface Engine {
    void setEngineCylinders(int engineCylinders);
    void setEngineManufacturedDate(Date date);
    void setEngineManufacturer(String manufacturer);
    void setEngineMake(String engineMake);
    void setEngineModel(String engineModel);
    void setDriveTrain(String driveTrain);
    void setEngineType(String fuel);
}
