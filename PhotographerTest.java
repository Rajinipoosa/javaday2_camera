import static org.junit.Assert.assertEquals;
import org.junit.*;
 
 public class PhotographerTest{
  Photographer photographer;
  AnalogCamera analog;
  DigitalCamera digital;


  @Before
  public void before(){
    photographer = new Photographer();
    analog = new AnalogCamera();
    digital = new DigitalCamera();
    }
   @Test
   public void addOneToCamerasList()
   {
    photographer.addCamera(analog);
    assertEquals(2,photographer.addCamera(digital));
   
   }
   @Test
   public void removeOneFromCamerasList(){
    photographer.addCamera(analog);
    photographer.addCamera(digital);
    
    assertEquals(1,photographer.removeCamera(analog));
   
   }
   @Test
   public void displayAllCameraDetails(){
    

   }
}