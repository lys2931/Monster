package study;

public class ExampleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0, num2=0;
		num1 = 7;
		num2 = 24;
		AbValue(num1, num2);
	}
	
	public static void AbValue(int num1, int num2)
	{
		if(num1 >= num2)
			System.out.println(num1-num2);
		else
			System.out.println(num2-num1);
	}
}
