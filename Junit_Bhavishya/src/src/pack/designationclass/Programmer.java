package src.pack.designationclass;

public class Programmer extends Employee {

	public Programmer()
	{
	 setSal("40000");
	 setDesig("Programmer");
	}
	
//	@Override
//	public void setSal(String sal) {
//		super.setSal("50000");
//	}
//	@Override
//	public void setDesig(String desig)
//	{
//		super.setDesig("Programmer");
//	}
	public void raiseSalary()
	{
		setSal(getSal()+2000);
	}
}
