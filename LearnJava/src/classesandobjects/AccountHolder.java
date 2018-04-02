package classesandobjects;

public class AccountHolder {
String firstname;
String lastname;
int age;
float accountbalance;
boolean eligibleforcreditcard;
	
	public void testeligibilityforcreditcard (){
		// TODO Auto-generated method stub
		if (age>25 && accountbalance>= 20000){
			eligibleforcreditcard =true;
		}

	}

}
