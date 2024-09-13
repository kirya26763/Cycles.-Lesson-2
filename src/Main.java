import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        double monthly = 15000;
        int finalSum = 2_459_000;
        double total = 0;
        int month = 0;
        int sum;
        double precent = 1D / 100;
        while (total <= finalSum) {
            total = total + monthly;
            total += (float) (total * precent);
            month++;
            sum = (int) total;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        //Task 2
        System.out.println("Task 2");
        int x = 0;
        while (x < 10) {
            x++;
            System.out.print(x + " ");
        }
        System.out.println();
        for (; x >= 1; x--) {
            System.out.print(x + " ");
        }
        System.out.println();
        //Task 3
        System.out.println("Task 3");
        int yPopulation = 12_000_000;
        int year;
        for (year = 2001; year <= 2010; year++) {
            int mortalityRate = yPopulation * 8 / 1000;
            int birthRate = yPopulation * 17 / 1000;
            yPopulation += birthRate - mortalityRate;
            System.out.println("Год " + year + ", численность населения составляет " + yPopulation);
        }
        //Task 4
        System.out.println("Task 4");
        finalSum = 12_000_000;
        total = monthly;
        month = 0;
        precent = 7D / 100;
        while (total <= finalSum) {
            month++;
            total += (total * precent);
            sum = (int) total;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        //Task 5
        System.out.println("Task 5");
        month = 0;
        total = monthly;
        while (total < finalSum) {
            month++;
            total += (total * precent);
            sum = (int) total;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        //Task 6
        System.out.println("Task 6");
        month = 0;
        year = 9 * 12;
        total = monthly;
        while (month < year) {
            month++;
            total += (total * precent);
            sum = (int) total;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        //Task 7
        System.out.println("Task 7");
        int friday = 1;
        int dayMouth = 31;
        for (int day = friday; day <= dayMouth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        //Task 8
        System.out.println("Task 8");
        int period = 79;
        int startComet = 0;
        year = 2024;
        int star = year - 200;
        int end = year + 100;
        for (year = startComet; year < end; year += period) {
            if (year > star) {
                System.out.println(year);
            }
        }
    }
}