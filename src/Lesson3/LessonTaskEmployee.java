package Lesson3;

class Employee {

	private String name;
	private int rate;
	private int hours;
	static int totalsum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public static int getTotalsum() {
		return totalsum;
	}

	public static void setTotalsum(int totalsum) {
		Employee.totalsum = totalsum;
	}

	// @Override
	// public String toString() {
	// return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours +
	// "]";
	// }

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", salary=" + salary() + ", bonuses="
				+ bonuses() + ", totalSalary=" + totalSalary() + "]";
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public int salary() {
		int s = rate * hours;
		
		return s;
	}

	public int bonuses() {
		int b = (salary() * 10) / 100;
		return b;
	}

	public int totalSalary() {
		int t = salary() + bonuses();
		return t;

	}
	
	public int allSalary() {
		int all = salary() + bonuses();
		return all;

	}

}

public class LessonTaskEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee("Sem", 25, 35);
		System.out.println(emp);
		emp.bonuses();
		emp.totalSalary();

		Employee emp1 = new Employee("Piter", 10, 22);
		System.out.println(emp1);
		emp1.bonuses();
		emp1.totalSalary();
		emp1.allSalary();

	}

}
