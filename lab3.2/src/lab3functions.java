import java.util.Arrays;
public class lab3functions {
	public static void main(String[]args)
	{
		String [] string1 = {"a","b","c"};
		String [] string2 = {"a","e","f"};
		printArray(merge(string1,string2));
		String [] list1 = {"d","c","a"};
		printArray(mergeSort(list1));
		int [] list2= {5,1,7,8,9,5,2};
		System.out.println(partition(list2));
		
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
	/*public static void printArrayNum (int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	} */
	public static String[] mergeSort(String[] list)
	{
		if (list.length <= 1) 
		{
			return list;
		}
		else
		{
			int x=list.length/2;
			String[] temp1 = Arrays.copyOfRange(list,0,x);
			String[] temp2 = Arrays.copyOfRange(list,x,list.length);
			return merge(mergeSort(temp1),mergeSort(temp2));
		}
	}
	public static int partition(int[] list)
	{
		int counter = 0;
		int temp2 = 0;
		int[] temp1= new int[list.length];
		for(int i=1;i<list.length;i++)
		{
			if(list[0]>=list[i])
			{
				temp1[counter]=list[i];
				counter++;
			}
		}
		temp2=counter;
		temp1[temp2]=list[0];
		for (int j = 1; j <list.length; j++)
		{
			if(list[0]<list[j])
			{
				temp1[temp2+1] = list[j];
				temp2++;
			}
		}
		list = temp1;
		//printArrayNum(list);
		
		return counter;
	}
}
