import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(5);
        intList.add(16);
        intList.add(-1);
        intList.add(-2);
        intList.add(0);
        intList.add(32);
        intList.add(3);
        intList.add(8);
        intList.add(23);
        intList.add(4);

        for(int i=0; i < intList.size(); i++){

            if(intList.get(i)<=0 || intList.get(i) % 2 != 0){
                intList.remove(i);
                i--;
            }
        }

        Collections.sort(intList);
        System.out.println(intList);

    }

}
