import java.util.Scanner;
public class IT24101148Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBill, discount, amountToPay;

        
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Enter the total bill amount for customer %d: ", i);
            totalBill = scanner.nextDouble();
            System.out.print("Enter the mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

           
            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = totalBill * 0.05; 
                amountToPay = totalBill - discount;
                System.out.printf("Discount: %.2f\n", discount);
                System.out.printf("Amount to be paid: %.2f\n", amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.printf("No discount applied. Amount to be paid: %.2f\n", totalBill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(); 
        }

        scanner.close();
    }
}
