package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        byte number9 = 9;
        char a = 'a';
        byte number2 = 2;
        char b = 'b';
        byte number5 = 5;
        byte number7 = 7;
        byte number4 = 4;

        String formula = "("+number9 + " * " + a + " * " + a + " - " + number5 + " * "  + b + " + " +
                number2 + " + " + a + " - " + number7 + ") * ((" +  a + " + " + b + " - " +
                number4 + " * " +  a  + " * " + b + ") / " + number2 + ")";

        String formula2 = "(9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2)";
        System.out.println(formula);
        System.out.println(formula2);


    }
}
