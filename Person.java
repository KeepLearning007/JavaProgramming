package abstractlab;
public abstract class Person {
	
	
	protected String fname;
	protected String lname;
	
	public abstract double taxes(double ammount);
	public double calculateTelePhoneBill(double ammount) {
		return this.taxes(ammount) + ammount;
	}
	
	
}
