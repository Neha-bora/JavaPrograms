class A 
{ int a;
 public A( int x)
 { System.out.println("A");}
}

class B extends A
{ int b;
  public B()
  { 
  	super(2);
  	System.out.println("B");}
}

class InheritC
{

	 public static void main(String[] args) {
	B obj = new B ();
  }
}

