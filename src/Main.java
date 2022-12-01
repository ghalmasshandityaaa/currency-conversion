import currency.Ringgit;
import currency.Sgd;
import currency.Yen;
import currency.Yuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Ringgit ringgit = new Ringgit();
        Yuan yuan = new Yuan();
        Yen yen = new Yen();
        Sgd sgd = new Sgd();
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println(" Welcome to Currency Conversion Ghalmas ");
        System.out.println("========================================");
        System.out.println("Current currency rate");
        System.out.printf("1 IDR = %-8.6f YEN%n", yen.getCurrency());
        System.out.printf("1 IDR = %-8.6f RINGGIT%n", ringgit.getCurrency());
        System.out.printf("1 IDR = %-8.6f SGD%n", sgd.getCurrency());
        System.out.printf("1 IDR = %-8.6f YUAN%n", yuan.getCurrency());
        System.out.println("=========================================");
        System.out.printf("%-20s %20s%n","[1] IDR -> YEN","YEN -> IDR [2]");
        System.out.printf("%-20s %20s%n","[3] IDR -> RINGGIT","RINGGIT -> IDR [4]");
        System.out.printf("%-20s %20s%n","[5] IDR -> SGD","SGD -> IDR [6]");
        System.out.printf("%-20s %20s%n","[7] IDR -> YUAN","YUAN -> IDR [8]");
        System.out.println("[0] EXIT");
        System.out.println("=========================================");
        System.out.print("Select menu : ");
        int choice = input.nextInt();

        double amount = 0;
        if(choice > 0 && choice <= 8) {
            System.out.print("Input amount : ");
            amount = input.nextDouble();
        }

        switch(choice) {
            case 1:
                System.out.printf("Result : %.2f YEN%n", yen.toYen(amount));
                break;
            case 2:
                System.out.printf("Result : %.2f IDR%n", yen.fromYen(amount));
                break;
            case 3:
                System.out.printf("Result : %.2f RINGGIT%n", ringgit.toRinggit(amount));
                break;
            case 4:
                System.out.printf("Result : %.2f IDR%n", ringgit.fromRinggit(amount));
                break;
            case 5:
                System.out.printf("Result : %.2f SGD%n", sgd.toSgd(amount));
                break;
            case 6:
                System.out.printf("Result : %.2f IDR%n", sgd.fromSgd(amount));
                break;
            case 7:
                System.out.printf("Result : %.2f YUAN%n", yuan.toYuan(amount));
                break;
            case 8:
                System.out.printf("Result : %.2f IDR%n", yuan.fromYuan(amount));
                break;
            default:
                System.out.println("Thank you for using the currency converter app");
                break;
        }

        input.nextLine();
        System.out.print("Have you finished using the application [y/n] : ");
        String repeat = input.nextLine();

        if(repeat.equals("n")) menu();
        else System.out.println("Goodbye!");
    }
}