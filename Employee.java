import java.util.Scanner;

public class Employee {
	int eNo,eSalary;
	String eName;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[] e=new Employee[3];
		System.out.println("enter the Limit");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details:");
			e[i]=new Employee();
			e[i].eNo=sc.nextInt();
			e[i].eSalary=sc.nextInt();
			e[i].eName=sc.next();
		}
		System.out.println("Enter the eNo:");
		int geNo=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(e[i].eNo==geNo)
			{
				System.out.println("Employee found");
				break;
			}
			if(i==n-1)
			{
				System.out.println("Employee not found:");
			}
		}


	}

}
C:\Users\user\Desktop\oops>javac Employee.java

C:\Users\user\Desktop\oops>java Employee
enter the Limit
3
Enter the details:
111
5000
sara
Enter the details:
121
3000
anna
Enter the details:
123
7000
mary
Enter the eNo:
111
Employee found
