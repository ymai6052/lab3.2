
public class lab3functions {
	public static void main(String[]args)
	{
		String [] string
	
	}
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] newarray = new String[list1.length + list2.length];
		for (int i = 0; i < list1.length + list2.length; i++)
		{
			if (list1[i].compareTo(list2[i]) > 0)
			{
				newarray[i] = list2[i];
			}
			else if (list1[i].compareTo(list2[i]) < 0)
			{
				newarray[i] = list1[i];
			}
			else 
			{
				newarray[i] = list1[i];
				i++;
				newarray[i] = list2[i];
			}
		}
	}
	public static String[] mergeSort(String[] list)
	{
		
	}
	public static int partition(int[] list)
	{
		
	}
}
