package abstractlab;
public class employee extends Person implements bills{

	@Override
	public double taxes(double ammount) {
		// TODO Auto-generated method stub
		
		return ammount * .2;
	}

	@Override
	public String toString() {
		return "employee [fname=" + fname + ", lname=" + lname + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void gasBill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carInsurance() {
		// TODO Auto-generated method stub
		
	}

}
