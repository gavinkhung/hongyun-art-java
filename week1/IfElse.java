public class IfElse
{
	public static void main(String [] args)
	{
		IfElse kb = new IfElse();
		kb.ifElse1();
		//kb.ifElse2();
	}
	
	public void ifElse1()
	{
		boolean sunny = true;
		
		if(sunny == true)
		{
			System.out.println("It's sunny outside");
		}
		
		else
		{
			System.out.println("It's not sunny outside);	
		}	
	}
							   
	public void ifElse2()
	{
		int num = 1;
		
		if(num == 1)
		{
			System.out.println("The number is 1");	
		}
		
		else if(num == 2)
		{
			System.out.println("The number is 2");	
		}
		
		else if(num == 3)
		{
			System.out.println("The number is 3");	
		}
		
		else
		{
			System.out.println("The number is " + num);	
		}
	}
							
}
