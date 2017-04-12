import java.util.*;
 import java.util.HashMap;

public class Photographer{
 public static void main(String[] args){
  HashMap<String, Integer> 
  journal = new HashMap<String,Integer>();
  // return System.out.println("hello");

  journal.put("day1",5);
  journal.put("day2",10);
  // System.out.println(journal.size());
    }
private ArrayList<Printable> cameras;
// }
public Photographer(){
  this.cameras = new ArrayList<Printable>();
  // this.journal = new HashMap<String,Integer>();
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
public int numberOfPhotos(){
   int count = 0;
  
  System.out.println(cameras.journal.get("day1"));
  }


}
