import java.util.Scanner;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"1.Молоко", "2.Хлеб", "3.Гречневая крупа", "4.Мясо", "5.Сахар"};
        int[] prices = {50, 15, 60, 120, 45};
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + prices[i] + " " + "руб/шт");
        }

        int sumProducts = 0;

        int[] count = new int[products.length];
        while (true) {
            System.out.println("Выберите товар и количество или введите 'end'");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Ваша корзина:");
                for (int i = 0; i < products.length; i++) {
                    if (count[i] != 0) {
                        System.out.println(
                                products[i] + " " + count[i] + " " + "шт" + " " + prices[i] + " " + "руб/шт" + " общая сумма:" + " "
                                        + count[i] * prices[i] + " рублей в сумме");
                    }
                }
                System.out.println("Итого: " + sumProducts + " " + "рублей");
                break;
            }

            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);
            int currentPrice = prices[productNumber];
            sumProducts += currentPrice * productCount;
            count[productNumber] += productCount;
        }
    }
}