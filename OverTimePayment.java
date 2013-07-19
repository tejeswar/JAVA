import java.util.Scanner;
import java.util.ArrayList;
class OverTimePayment 
{
	public static void main(String[] args) 
	{
        ArrayList<Employee> al = new ArrayList<Employee>(10);
        System.out.println("Enter 10 Employee records ");
        Scanner s = new Scanner(System.in);
		for(int i=1; i<=10; i++)
		{
			Employee e = new Employee();
			System.out.print(i+" Emploies employee id:");
			e.setEmpId(s.nextInt());
			System.out.print("Time worked by him:");
			e.setWorkedTime(s.nextInt());
			al.add(e);
		}
		for(int i=0; i<10; i++)
		{
			int time,overtime;
            Employee e = (Employee)al.get(i);
			time = e.getWorkedTime();
			if(time > 40)
			{
			  overtime = time-40;
			  e.setOverTimePayment(overtime * 12);
			}
		}
		System.out.println("10 Emploies records are :");
		for(int i=0; i<10; i++)
		{
            Employee e = (Employee)al.get(i);
			System.out.print("Employee Id :"+ e.getEmpId());
            System.out.print("  Over time payment is :"+ e.getOverTimePayment());
		    System.out.println();
		}
	}
}
