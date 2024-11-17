package Abusivesnake;
public class Employee 
{
	private String name;
	public double salary;
	private int workhours, hireYear;
	
	Employee(int hireYear, int workhours, double salary, String name)
	{
		this.name = name;
		this.hireYear = hireYear;
		this.workhours = workhours;
		this.salary = salary;
	}
	
	public double tax()
	{
		if(this.salary <= 1000)
		{
			return 0 * 0;
		}
		return salary * 0.03;
	}
	
	public double bonus()
	{
		int extra = this.workhours - 40;
		if(extra > 0)
		{
			return 30 * extra;
		}
		return 0.0;
	}
	
	public double incerase()
	{
		int year = 2024 - this.hireYear;
		if(year < 10)
		{
			return salary * 0.05;
		}
		else if(year >= 10 && year < 20)
		{
			return salary * 0.10;
		}
		else
		{
			return salary * 0.15;
		}
	}
	
	public void toString(Employee emp)
	{
		System.out.println(emp.name);
		System.out.println("Tax: " + emp.tax());
		System.out.println("Bonus: " + emp.bonus());
		System.out.println("Increase Salary: " + emp.incerase());
		double totalSalary = emp.salary - emp.tax() + emp.bonus();
		System.out.println("Total Salary with tax and bonus: " + totalSalary);
		System.out.println("Total Salary with the raise of salary: " + (emp.salary + emp.incerase()));
	}
}