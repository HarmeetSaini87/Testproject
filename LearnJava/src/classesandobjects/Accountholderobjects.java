package classesandobjects;

public class Accountholderobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AccountHolder tom = new AccountHolder();
         AccountHolder henry = new AccountHolder();
         AccountHolder sarah = new AccountHolder();
	
         tom.firstname ="Tom";
         tom.lastname ="Smith";
         tom.age =21; 
         tom.accountbalance =10000; 
         tom.testeligibilityforcreditcard();
         System.out.println("Is tom eligible for CC: "+tom.eligibleforcreditcard);
         
         henry.firstname ="Henry";
         henry.lastname ="Smith";
         henry.age =31; 
         henry.accountbalance =20000; 
         henry.testeligibilityforcreditcard();
         System.out.println("Is Henry eligible for CC: "+henry.eligibleforcreditcard);
	}
	

}
