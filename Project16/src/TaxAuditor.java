
public class TaxAuditor 
{
	public void Audit(ITaxPyer taxPyer)
	{
		System.out.println("Tax auditor is now auditing " + taxPyer.getClass());
	}

}
