/* 95. WAP to update the value of private variable username = "abc@grotechmind.com" 
  to something else using getter and setter */
 
package assignments;
 class Authentication 
{
	private String Username = "abc@grotechminds.com";
	
	public String getUsername()
	{
		return Username;
	}

	public void setUsername(String username) 
	{
		this.Username = username;
	}
}
 public class Encap_Asgmt95
 {
	public static void main(String[] args) 
	{
		Authentication e1 = new Authentication();
		e1.setUsername("hijk@gmail.com");
	    System.out.println(e1.getUsername());

	}
 }

