public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int targetAmount = 2_459_000;
        int monthlySavings = 15_000;
        int currentAmount = 0;
        int months = 0;
        while (currentAmount < targetAmount) {
            currentAmount += monthlySavings;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + currentAmount + " рублей");
        }
        System.out.println("задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println("задание 3");
        double population = 12_000_000;
        double birthRate = 17.0 / 1000;
        double deathRate = 8.0 / 1000;
        for (int year = 1; year <= 10; year++) {
            population += population * (birthRate - deathRate);
            System.out.println("Год " + year + ", численность населения составляет " + (int) population);
        }
        System.out.println("задание 4");
        double initialAmount = 15_000;
        double interestRate = 0.07;
        months = 0;
        targetAmount = 12_000_000;
        while (initialAmount < targetAmount) {
            initialAmount += initialAmount * interestRate;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + initialAmount);
        }
        System.out.println("задание 5");
        initialAmount = 15_000;
        targetAmount = 12_000_000;
        interestRate = 0.07;
        months = 0;
        while (initialAmount < targetAmount) {
            initialAmount += initialAmount * interestRate;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + initialAmount);
            }
        }
        System.out.println("задание 6");
        initialAmount = 15_000;
        interestRate = 0.07;
        months = 0;
        int years = 9;
        for (i = 1; i <= years * 12; i++) {
            initialAmount += initialAmount * (interestRate / 12);
            months++;
            if (months % 6 == 0) {
                System.out.println("Полгода " + (months / 6) + ", сумма накоплений равна " + initialAmount);
            }
        }
        System.out.println("задание 7");
        int firstFriday = 5;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("задание 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year <= endYear; year++) {
            if ((year % 79) == 0) {
                System.out.println(year);
            }
        }
    }
}