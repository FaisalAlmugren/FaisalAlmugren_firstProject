public class Company {

	private String name;
	private Employee[] arrEmployee;
	private int nbEmployee;

	public Company(String n, int size) throws NegativeArraySizeException {
		name = n;
		arrEmployee = new Employee[size];
		nbEmployee = 0;
	}

	public void displayAll() {
		System.out.println("Company Name: " + name);
		for (int i = 0; i < nbEmployee; i++) {
			arrEmployee[i].display();
		}
	}

	public void addEmployee(Employee e) {
		if (nbEmployee < arrEmployee.length) {
			if (e instanceof PartTimeEmp)
				arrEmployee[nbEmployee++] = new PartTimeEmp((PartTimeEmp) e);
			else
				arrEmployee[nbEmployee++] = new FullTimeEmp((FullTimeEmp) e);
		} else
			throw new IllegalStateException("Can't add more employees");
	}

	public void deleteEmployee(String n) throws IndexOutOfBoundsException {
		int id = searchName(n);
		arrEmployee[id] = arrEmployee[nbEmployee - 1];
		nbEmployee--;
	}

	public int searchName(String n) {
		for (int i = 0; i < nbEmployee; i++)
			if (arrEmployee[i].getName().equalsIgnoreCase(n))
				return i;
		return -1;
	}

	public double getYearlyPay(String n) {
		int index = searchName(n);
		return arrEmployee[index].calculatePay() * 12;
	}

	public double calAvgPayForPartTime() throws ArithmeticException {
		double sum = 0;
		double nbPartTime = 0;
		for (int i = 0; i < nbEmployee; i++)
			if (arrEmployee[i] instanceof PartTimeEmp) {
				nbPartTime++;
				sum += arrEmployee[i].calculatePay();
			}
		return sum / nbPartTime;
	}
}