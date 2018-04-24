public class PartTimeEmp extends Employee {

	private int nbWorkHours; // number of working hours
	private int rate;

	public PartTimeEmp(String name, int id, int nbWorkHours, int rate) {
		super(name, id);
		this.nbWorkHours = nbWorkingHours;
		this.rate = rate;
	}

	public PartTimeEmp(PartTimeEmp p) {
		super(p);
		nbWorkHours = p.nbWorkHours;
		rate = p.rate;
	}

	public void display() {
		super.display();
		System.out.println("Number of hours a week: " + nbWorkHours);
		System.out.println("Rate: " + rate);
		System.out.println("Total pay: " + calculatePay());
	}

	public int getNbWorkHours() {
		return nbWorkHours;
	}

	public int getRate() {
		return rate;
	}

	public double calculatePay() {
		return (nbWorkHours * 4 * rate);
	}
}
