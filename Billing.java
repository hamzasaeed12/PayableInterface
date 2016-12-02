import java.util.*;
import java.util.Date;

public class Billing 
{
   public static void main( String args[] )
   {
            
      Scanner scan = new Scanner(System.in);
      List<Payable> BILLS = new ArrayList<Payable>();
      //Get and print today's date.
      Date date = new Date();
      System.out.println("Welcome! Today's Date is: " + date.toString());


      System.out.print("Enter I for Invoice, S for SalariedEmployee, P to process or Q to quit: ");
      String input = scan.next();
      String number,name;
      int quantity;
      double amount;
      
      while(input != "Q")
      {

      switch(input){
      case "I":
            System.out.println("Enter part number: ");
            number = scan.next();
            System.out.println("Enter part name: ");
            name = scan.next();
            System.out.println("Enter quantity: ");
            quantity = scan.nextInt();
            System.out.println("Enter amount: ");
            amount = scan.nextDouble();
            BILLS.add(new Invoice(number, name, quantity, amount));
            break;
      case "S":
            System.out.println("Enter first name: ");
            String firstN = scan.next();
            System.out.println("Enter middle name: ");
            String middleN = scan.next();
            System.out.println("Enter last name: ");
            String lastN = scan.next();
            System.out.println("Enter SSN: ");
            String ssn = scan.next();
            System.out.println("Enter salary ammount: ");
            Double salaryAmount = scan.nextDouble();
            BILLS.add(new SalariedEmployee( firstN, middleN,lastN, ssn, salaryAmount ));
            break;
      case "P":
            System.out.println( "Processed Invoices and Employees:\n" ); 
            // generically process each element in array BILLS
            try {
            for ( Payable currentBill : BILLS )
                  {
                  // output currentBill and its appropriate payment amount
                  System.out.printf( "%s \n%s: $%,.2f\n\n", 
                        currentBill.toString(), 
                        "Payment", currentBill.getPaymentAmount() ); 
                  }
            }
            catch (Exception e)
            {
                  System.out.println(e.toString());
            }
            break;
      default: 
            System.exit(1);
      }

      System.out.print("Enter I for Invoice, S for SalariedEmployee, P to process or Q to quit: ");
       input = scan.next();
   }
   
   }
} 
