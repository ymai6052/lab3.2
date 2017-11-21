
public class lab3functions {
	public static void main(String[]args)
	{
		String [] string1 = {"a","b","c"};
		String [] string2 = {"d","e","f"};
		printArray(merge(string1,string2));
	}
	public static String[] merge(String[] list1, String[] list2)
	{
		int newlist = 0;
		int newlist2 = 0;
		int newlist3 = 0;
		String[] newarray = new String[list1.length + list2.length];
		while(newlist < list1.length || newlist2 < list2.length)
		{
			if (newlist == list1.length)
			{
				newarray[newlist3] = list2[newlist2];
				newlist2++;
			}
			else if (newlist2 == list2.length)
			{
				newarray[newlist3] = list1[newlist];
				newlist++;
			}
			else if (list1[newlist].compareTo(list2[newlist2]) < 0)
			{
				newarray[newlist3] = list1[newlist];
				newlist++;
			}
			else 
			{
				newarray[newlist3] = list2[newlist2];
				newlist2++;
			}
			newlist3++;
		}
		return newarray;
	}
	public static void printArray (String[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static String[] mergeSort(String[] list)
	{
		if (list.length <= 1) {
			return list;
		}
		else
		{
			
		}
	}
	public static int partition(int[] list)
	{
		
	}
}
