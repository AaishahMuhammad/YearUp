
public class PersonEncapsulation 
{
  private String m_Name = null;
  private int m_Age = -1;
  private String m_PhoneNumber = null;
  private String m_Address = null;
  
  PersonEncapsulation(String Name, int Age, String PhoneNumber, String Address)
  {
	  SetName(Name);
	  SetAge(Age);
	  SetPhoneNumber(PhoneNumber);
	  SetAddress(Address);
	  
  }
  String GetName()
  {
	  return m_Name;
  }
  private void SetName(String Name)
  {
	  m_Name = Name;
  }
  
  int GetAge()
  {
	  return m_Age;
  }
   private void SetAge(int Age)
   {
	   m_Age = Age;
   }
   
   String GetPhoneNumber()
   {
	   return m_PhoneNumber;
   }
   private void SetPhoneNumber(String PhoneNumber)
   {
	   m_PhoneNumber = PhoneNumber;
   }
   
   String GetAddress()
   {
	   return m_Address;
   }
   private void SetAddress(String Address)
   {
	   m_Address = Address;
   }
   void GrowsOlder()
   { 
	   //int currentAge = GetAge();
	   //setAge(currentAge + 1);
	   
	   m_Age++;
   }
   


   }

