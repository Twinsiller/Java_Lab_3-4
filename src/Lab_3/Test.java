package Lab_3;

import java.util.Scanner;

public class Test
{
    public static void main (String[] args)
    {
        String name; int year, number;
        FurnitureShop shop = new FurnitureShop();
        String sc;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Do you want to create? If you want create cupboard press c/If you want create sofa press s :");

            sc = scan.nextLine();
            if (sc == "s") {
                System.out.print("Enter name: ");
                name = scan.nextLine();
                System.out.print("Enter year: ");
                year = scan.nextInt();
                System.out.print("Enter number: ");
                number = scan.nextInt();
                shop.createSofa(name, year, number);
            } else {
                System.out.print("Enter name: ");
                name = scan.nextLine();
                System.out.print("Enter year: ");
                year = scan.nextInt();
                System.out.print("Enter number: ");
                number = scan.nextInt();
                shop.createCupboard(name, year, number);
            }
            System.out.print("Do you want to create another furniture? (yes/no) ");
            sc = scan.nextLine();
        }
        while (sc == "yes");
    }
}