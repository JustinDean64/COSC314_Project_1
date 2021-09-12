/**
 * Name: Justin Wynn
 * COSC 314
 * Date: 9/12/2021
 */
public class truthValues 
{
	private int p;
	private int q;
	private int option;
	
	public truthValues()
	{
		p = -1;
		q = -1;
		option = -1;
	}
	
	public truthValues(int one, int two, int select)
	{
		p = one;
		q = two;
		option = select;
		
	}
	
	public int getQ()
	{
		return q;
	}
	
	public int getP()
	{
		return p;
	}
	
	public int getOption()
	{
		return option;
	}
	
	public String conjunction(int one, int two)
	{
		String returnVal = "False";
//		System.out.println("super if One: " + one + "\nTwo: " + two);
		if(one == 1 && two == 1)
			returnVal = "True";
//		System.out.println("sub if One: " + one + "\nTwo: " + two);
		return returnVal;
	}
	
	public String disjunction(int one, int two)
	{
		String returnVal = "False";
		if((one == 1 && (two == 1 || two == 0)) || (two == 1 && (one == 1 || one == 0)))
			returnVal = "True";
		return returnVal;
			
	}
	
	public String exclusiveOr(int one, int two)
	{
		String returnVal = "False";
		if((one == 1 && two == 0) || (one == 0 && two == 1))
			returnVal = "True";
		return returnVal;
	}
	
	public String conditional(int one, int two)
	{
		String returnVal = "True";
		if(one == 1 && two == 0)
			returnVal = "False";
		return returnVal;
		
	}
	
	public String biconditional(int one, int two)
	{
		String returnVal = "False";
		if(one == two && (one == 1 || one == 0))
			returnVal = "True";
		return returnVal;
	}
	
	public String startOperation()
	{
		String returnVal = "";
		
		if(getOption() == 1)
			returnVal = conjunction(getP(), getQ());
		else if(getOption() == 2)
			returnVal = disjunction(getP(), getQ());
		else if(getOption() == 3)
			returnVal = exclusiveOr(getP(), getQ());
		else if(getOption() == 4)
			returnVal = conditional(getP(), getQ());
		else if(getOption() == 5)
			returnVal = biconditional(getP(), getQ());
		
		return returnVal;
		
	}
	
	

}
