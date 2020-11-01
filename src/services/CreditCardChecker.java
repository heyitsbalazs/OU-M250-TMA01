package services;

/**
 * Answer to TMA01 Question 1
 *
 * @author Balazs Otakomaiya
 * @version 01.11.2020
 */
public class CreditCardChecker {
    public String longNumber;

    public String getLongNumber() {
        return longNumber;
    }

    public CreditCardChecker(String longNumber) {
        this.longNumber = longNumber;
    }

    public boolean isCorrectLength()
    {
        return this.longNumber.length() == 16;
    }

    public String firstFifteen()
    {
        return this.longNumber.substring(0, 15);
    }

    private int findC(int s) {
        int result = s / 10;
        result = result * 10;
        result = result + 10;
        result = result - s;
        return result;
    }

    public calculateCheckNumber() {
        String iterableLongNumber = this.firstFifteen();
    }
}
