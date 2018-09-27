package car;


import org.junit.jupiter.api.Test;

class carTest {

	@Test
	public void interestFormula_test1() {
		
		Car x = new Car();
		
		 x.setPrice(35000);
		 x.setDP(0);
		 x.setLL(60);
		 x.setIR(.10);
		 System.out.println(x.interestFormula());
	}
	
	@Test
	public void totalInterest_test1() {
		
		Car x = new Car();
		
		 x.setPrice(35000);
		 x.setDP(0);
		 x.setLL(60);
		 x.setIR(.10);
		 System.out.println(x.totalInterest());
	}
		
	
}
   
