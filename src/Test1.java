

public class Test1 {
	void welcome()
	{
	System.out.println("welcome to login page of Anurag");
	}
	public void login()
	{
		System.out.println("enter your login details");
			
	}
	public void invalid()

	{
		System.out.println("this will execute only when you have entered invalid number in database");
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.welcome();
		t1.login();
		t1.invalid();
	}
}
	
	

