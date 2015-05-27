import java.io.IOException;


public class MainGUI {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.askIncome();
		person.checkValidity();
		person.askFamilyMembers();
		TaxCalculator t=new TaxCalculator();
		t.checkFamilyMembers(person);
		t.calculateTax(person);
		t.checkNegetiveTax();
		t.displayOutput(person);

	}
}
