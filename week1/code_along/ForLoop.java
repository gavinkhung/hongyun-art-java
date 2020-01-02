public class ForLoop
{
	public static void main(String [] args)
	{
		ForLoop kb = new ForLoop();
		kb.forLoop1();
		//kb.forLoop2();
		//kb.forLoop3();
	}
	
	public void forLoop1()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);	
		}	
	}
	
	public void forLoop2()
	{
		for(int j = 0; j < 10; j++)
		{
			System.out.println("a");
		}
	}
	
	public void forLoop3()
	{
		for(int k = 0; k > 1; k++)
		{
			System.out.println(k);	
		}
	}
}
