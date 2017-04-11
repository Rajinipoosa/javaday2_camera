import static org.junit.Assert.assertEquals;
import org.junit.*;
 
 public class PhotographerTest{
  Photographer photographer;
  Printable cameras;

  @Before
  public void before(){
    photographer = new Photographer();
    cameras = new Printable();
   

   }
   @Test
   public void addOneToCamerasList()
   {
    
    assertEquals(1,photographer.addCamera(cameras));
   
   }
   @Test
   public void removeOneFromCamerasList()
   {
    
    assertEquals(0,photographer.removeCamera(cameras));
   
   }
}