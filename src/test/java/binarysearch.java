
public class binarysearch {
	public static void binarysearch(int arr[],int first,int last,int key)
	{
		int mid=(first+last)/2;
		while (first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else if (arr [mid]==key)
			{
				System.out.println("Elements if found a find "+mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("Element is not found");
		}
	}

	public static void main(String[] args) {
	 int arr[]= {10,20,50,40,30,25,66};
	 int key=55;
	 int last=arr.length-1;
	 binarysearch(arr,0,last,key);
	 }

}
