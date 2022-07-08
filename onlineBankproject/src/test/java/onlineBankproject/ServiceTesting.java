package onlineBankproject;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


import com.bank.model.Bank;
import com.bank.service.BankService;


public class ServiceTesting {

	@Test
	public void Testcustomerlogin() {
	Bank b = new Bank();
	b.setEmail1("satagopamhariprasad09@gmail.com");
	b.setPassword1("hari123@");
	int actual =BankService.customerLogin(b);
	assertEquals(1, actual);//1 success
	}
	
	 @Test
		public void Testcustomerlogin2() {
		Bank b = new Bank();
		b.setEmail1("satagopamhariprasad09@gmail.com");
		b.setPassword1("hari1");
		int actual =BankService.customerLogin(b);
		assertEquals(0, actual); // 0 incorrect  password 
	 }
	 
	 
	 @Test
	 public void Testemployeelogin() {
		 Bank b=new Bank();
		 b.setEmail1("ragava123@gmail.com");
		 b.setPassword1("ragava123@");
		 int actual=BankService.Employeelogin(b);
		 assertEquals(1, actual);  // success
		 
	 }
	 
		 
	 
	 @Test
	 public void Testemployeelogin2() {
		 Bank b=new Bank();
		 b.setEmail1("ragava123@gmail.com");
		 b.setPassword1("raga");
		 int actual=BankService.Employeelogin(b);
		 assertEquals(0, actual);  // incorrect password 0 failed login  
		 
	 }
	
	
}
