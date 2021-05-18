import java.util.*;
public class product
{
int pcode,price;
String pname;

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
product[] p=new product[3];
for(int i=0;i<3;i++)
{
	p[i]=new product();
        System.out.println("Enter the product name:");
        p[i].pname=sc.next();
        System.out.println("Enter the product code:");
	p[i].pcode=sc.nextInt();
        System.out.println("Enter the price:");
	p[i].price=sc.nextInt();
	
}

if(p[0].price<p[1].price)
{
	if(p[0].price<p[2].price)
	System.out.println(p[0].pname+" is smallest price");
	else
	System.out.println(p[1].pname+" is smallest price");
}
else if(p[1].price<p[2].price)
System.out.println(p[1].pname+" is smallest price");
else
System.out.println(p[2].pname+" is smallest price");
}	
}




C:\Users\user\Desktop\oops>javac product.java

C:\Users\user\Desktop\oops>java product
Enter the product name:
maggi
Enter the product code:
111
Enter the price:
20
Enter the product name:
juice
Enter the product code:
123
Enter the price:
30
Enter the product name:
gum
Enter the product code:
231
Enter the price:
10
juice is smallest price	


