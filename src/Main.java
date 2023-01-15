public class Main {
    public static void main(String[] args)

    {
        //Задача 1
         int apple = 128705;
       System.out.println(apple);
         byte orange = 126;
        System.out.println(orange);
        short peach = 32564;
        System.out.println(peach);
        long pineapple = 896549348;
        System.out.println(pineapple);
        float tomato = 2.14F;
        System.out.println(tomato);
        double cucumbers = 1.342;
        System.out.println(cucumbers);

        //Задача 2
        float car = 27.12F;
        System.out.println(car);
        long pistonCar = 87678965549L;
        System.out.println(pistonCar);
        double dorCar = 2.786;
        System.out.println(dorCar);
        int mirrorsCar = 569;
        System.out.println(mirrorsCar);
        int wheelCar = -159;
        System.out.println(wheelCar);
        short lightCar = 27897;
        System.out.println(lightCar);
        byte engineCar = 67;
        System.out.println(engineCar);

       // Задача 3
     int ludmilaPavlovna = 23;
     int annaSergeevna = 27;
     int ekaterinaAndreevna = 30;
     int allPaper = 480;
     int studentPaper = allPaper /  (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");

        // Задача 4
        int oneMinPerformance = 16/2;
        int twentyMinPerformance = oneMinPerformance * 20;
        System.out.println("За за 20 минут машина произвела " + twentyMinPerformance + " штук бутылок");
        int twentyForHoursPerformance = 24 * 60 * oneMinPerformance;
        System.out.println("В сутки машина произвела " + twentyForHoursPerformance + " штук бутылок");
        int threeDaysPerformance = twentyForHoursPerformance * 3;
        System.out.println("За 3 дня машина произвела " + threeDaysPerformance + " штук бутылок");
        int oneMonthPerformance = twentyForHoursPerformance * 31;
        System.out.println("За 1 месяц машина произвела " + oneMonthPerformance + " штук бутылок");

        //Задача 5
        byte whiteOneClass = 2;
        byte brownOneClass = 4;
        int oneClassroom = whiteOneClass + brownOneClass;
        int allClassroom = 120 / oneClassroom;
        int allWhite = allClassroom * whiteOneClass;
        int allBrown = 120 - allWhite;
        System.out.println( "В школе, где " +  allClassroom + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

        // Задача 6
        short oneBanana = 80;
        int bananaBreakfast = 5 * oneBanana;
        short milk100ml = 105;
        int milkBreakfast = 2 * milk100ml;
        short iceCreamOnePiece = 100;
        int iceCreamBreakfast = 2 * iceCreamOnePiece;
        short eggOne = 70;
        int eggsBreakfast = 4 * eggOne;
        int allBreakfastGr = bananaBreakfast + milkBreakfast + iceCreamBreakfast + eggsBreakfast;
        int allBreakfastKg = allBreakfastGr / 1000;
        System.out.println("Вес спортзавтрака " + allBreakfastGr + " граммов или " + allBreakfastKg + " килограмм");

        // Задача 7
        int excessWeight = 7000;
        int firstDiet = 250;
        int secondDiet = 500;
        int daysFirstDiet = excessWeight / firstDiet;
        int daysSecondDiet = excessWeight / secondDiet;
        System.out.println("Если спортсмен будет терять каждый день по " + firstDiet + " грамм, на похудение уйдет " + daysFirstDiet + " дней.");
        System.out.println("Если спортсмен будет терять каждый день по " + secondDiet + " грамм, на похудение уйдет " + daysSecondDiet + " дней.");
        int averegeDays = (daysSecondDiet + daysFirstDiet) / 2;
        System.out.println("в среднем может потребоваться " + averegeDays + " дней, чтобы добиться результата похудения.");


         // Задача 8
        int mashaSalary = 67760;
        int mashaYearSalary = mashaSalary * 12;
        int mashaNewSalary = mashaSalary + (mashaSalary / 100 * 10);
        int mashaYearNewSalary = mashaNewSalary * 12;
        int mashaIncreaseYear = mashaYearNewSalary - mashaYearSalary;

        int denisSalary = 83690;
        int denisYearSalary = denisSalary * 12;
        int denisNewSalary = denisSalary + (denisSalary / 100 * 10);
        int denisYearNewSalary = denisNewSalary * 12;
        int denisIncreaseYear = denisYearNewSalary - denisYearSalary;

        int kristinaSalary = 76230;
        int kristinaYearSalary = kristinaSalary * 12;
        int kristinaNewSalary = kristinaSalary + (kristinaSalary / 100 * 10);
        int kristinaYearNewSalary = kristinaNewSalary * 12;
        int kristinaIncreaseYear = kristinaYearNewSalary - kristinaYearSalary;

       System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaIncreaseYear + " рублей");
       System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisIncreaseYear + " рублей");
       System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaIncreaseYear + " рублей");

    }
}       