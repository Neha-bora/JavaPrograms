class A extends Thread
{

 public void run()
 {
 	int i ;
 	for( i = 0; i<= 10; i++)
 		System.out.println("i=" + i +"Thread A");
 }

}

class B extends Thread
{

 public void run()
 {
 	int i ;
 	for( i = 0; i<= 10; i++)
 		System.out.println("i=" + i +"Thread B");
 }

}

public class ThreadExample{
	public static void main (String [] args){
  A obj1 = new A ();
   B obj2 = new B ();

   obj1.Start();
   obj2.Start();
	}
}