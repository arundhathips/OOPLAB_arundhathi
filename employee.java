
import java.util.*;
class employees {
    Scanner sc=new Scanner(System.in);
    int empid,salary;
    String Name,address;;
    employees()
    {
        System.out.println("name:");
        Name= sc.next();
        System.out.println("Employee id:");
        empid= sc.nextInt();
        System.out.println("salary:");
        salary=sc.nextInt();
        System.out.println("address:");
        address=sc.next();
    }
}

class teacher extends employees{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    teacher(){
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
    }
    void display()
    {
        System.out.println("Details are:");
        System.out.println(Name);
        System.out.println(empid);
        System.out.println(address);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(salary);
    }
}

public class Employee{
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        teacher tr[]=new teacher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new teacher();
            tr[i].display();
        }
    }
}
Output
-------
C:\Users\Admin\Desktop\oops>javac Employee.java

C:\Users\Admin\Desktop\oops>java Employee
Enter the limit:
3
name:
Ammu
Employee id:
101
salary:
13000
address:
Pallott
Department name:
MCA
Subject:
Datamining
Details are:
Ammu
101
Pallott
Datamining
MCA
13000
name:
Akku
Employee id:
102
salary:
15000
address:
Kattuparamb
Department name:
MBA
Subject:
bussiness
Details are:
Akku
102
Kattuparamb
bussiness
MBA
15000
name:
deepa
Employee id:
103
salary:
190000
address:
piravom
Department name:
MSC 
Subject:
physics
Details are:
deepa
103
piravom
physics
MSC
190000