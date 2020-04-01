class Box
{
private int length , breadth , height;
public void setDimension(int l , int b , int h)
{length = l; breadth = b; height= h;}
public void showDimension() 
 {
  System.out.println("L="+ length);
  System.out.println("B="+ breadth);
  System.out.println("H="+ height);
 }
}
class Example
{

public static void main(String[] args)
{
 Box SmallBox = new Box ();
 SmallBox.setDimension(5 , 15 , 10);
 SmallBox.showDimension();
}
}
