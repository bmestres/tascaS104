package exercici02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.Parameter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculateNIFTest {

    @ParameterizedTest
    @CsvSource({"41259309, T", "73981088, R", "19574290, W", "82036403, A", "54612791, G",
            "28495096, M", "67308494, Y", "31824693, F", "95147604, P", "46273893, D"})
    void NumberLetterCorrespondence(int number, char letter){

        NumLettersMap correspondenceTable = new NumLettersMap();
        CalculateNIF calculator = new CalculateNIF();

        char testLetter = calculator.calculateLetter(number, correspondenceTable.getMap());
        assertEquals(testLetter, letter);

    }
}
