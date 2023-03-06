import java.util.Scanner;

public class CountingMonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Введите cумму в десятичном формате ");
        double amount = input.nextDouble();
        int cents = (int) (amount * 100);

        int dollars = cents / 100;
        cents = cents % 100;

        int quarter = cents / 25;
        cents = cents % 25;

        int dime = cents / 10;
        cents = cents % 10;

        int nickel = cents / 5;
        cents = cents % 5;

        int penny = cents;

        System.out.println("Доллары: " + dollars);
        System.out.println("Четвертаки: " + quarter);
        System.out.println("Десятицентники: " + dime);
        System.out.println("Никели: " + nickel );
        System.out.println("Пенни: " + penny);

    }
}
