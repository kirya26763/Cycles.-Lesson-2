public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        {
            int monthly = 15000;
            int total = 0;
            int month = 0;
            while (total <= 2_459_000) {
                double onePrecent = 1D / 100;
                total = total + monthly;
                total = (int) (total * (1 + onePrecent));
                month = month + 1;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
        //Task 2
        System.out.println("Task 2");
        {
            int x = 0;
            while (x < 10) {
                x = x + 1;
                System.out.print(x + " ");
            }
            System.out.println();
            int i;
            for (i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Task 3
        System.out.println("Task 3");
        {
            int yPopulation = 12_000_000;
            int year;
            for (year = 2001; year <= 2010; year++) {
                int mortalityRate = yPopulation * 8 / 1000;
                int birthRate = yPopulation * 17 / 1000;
                yPopulation = yPopulation + birthRate - mortalityRate;
                System.out.println("Год " + year + ", численность населения составляет " + yPopulation);
            }
        }
        //Task 4
        System.out.println("Task 4");
        {
            int total = 15000;
            double sevenPresent = 7d / 100;
            int month = 0;
            while (total < 12_000_000) {
                month++;
                total = (int) (total * (1 + sevenPresent));
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
        //Task 5
        System.out.println("Task 5");
        {
            int total = 15000;
            double sevenPresent = 7d / 100;
            int month = 0;
            while (total < 12_000_000) {
                month++;
                total = (int) (total * (1 + sevenPresent));
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
                }
            }
        }
        //Task 6
        System.out.println("Task 6");
        {
            int total = 15000;
            double sevenPresent = 7d / 100;
            int month = 0;
            int year = 9 * 12;
            while (month < year) {
                month++;
                total = (int) (total * (1 + sevenPresent));
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
                }
            }
        }
        //Task 7
        System.out.println("Task 7");
        {
            int friday = 1;
            int dayMouth = 31;
            for (int day = friday; day <= dayMouth; day += 7) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
        //Task 8
        System.out.println("Task 8");
        {
            int period = 79;
            int startComet = 0;
            int year = 2024;
            int star = year - 200;
            int end = year + 100;
            for (year = startComet; year < end; year = year + period) {
                if (year > star) {
                    System.out.println(year);
                }
            }

        }
    }
}
