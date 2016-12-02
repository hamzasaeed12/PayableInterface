// SalariedEmployee class extends Employee, which implements Payable.

public class SalariedEmployee extends Employee 
{
   private double weeklySalary;

   // four-argument constructor
   public SalariedEmployee( String first, String middle, String last, String ssn, 
      double salary )
   {
      super( first, middle, last, ssn ); // pass to Employee constructor
      setWeeklySalary( salary ); // validate and store salary
   } 

   // set salary
   public void setWeeklySalary( double salary )
   {
      weeklySalary = salary < 0.0 ? 0.0 : salary;
   } 

   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } 

   // calculate earnings; implement interface Payable method that was
   // abstract in superclass Employee
   public double getPaymentAmount()
   {
      return getWeeklySalary();
   } 

   // return String representation of SalariedEmployee object
   public String toString()
   {
      return String.format( "Salaried employee: %s\n%s: $%,.2f", 
         super.toString(), "Weekly salary", getWeeklySalary() );
   } 
} 

