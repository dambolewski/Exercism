public class SalaryCalculator {
    public static double multiplierPerDaysSkipped(int daysSkipped) {
        if (daysSkipped > 5) {
            return 0.85;
        } else
            return 1;
    }

    public static int multiplierPerProductsSold(int productsSold) {
        if (productsSold > 20)
            return 13;
        else return 10;
    }

    public static double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public static double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000 * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        if(salary >2000)
            return 2000;
        else return salary;
    }
}
