package car;

public class Car{

	private double IR, LL, Price, DP;


	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getDP() {
		return DP;
	}

	public void setDP(double dP) {
		DP = dP;
	}

	public double getLL() {
		return LL;
	}

	public void setLL(double lL) {
		LL = lL;
	}

	public double getIR() {
		return IR;
	}

	public void setIR(double iR) {
		this.IR = iR;
	}
	
	public double principal() {
		return ((double) (Price - DP));
	}
	public double interestFormula() {
		return  (principal() * (IR/12) / (1-(Math.pow(1 + IR/12, -LL))));
	}
	public double totalInterest() {
		return interestFormula() * LL - principal();
	}
	
}


