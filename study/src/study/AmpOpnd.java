package study;

public class AmpOpnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수형 나머지 : " + 7%3);
		System.out.println("실수형 나머지 : " + 7.2 % 2.1);
		
		
		for(int i=0; i<10; i++)
			for(int j=0; j<10; j++)
				if((i*10)+j+(j*10)+i == 99 )
					System.out.println(i + " " + j + "+" + j + " " + i + " = 99" );
			
	}
}