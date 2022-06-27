package variables;

public class forloop {

	public static void main(String[] args) {
		int num=10;
		boolean isPrime=true;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
			}
		}
		if(isPrime==true)
		{
			System.out.println("The number is prime number");
		}
		else
		{
			System.out.println("The number is not a  prime number");
		}

	}

}
