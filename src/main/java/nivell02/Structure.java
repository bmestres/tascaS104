package nivell02;

import java.util.*;

public class Structure {

    public static final int MAX_NUM = 4;

    private Integer number;
    private ArrayList<Object> arr;
    private HashMap<Integer, String> map;

    public Structure(){
        this.arr = new ArrayList<Object>();
        this.map = new HashMap<Integer, String>();
    }

    public void setInteger(Integer number){
        this.number = number;
    }

    public Integer getInteger(){
        return this.number;
    }

    public void addToArr(Object object){
        this.arr.add(object);
    }

   public ArrayList<Object> getArr(){
        return this.arr;
   }

   public HashMap<Integer, String> getMap(){
        return this.map;
   }
}
