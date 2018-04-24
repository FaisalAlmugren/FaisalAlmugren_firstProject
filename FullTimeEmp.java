public class FullTimeEmp extends Employee {
	
	private int salary;

	public FullTimeEmp(String n, int a, int s) {
		super(n,a);
		salary = s;
	}

	public FullTimeEmp(FullTimeEmp f) {
		super(f);
		salary = f.salary;
	}

	public void display() {
		super.display();
		System.out.println("Total pay: " + calculatePay());
	}

	public double calculatePay() {
		return salary;
	}
}