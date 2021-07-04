package src.pack.designationclass;


public class Clerk extends Employee  
	{
	public Clerk()
	{
	  setSal("30000");
	  setDesig("Clerk");
	}
	public void raiseSalary()
	{
		setSal(getSal()+1500);
	}

		
	}

