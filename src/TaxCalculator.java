
public class TaxCalculator {
private double totalTax;
public TaxCalculator(double tax)
{
	totalTax=tax;
}
public TaxCalculator()
{
	}
public int checkFamilyMembers(Person p)
{
if(p.getNoOfDependents()<=0)	
	{
	System.out.println("Did you forget to count yourself?");
	System.out.println("Start over");
	System.exit(-1);
		return -1;
	}
	return 0;
}
public int calculateTax(Person p)
{
		if(p.getIncome()<10000)
		{
			totalTax=0.12 * p.getIncome();
		}
		else if(p.getIncome()<50000)
		{
			totalTax=300.0+ 0.24 *(p.getIncome()-10000);
		}
		else
		{
			totalTax=300.0+ 0.24 *(p.getIncome()-10000);
		}
		for (int i = 0; i < p.getNoOfDependents(); i++) {
			totalTax=totalTax-100;
		}		
		
	return 0;
}
public boolean checkNegetiveTax()
{
	if(totalTax<0)
	{
		totalTax=0;
		return false;
	}
	return true;
}
public void displayOutput(Person p)
{
		System.out.println("=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$");	
		System.out.println("Wowreit & Sarrazin GmbH");
		System.out.println("Tax Bill");
		System.out.println("Your Income was "+p.getIncome()+" $.");
		System.out.println("You have "+p.getNoOfDependents()+ " family members.");
		System.out.println("Your tax Total is "+ totalTax+ "$");
		System.out.println("Family Member Tax Saving is "+ p.getNoOfDependents()*100+"$ ");
		System.out.println("=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$=$");
}

}
