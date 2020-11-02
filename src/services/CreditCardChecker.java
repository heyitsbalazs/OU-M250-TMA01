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

    public int findC(int S) {
        int result = S / 10;
        result = result * 10;
        result = result + 10;
        result = result - S;
        return result;
    }

    public int calculateCheckNumber() {
        String cardNumbersToCheck = this.firstFifteen();
        int S = 0;
        boolean isEven = true;

        // Iterate through each character in adjusted longNumber string
        for (char numberChar: cardNumbersToCheck.toCharArray()) {
            // String -> Integer
            int number = Character.getNumericValue(numberChar);

            // Only multiply (and subsequently subtract from)
            if (isEven) {
                number = number * 2;

                if (number > 9) {
                    number = number - 9;
                }
            }

            // Whatever we may have done with "number", let's add it to our result variable
            S = S + number;

            isEven = !isEven;
        }

        return this.findC(S);
    }
}
