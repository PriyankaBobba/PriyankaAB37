/* 49.Create a class and in this create interface as Amazon with login and logout methods 
 also create child class and create relation between them */
package assignments;
interface Amazon
{
	void login();
	void logout();
}

public class Interface_Asgmt49 implements Amazon
{
	public static void main(String[] args) 
	{
		Interface_Asgmt49 i1 = new Interface_Asgmt49();
		i1.login();
		i1.logout();
	}	
	public void login() 
	{
		System.out.println("Login");	
	}	
	public void logout() 
	{
		System.out.println("Logout");	
	}
}