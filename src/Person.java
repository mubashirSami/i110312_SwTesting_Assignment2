import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Person {
private Double income;
private int noOfDependents;

private BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
public Person() {
	
}
public Person(double income, int noOfDependents) {
	super();

	this.income = income;
	this.noOfDependents = noOfDependents;
}
public boolean askIncome() throws NumberFormatException, IOException
{
	System.out.println("Welcome to the new Berlin Tax Calculator...");
	System.out.println("How much did you earn last year?");
	try{
	income=Double.parseDouble(in.readLine());
	return true;
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
		return false;
	}
	catch(IOException e)
	{
		e.printStackTrace();
		return false;
	}
	
}

public Double getIncome() {
	return income;
}
public int getNoOfDependents() {
	return noOfDependents;
}
public boolean askFamilyMembers() throws NumberFormatException, IOException
{
	System.out.println("How many dependents you have?");
	try{
	noOfDependents=Integer.parseInt(in.readLine());
	return true;
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
		return false;
	}
	catch(IOException e)
	{
		e.printStackTrace();
		return false;
	}
	
}
public boolean checkValidity()
{
	if(this.income<0)
	{
		System.out.println("No one has negetive income!");
		System.out.println("Start over!");
		System.exit(-1);
		return false;
	}
	return true;
}

}
