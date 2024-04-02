package secondsemassignment;


public class numberWords {
    // Naming numbers
    public static String[] ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    public static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    // Convert numbers to words
    public static String convertToWords(int num) {
        if (num < 10) {
            return ones[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + (num % 10 != 0 ? " " + ones[num % 10] : "");
        } else if (num < 1000) {
            return ones[num / 100] + " Hundred" + (num % 100 != 0 ? " " + convertToWords(num % 100) : "");
        } else if (num < 1000000) {
            return convertToWords(num / 1000) + " Thousand" + (num % 1000 != 0 ? " " + convertToWords(num % 1000) : "");
        } else {
            return convertToWords(num / 1000000) + " Million" + (num % 1000000 != 0 ? " " + convertToWords(num % 1000000) : "");
        }
    }
}