import java.util.Scanner;

 class Search {

	public static void main(String[] args)
 {
		int[] arr=new int[100];
		int i,n,el;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter limit:");
		n=sc.nextInt();
		System.out.println("Enter "+n+" elements:");
		for(i=1;i<=n;i++)
		{
			arr[i]=sc.nextInt();			
		}
		System.out.println("Enter element to search:");
		el=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(el==arr[i])
			{
				System.out.println(" Element found at "+i+" position");
				break;
			}
			if(i==n)
				System.out.println("Elemnt not found");
		}
	}

}
C:\Users\user\Desktop\oops>javac Search.java

C:\Users\user\Desktop\oops>java Search
Enter limit:
4
Enter 4 elements:
3
2
6
9
Enter element to search:
2
 Element found at 2 position




