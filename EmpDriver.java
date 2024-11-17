package Abusivesnake;
public class EmpDriver 
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee(1985, 45, 2000.0, "Kemmal");
		emp1.toString(emp1);
		
		Employee emp2 = new Employee(1967, 40, 12500.0, "Önder");
		emp2.toString(emp2);
	}
}
