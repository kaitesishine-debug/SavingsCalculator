// Program for calculating customer savings and interest
public class SavingsCalculator {
    public static void main(String[] args) {
   // Store the deposit amounts for the three customers
    int deposit1 = 99999;
    int deposit2 = 150000;
    int deposit3 = 75000;

    double interestRate = 0.0755; 

    // Calculate interest for each customer
    double interest1 = deposit1 * interestRate;
    double interest2 = deposit2 * interestRate;
    double interest3 = deposit3 * interestRate;

    // Convert interest values from double to int using explicit casting
    int wholeInterest1 = (int) interest1;
    int wholeInterest2 = (int) interest2;
    int wholeInterest3 = (int) interest3;

    // Round interest values to the nearest whole number
    long roundedInterest1 = Math.round(interest1);
    long roundedInterest2 = Math.round(interest2);
    long roundedInterest3 = Math.round(interest3);

    // Calculate total deposits and total interest
    int totalDeposits = deposit1 + deposit2 + deposit3;

    double totalInterest = interest1 + interest2 + interest3;

    System.out.println("=== Savings Summary ===");
    System.out.println("Total Deposits: " + totalDeposits); 
    System.out.println("Total Interest: " + totalInterest); 

    double finalBalance = totalDeposits + totalInterest;

    System.out.println("Final Balance: " + finalBalance);
    

    System.out.println("=== Customer Interest Details ===");

    System.out.println("Customer 1 Interest: " + interest1);
    System.out.println("Customer 1 Whole Interest: " + wholeInterest1);
    System.out.println("Customer 1 Rounded Interest: " + roundedInterest1);

    System.out.println();

    System.out.println("Customer 2 Interest: " + interest2);
    System.out.println("Customer 2 Whole Interest: " + wholeInterest2);
    System.out.println("Customer 2 Rounded Interest: " + roundedInterest2);

    System.out.println();

    System.out.println("Customer 3 Interest: " + interest3);
    System.out.println("Customer 3 Whole Interest: " + wholeInterest3);
    System.out.println("Customer 3 Rounded Interest: " + roundedInterest3);

    System.out.println();
    
    
    }
}