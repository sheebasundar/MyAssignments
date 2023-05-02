package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=11;
		int firstNumber=0;
		int secNumber=1;
		for(int i=1;i<=range;i++) {
			int thirdNumber=firstNumber+secNumber;
			firstNumber=secNumber;
			secNumber=thirdNumber;
			System.out.println(thirdNumber);
		}
		
	}

}
