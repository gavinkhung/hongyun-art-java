import java.util.ArrayList;

public class Arrays
{
	public static void main(String [] args)
	{
		int [] numbers = new int[5];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = i + 1;	
		}

		ArrayList<Integers> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(new Integer(2));

		System.out.println(arrayList);
		System.out.println("size: "+arrayList.size());

		arrayList.remove(0);
		System.out.println("size: "+arrayList.size());

	}
}
