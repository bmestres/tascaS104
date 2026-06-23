package exercici02;

import java.util.HashMap;
import java.util.Map;

public class NumLettersMap {

    private Map<Integer, Character> map;
    private Character[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public NumLettersMap(){
        this.map = initMap();
    }

    public HashMap<Integer, Character> getMap(){
        return new HashMap<Integer, Character>(this.map);
    }

    private HashMap<Integer, Character> initMap(){
        HashMap<Integer, Character>map = new HashMap<Integer, Character>();
        for(int i = 0; i < this.letters.length; i++){
            map.put(i, this.letters[i]);
        }
        return map;
    }
    public void print(){
        for (Map.Entry<Integer, Character> entry : this.map.entrySet()){
            System.out.printf("(%d, %c)\n", entry.getKey(), entry.getValue());
        }
    }
}
