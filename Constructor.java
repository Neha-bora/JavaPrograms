public class Constructor
{
 String name;
  Constructor(){
 this.name ="This is a constructor program";
 }
  public static void main (String [] args){
   Constructor obj = new  Constructor();
  System.out.println(obj.name);
  }
}