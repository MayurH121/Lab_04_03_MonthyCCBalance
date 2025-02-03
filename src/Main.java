public class Main {
    public static void main(String[] args) {
        int creditCardBalance = 5000;
        double INTEREST_RATE = 0.17;
        double oneMonthInterestRate = 0;
        double twoMonthInterestRate = 0;
        oneMonthInterestRate = creditCardBalance * INTEREST_RATE;
        twoMonthInterestRate = (creditCardBalance + oneMonthInterestRate) * INTEREST_RATE;
        System.out.println(" The interest due after one month is $" +oneMonthInterestRate+ " and the interest due after two months is $" +twoMonthInterestRate);
    }
}