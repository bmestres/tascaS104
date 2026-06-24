package nivell02;

import java.util.ArrayList;

public class Structure {

    public static final int MAX_NUM = 4;

    private Integer number;
    private ArrayList<Object> arr;

    public Structure(){
        this.arr = new ArrayList<Object>();
    }

    public void setInteger(Integer number){
        this.number = number;
    }

    public Integer getInteger(){
        return this.number;
    }
}
