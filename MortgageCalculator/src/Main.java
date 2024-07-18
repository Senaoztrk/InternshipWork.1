import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;

        Scanner inp= new Scanner(System.in);
        int principal=0;
        float monthlyInterest=0;
        int numOfPayments=0;

        while(true)
        {
            System.out.print("Principal: ");
            principal=inp.nextInt();
            if(principal>=1000 && principal<=1_000_000)
            {
                break;
            }
            else {
                System.out.println("Enter value between 1000 and 1.000.000");
            }

        }


        while(true)
        {
            System.out.print("Annual Interest Rate: ");
            float annualInterest=inp.nextFloat();
            if(annualInterest>1 && annualInterest<30)
            {
                monthlyInterest= annualInterest/PERCENT/MONTHS_IN_YEAR;
                break;
            }
            else {
                System.out.println("Enter value between 1 and 30");
            }


        }

        while(true)
        {
            System.out.print("Period(Years): ");
            byte years=inp.nextByte();
            if(years>1 && years<30)
            {
                numOfPayments=years*MONTHS_IN_YEAR;
                break;
            }
            else {
                System.out.println("Enter value between 1 and 30");
            }



        }



        double mortgage=principal*(monthlyInterest*Math.pow(1+monthlyInterest,numOfPayments)
                /(Math.pow(1+monthlyInterest,numOfPayments)-1));

        String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);
    }
}