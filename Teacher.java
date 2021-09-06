import java.util.Scanner;
class Person
{
	String name,gender,address;
	int age;
	Person()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("NAME:");
		name=sc.next();
		System.out.println("Gender:");
		gender=sc.next();
		System.out.println("Address:");
		address=sc.next();
		System.out.println("Age:");
		age=sc.nextInt();
		
	}
	
}
class Employee extends Person
{
	int empid;
	String cname,qual;
	float salary;
	Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ID:");
		empid=sc.nextInt();
		System.out.println("Company name:");
		cname=sc.next();
		System.out.println("Qualification:");
		qual=sc.next();
		System.out.println("Salary:");
		salary=sc.nextFloat();
		
	}
}

class Teacher extends Employee
{  String dept,sub;
	Teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("DEPT:");
		dept=sc.next();
		System.out.println("SUB:");
		sub=sc.next();
	}
	void display()
	{
        System.out.println("\nDetails are\n");
	System.out.print(name);
	System.out.print(" ");
	System.out.print(gender);
	System.out.print(" ");
	System.out.print(age);
	System.out.print(" ");
	System.out.print(address);
	System.out.print(" ");
	System.out.print(empid);
	System.out.print(" ");
	System.out.print(cname);
	System.out.print(" ");
	System.out.print(qual);
	System.out.print(" ");
	System.out.print(salary);
	System.out.print(" ");
	System.out.print(dept);
	System.out.print(" ");
	System.out.print(sub);
	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("enter the number of teachers:");
		int n=sc.nextInt();
		Teacher t[]=new Teacher[n];
		do
		{
		System.out.print("\nMenu\n1.Insert\n2.Display\n");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:	for(int i=0;i<n;i++)
				{
				t[i]=new Teacher();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				t[i].display();
				}		
		break;
		default:System.out.println("Invalid Choice");
		}
	}
	while(choice!=3);
	}

}






