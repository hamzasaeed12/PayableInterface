// Employee abstract superclass implements Payable.

public abstract class Employee implements Payable
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

   // Constructor
   public Employee( String first, String middle, String lastName, String ssn )
   {
      if (middle != "")
            middle = " " + middle;
      firstName = first + middle;
      this.lastName = lastName;
      socialSecurityNumber = ssn;
   } 

   // set first name
   public void setFirstName( String first )
   {
      firstName = first;
   }

   // set first and middle name
   public void setFirstName( String first, String middle)
   {
      firstName = first + " " + middle;
   } 

   // return first name
   public String getFirstName()
   {
      return firstName;
   } 

   // set last name
   public void setLastName( String last )
   {
      lastName = last;
   } 

   // return last name
   public String getLastName()
   {
      return lastName;
   }

   // set social security number
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn;
   }

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   // return String representation of Employee object
   public String toString()
   {
      return String.format( "%s %s\nSocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber() );
   }

} 

