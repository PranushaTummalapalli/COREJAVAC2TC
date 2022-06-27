package variables;

public class Branching {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++)
		{
			if(i==0)
			{
				continue;//break;
			}
			System.out.println("i="+i);
		}

	}

}
