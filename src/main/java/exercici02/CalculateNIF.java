package exercici02;

import java.util.HashMap;

public class CalculateNIF {

    public char calculateLetter(int nif, HashMap<Integer, Character> table){
        int result = nif%23;
        return table.get(result);
    }
}
