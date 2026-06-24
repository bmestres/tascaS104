package exercici02;

import java.util.HashMap;

public class CalculateNIF {

    public char calculateLetter(int nif, HashMap<Integer, Character> table){
        if(nif < 0){
            throw new IllegalArgumentException(Message.E_NEGATIVE_NOT_ALLOWED);
        }

        int result = nif%23;
        return table.get(result);
    }
}
