
public class Main {

	public static void main(String[] args) 
	{
		Banker Dimon = new Banker(1000000);
		Dimon.PayTaxes(.35);
		
		Scientist Nye = new Scientist(120000);
		Nye.PayTaxes(.20);
		
		FireFighter Ahmad = new FireFighter(133000);
		Ahmad.PayTaxes(.10);
		
		Dimon.FileTaxReturn();
		Nye.FileTaxReturn();
		Ahmad.FileTaxReturn();
		
		TaxAuditor craig = new TaxAuditor();
		craig.Audit(Dimon);
		craig.Audit(Nye);
		craig.Audit(Ahmad);

	}
}
