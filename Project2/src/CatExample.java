
public class CatExample 
{
   int m_iqPoints = 1;
	
   public static void main(String[] args) 
	{
     Cat schrodinger = new Cat (5);
     
     System.out.println("Schrodinger is just born");
     System.out.println("Schrodinger's IQ is" + schrodinger.m_iqPoints);
     boolean isSamart = schrodinger.isSmart();
     System.out.println("Now Schrodinger is smart is" + isSmart);
     
     System.out.println("Schrodinger goes to cat school");
     schrodinger.m_iqPoints = 21;
     isSmart = schrodinger.isSmart();
     System.out.println("Now Schrodinger is smart is " + isSmart);
     
	}
boolean isSmart()
{
	boolean isSmart = false;
	
	if (m_iqPoints > 20){
		isSmart = true;
	}
	return false;
 }
