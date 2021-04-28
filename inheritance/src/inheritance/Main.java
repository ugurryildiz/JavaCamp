package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndividualCustomer test = new IndividualCustomer();
		test.setId(1);
		test.setCustomerNumber("123141");
		
		CorporateCustomer cari = new CorporateCustomer(); 
		cari.setCustomerNumber("13254132");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(test);
		customerManager.add(cari);
		
		Customer[] customers = {test,cari};
		customerManager.addMultiple(customers);
		
	}

}
