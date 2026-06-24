package nivell01.exercici02;

public class Main {
    public static void main(String[] args) {
        NumLettersMap table = new NumLettersMap();
        CalculateNIF calculator = new CalculateNIF();
        int num = 47879099;
        char letter = calculator.calculateLetter(47879099, table.getMap());
        System.out.printf("%d%c", num, letter);
    }
}

