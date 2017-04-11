import java.util.*;

public class Photographer{
private ArrayList<Printable> cameras;

public Photographer(){
  this.cameras = new ArrayList<Printable>();
}
public int addCamera(Printable camera){
  cameras.add(camera);
  return cameras.size();
}
public int removeCamera(Printable camera){
  cameras.remove(camera);
  return cameras.size();
}
public String cameraDetails(){
  String details = "";
  for(Printable camera : this.cameras){
   details = details +""+ camera.printDetails()  ;
  }
  return details;
}

  
}
