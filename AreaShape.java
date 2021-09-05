import java.util.Scanner;
class AreaShape
{	void area(int r){
    System.out.println("area of circle="+(3.14*r*r));
	}
	void area(int l,int b)
	{ System.out.println("area of Rectangle="+(l*b));
	}
	public static void main(String a[])
	{	AreaShape ar=new AreaShape();
	   ar.area(5);
		ar.area(10,5);
		
		}
	}
