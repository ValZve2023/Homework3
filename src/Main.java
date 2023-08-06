public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        // task 1
        System.out.println("task1");
        int allDays = 365;
        System.out.println("Значение переменной all days с типом int" + " равно " + allDays);
        byte weekDays = 6;
        System.out.println("Значение переменной week days с типом byte " + " равно " + weekDays);
        short workHours = 100;
        System.out.println("Значение переменной work hours с типом short " + " равно " + workHours);
        long allSekond = 346254;
        System.out.println("Значение переменной all second с типом long " + " равно " + allSekond);
        float percentageOfApples = 3.5f;
        System.out.println("Значение переменной percentage of apples с типом float " + " равно " + percentageOfApples);
        double percentageOfEfficiency = 35.7;
        System.out.println("Значение переменной percentage of efficiency с типом double " + " равно " + percentageOfEfficiency);
    }
        public static void task2() {
            // task 2
            System.out.println("task2 is done");
            float a = 27.12f;
            long b = 987_678_965_549L;
            double c = 2.786;
            short d = 569;
            short e = -159;
            short f = 27897;
            byte g = 67;
        }
    public static void task3() {
        // task 3
        System.out.println("task3");
        short studentsA = 23;
        short studentsB = 27;
        short studentsC = 30;
        int totalStudents = studentsA + studentsB + studentsC;
        short totalPaper = 480;
        System.out.println("На каждого ученика рассчитано " + totalPaper / totalStudents + " листов бумаги");
    }
    public static void task4() {
        // task 4
        System.out.println("task4");
        short bottles = 16;
        short minutes = 2;
        int twentyMinutes = 20 / minutes * bottles;
        int day = 24 * 60 / minutes * bottles;
        int threeDay = 3 * 24 * 60 / minutes * bottles;
        int month = 30 * 24 * 60 / minutes * bottles;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За три дня машина произвела " + threeDay + " штук бутылок");
        System.out.println("За месяц машина произвела" + month + " штук бутылок");
    }
    public static void task5() {
        //task5
        System.out.println("task5");
        int cans = 120;
        int whiteCans = 2;
        int brownCans = 4;
        int classes = cans / (whiteCans + brownCans);
        int totalWhiteCans = classes * whiteCans;
        int totalBrownCans = classes * brownCans;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
    }
    public static void task6() {
        //task6
        System.out.println("task6");
        short bananas = 5 * 80;
        short milk = 200 / 100 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int sportsBreakfast = bananas + milk + iceCream + eggs;
        double sportBreakfastKG = sportsBreakfast / 1000;
        System.out.println(" Спортзавтрак равен " + sportsBreakfast + " грамм");
        System.out.println(" Спортзавтрак равен " + sportBreakfastKG + " килограмм");
    }
    public static void task7() {
        //task7
        System.out.println("task7");
        int targetWeightKG = 7;
        int targetWeight = targetWeightKG * 1000;
        int daysA = targetWeight / 250;
        int daysB = targetWeight / 500;
        System.out.println("На похудение уйдет " + daysA + " дней если спортсмен будет терять каждый день по 250 грамм");
        System.out.println("На похудение уйдет " + daysB + " дней если спортсмен будет терять каждый день по 500 грамм");
        System.out.println("В среднем уйдет " + ((daysA + daysB) / 2) + " дeнь");
    }
    public static void task8() {
        //task8
        System.out.println("task8");
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        float incrSalaryM = salaryM * 1.1f;
        float incrSalaryD = salaryD * 1.1f;
        float incrSalaryK = salaryK * 1.1f;
        float diffSalaryM = incrSalaryM - salaryM;
        float diffSalaryD = incrSalaryD - salaryD;
        float diffSalaryK = incrSalaryK - salaryK;
        System.out.println("Маша теперь получает " + incrSalaryM + " рублей. Годовой доход вырос на "
                + diffSalaryM * 12 + " рублей");
        System.out.println("Денис теперь получает " + incrSalaryD + " рублей. Годовой доход вырос на "
                + diffSalaryD * 12 + " рублей");
        System.out.println("Кристина теперь получает " + incrSalaryK + " рублей. Годовой доход вырос на "
                + diffSalaryK * 12 + " рублей");
    }
}
