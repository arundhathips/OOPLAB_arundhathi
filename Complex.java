import java.util.Scanner;
class Complex{
	double rl,img;
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	Complex c1=new Complex();
	Complex c2=new Complex();
	System.out.println("Enter the complex number a:");
	c1.rl=sc.nextDouble();
	c1.img=sc.nextDouble();
	System.out.println("Enter the complex number b:");
	c2.rl=sc.nextDouble();
	c2.img=sc.nextDouble();
	double sumrl=c1.rl+c2.rl;
	double sumimg=c1.img+c2.img;
	System.out.println("Sum is :"+sumrl+"+i"+sumimg);
}
}
C:\Users\user\Desktop\oops>javac Complex.java

C:\Users\user\Desktop\oops>java Complex
Enter the complex number a:
3
7
Enter the complex number b:
4
8
Sum is :7.0+i15.0
