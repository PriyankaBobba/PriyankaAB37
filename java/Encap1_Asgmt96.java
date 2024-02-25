/* 96.WAP to use getter and setter with int, char, boolean, string, float, double */
package assignments;
class Authentication1 
{
	//int
	private int age =18;
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	//char
	private char text ='T';
	public char getText() 
	{
		return text;
	}
	public void setText(char text) 
	{
		this.text = text;
	}
	//boolean
	private boolean b=true;
	
	public boolean getB() 
	{
		return b;
	}
	public void setB(boolean b) 
	{
		this.b = b;
	}
	//string
	private String name = "Priya";
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	//float
	private float f= 10.9f;
	public float getF() 
	{
		return f;
	}
	public void setF(float f) 
	{
		this.f = f;
	}
	//double
	private double d = 66.888; 
	public double getD() 
	{
		return d;
	}
	public void setD(double d) 
	{
		this.d = d;
	}
}
    public class Encap1_Asgmt96 
	{
	  public static void main(String[] args) 
	   {
		Authentication1 e1 = new Authentication1();
		e1.setAge(45);
		System.out.println(e1.getAge());
		e1.setText('P');
		System.out.println(e1.getText());
		e1.setB(false);
		System.out.println(e1.getB());
		e1.setName("Bittu");
		System.out.println(e1.getName());
		e1.setF(99.99f);
		System.out.println(e1.getF());
		e1.setD(89.9999);
		System.out.println(e1.getD());

	  }
	}

