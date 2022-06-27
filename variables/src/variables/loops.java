package variables;

public class loops {

	public static void main(String[] args)
	{
		System.out.println("**for loop**");
		for (int i=1;i<=10;i++)
		{
			System.out.println(5*i);
		}
		System.out.println("** while loop**");
		
		int num=2;
		int i=0;
		while(i<5)
		{
			
		System.out.println("Even number from 1 to 10::"+num);
		num=num+2;
		i++;
		}
		
		System.out.println("**do loop");
		int a=10;
		do {
			System.out.println(i);
			i--;
		}while(i>1);  

	}

}
