class Exception2{

 public static void main (String [] args){
 	int balance = 10000;
 	int withdrawlAmount = 6000;

 try{
     if(balance < withdrawlAmount)
 		throw new ArithmeticException("Insufficent balance in your bank");


 	balance = balance - withdrawlAmount;
 	System.out.println("Transaction succesfully completed: " + balance);

 }
 catch( ArithmeticException e){
 	System.out.println("Exception:" + e.getMessage());
 }
 
 	System.out.println("Program continue");
 }

}