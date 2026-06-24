package exercici02;

import java.util.HashMap;

public class CalculateNIF {

    public char calculateLetter(int nif, HashMap<Integer, Character> table){
        if(nif < 0){
            throw new IllegalArgumentException(Message.E_NEGATIVE_NOT_ALLOWED);
        }
        if(nif > 99999999){
            throw new IllegalArgumentException(Message.E_TOO_LARGE_VALUE);
        }

        int result = nif%23;
        return table.get(result);
    }
}
