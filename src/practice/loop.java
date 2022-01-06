package practice;

public class loop {
    public static void main(String[] args) {
        for (String arg : args){
            System.out.println("\n******");

            if(existOnlyDoubleChars(arg)){
                System.out.println("Введено не целое число");
                continue;
            }

            if(existNonDigitChars(arg)){
                System.out.println("Введено не число");
                continue;
            }

            if(!isDigitOnly(arg)){
                System.out.println("Ошибка такой ситуации возникнуть вообще не должно было");
                return;
            }

            int result = addPartsNumber(Integer.parseInt(arg));

            System.out.println(formatNumberForAdd(arg, result));
        }
    }

    public static String formatNumberForAdd(String number){
        int parsedNumber = Integer.parseInt(number);

        return formatNumberForAdd(parsedNumber, addPartsNumber(parsedNumber));
    }

    public static String formatNumberForAdd(String number, int result){
        String format = "";
        char[] chars = number.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            format += chars[i];
            if(i != chars.length - 1){
                format += " * ";
            }
        }

        format += " = " + result;

        return format;
    }

    public static String formatNumberForAdd(int number, int result){
        String format = "";

        int countNumber = 0;
        int numberForCount = number;
        while (numberForCount > 0){
            countNumber++;
            numberForCount /= 10;
        }

        int[] partsNumber = new int[countNumber];

        for (int i = partsNumber.length - 1; i >= 0; i--) {
            partsNumber[i] = number % 10;
            number /= 10;
        }

        int index = 0;
        for (int value : partsNumber) {
            format += value;
            if (index++ != partsNumber.length - 1){
                format += " * ";
            }
        }
        format += " = " + result;

        return format;
    }

    public static int addPartsNumber(int number){
        int add = 1;
        while (number > 0){
            int partNumber = number % 10;
            add *= partNumber;
            number /= 10;
        }
        return add;
    }

    /**
     * Проверяет строку на наличие только цифр
     * @param str проверяемая строка
     * @return true - если в строке только цифры, в противном случает false
     */
    public static boolean isDigitOnly(String str){
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char symbol = str.charAt(i);
            if(symbol < '0' || symbol > '9'){
                return false;
            }
        }
        return true;
    }

    /**
     * Проверяет строку на не цифровых символов
     * @param str проверяемая строка
     * @return true - если в строке найден символ отличный от цифры, в противном случает false
     */
    public static boolean existNonDigitChars(String str){
        return !isDigitOnly(str);
    }

    /**
     * Проверяет строку на наличие символов используемых в дробных числах
     * @param str проверяемая строка
     * @return true - если в строке найдены только символы используемые в дробных числах, в противном случает false
     */
    public static boolean existOnlyDoubleChars(String str){
        int length = str.length();
        int countDot = 0;
        for (int i = 0; i < length; i++) {
            char symbol = str.charAt(i);
            if((symbol < '0' || symbol > '9')){
                if(symbol == '.' && countDot == 0){
                    countDot++;
                } else {
                    return false;
                }
            }
        }
        return countDot == 1;
    }
}
