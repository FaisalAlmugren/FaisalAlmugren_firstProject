public abstract class Employee {

	private String name;
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Employee(Employee e) {
		name = e.name;
		id = e.id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
	}

	public abstract double calculatePay();
}