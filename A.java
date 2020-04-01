class A 
{ int a;
 public A()
 { System.out.println("A");}
}

class B extends A
{ int b;
  public B()
  { System.out.println("B");}
}

class Example 
{

	 public static void main(String[] args) {
	B obj = new B ();
  }
}

