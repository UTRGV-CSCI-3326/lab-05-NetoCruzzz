public class DataConversion {

    public static void main(String[] args) {
        // Conv. string into float;
        String strFloat = "374.25";
        float from_strFloat = Float.parseFloat(strFloat);

        // Conv. string into integer;
        String strInt = "1250";
        int from_strInt = Integer.parseInt(strInt);

        // Conv. float into integer;
        float floatNum = 56.715f;
        int from_floatNum = (int) floatNum;

        // Conv. integer into float;
        int intNum = 1500;
        float from_intNum = (float) intNum;

        // Conv. the double into string;
        double doubleNum = 3.13149265;
        String from_doubleNum = Double.toString(doubleNum);
    }
}

