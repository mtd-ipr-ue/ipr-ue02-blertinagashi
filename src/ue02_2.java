import java.util.Scanner;

import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
        System.out.println("Geben Sie einen Wert von 1 - 12 ein");
        int month= scanner.nextInt();
        
        System.out.println("Geben Sie eine Jahreszahl ein");
        int year= scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Ungültige Eingabe");
            return;
        } 
           
        boolean schaltjahr= (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

       
        int days = switch(month) {
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        case 4, 6, 9, 11 -> 30;
        case 2 -> schaltjahr ? 29: 28;
        default -> throw new IllegalArgumentException("Ungültiger Monat:" + month);
       };
       System.out.println(" Der Monat " + month + " im Jahr " + year + " hat " + days + " Tage. ");   
    }
        
        }
        }


       
    
    

