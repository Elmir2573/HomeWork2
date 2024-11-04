import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //задание 1
int myInt = 25000;
        System.out.println(myInt);
        byte myByte =25;
        System.out.println(myByte);
        short myShort = 1973;
        System.out.println(myShort);
        long myLong = 25896397L;
        System.out.println(myLong);
        float myFloat = 3.14f;
        System.out.println(myFloat);
        double myDouble = 3.156789456;
        System.out.println(myDouble);
        //задание2
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        // задание 3
    byte classLP = 23;
    byte classAS = 27;
    byte classEA = 30;
short totalPaper = 480;
short totalStudent = (short)(classLP + classAS + classEA);
short listCount = (short) (totalPaper / totalStudent);
            System.out.println(" На каждого ученика расчитано " + listCount + " листов бумаги ");
 // Задание 4
 int outputPerMinute = (int) (16/2);
int output20Minute = (int) (20 * outputPerMinute);
            System.out.println("За 20 минут машина произвела " + output20Minute + " штук бутылок");
int output24Hours = (int) (24 * 60 * outputPerMinute);
            System.out.println("За 24 часа машина произвела " + output24Hours + " штук бутылок");
int output3Days = (int)(3 * output24Hours );
            System.out.println("За 3 дня машина произвела " + output3Days + " штук бутылок");
int output30Days = (int)(30 * output24Hours);
            System.out.println("За 30 дней машина произвела " + output30Days + " штук бутылок");
  // Задание 5
  int whitePaintOneClass = 2;
int brownPaintOneClass = 4;
int totalPaint = 120;
int totalClass = (int)(totalPaint/(whitePaintOneClass+brownPaintOneClass));
int totalWhitePaint = (int)(totalClass*2);
int totalBrownPaint = (int)(totalClass*4);
            System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски" );
 // Задание 6
 int oneBananas = 80;
 int milk100ml = 105;
 int oneIceCream = 100;
 int oneEgg = 70;
 int totalBananas = (int)(oneBananas*5);
 int totalMilk = (int)(milk100ml*2);
 int totalIceCream = (int)(oneIceCream*2);
 int totalEgg = (int)(oneEgg*4);
 float totalBreakfastGram = (float)(totalBananas+totalMilk+totalIceCream+totalEgg);
 float totalBreakfastKg = (float)(totalBreakfastGram/1000);
            System.out.println("Завтрак спортсмена весит " + totalBreakfastGram + " грамм");
            System.out.println("Завтрак спортсмена весит " + totalBreakfastKg + " килограмм");
// задание 7
  float totalWeightGram = (float)(7*1000);
  float weightMin = 250f;
  float weightMax = 500f;
  float weightAverage = (float)((500+250)/2);
  float maxDays = (float)(totalWeightGram/weightMax);
  float minDays = (float)(totalWeightGram/weightMin);
  float  averageDays = (float)(totalWeightGram/weightAverage);
            System.out.println("Максимально быстро спортсмен похудеет за " + maxDays + " дней");
            System.out.println("Наиболее долго спортсмен будет худеть " + minDays + " дней");
            System.out.println("В среднем спортсмен похудеет за " + averageDays + " дней");
   // задание 8
    float salaryM = 67760f;
    float salaryD = 83690f;
    float salaryK = 76230f;
    float annualIncomeM = (float)(salaryM*12);
    float annualIncomeD = (float)(salaryD*12);
    float annualIncomeK = (float)(salaryK*12);
    float increasedSalaryM =(float)(salaryM+(salaryM*0.1));
    float increasedSalaryD =(float)(salaryD+(salaryD*0.1));
    float increasedSalaryK =(float)(salaryK+(salaryK*0.1));
    float increasedAnnualIncomeM = (float)(increasedSalaryM*12);
    float increasedAnnualIncomeD = (float)(increasedSalaryD*12);
    float increasedAnnualIncomeK = (float)(increasedSalaryK*12);
    float incomeDifferenceM = (float)(increasedAnnualIncomeM-annualIncomeM);
    float incomeDifferenceD = (float)(increasedAnnualIncomeD-annualIncomeD);
    float incomeDifferenceK = (float)(increasedAnnualIncomeK-annualIncomeK);
    System.out.println("Маша теперь получает " +increasedSalaryM+ " рублей. Годовой доход вырос на " +incomeDifferenceM+ " рублей.");
    System.out.println("Денис теперь получает " +increasedSalaryD+ " рублей. Годовой доход вырос на " +incomeDifferenceD+ " рублей.");
    System.out.println("Кристина теперь получает " +increasedSalaryK+ " рублей. Годовой доход вырос на " +incomeDifferenceK+ " рублей.");
    }
}



