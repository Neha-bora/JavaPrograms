public class Examplee
{ 
 public static void main (String [] args)
 {
 Students s1 = new Students();
 s1.setRollno(100);
 s1.setName("neha");
 s1.setAge(18);
 
 System.out.println( "Rollno : " +  s1.getRollno());
 System.out.println( "Name: " +  s1.getName());
 System.out.println( "Age : " +  s1.getAge());
 }
}