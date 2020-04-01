public class Employee
{
 int empId;
 String empName;

 Employee(int id , String name){
 this.empId = id;
 this.empName = name;
 }
 void info(){
  System.out.println("Id :"+empId  + "Name :"+empName);
 }

public static void main(String []args){
 Employee obj1 = new Employee(01 ,"Neha");
 Employee obj2 = new Employee(02 , "Anju");
 Employee obj3 = new Employee(03 , "Kajal");


 
 obj1.info();
 obj2.info();
 obj3.info();
 }
}


