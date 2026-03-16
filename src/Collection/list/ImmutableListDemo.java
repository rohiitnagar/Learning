package Collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {
    public static void main(String[] args) {
        List<Integer> acNum = new ArrayList<>();
        acNum.add(64489);
        acNum.add(64646);
        acNum.add(87998);
        addTenDollars(acNum);
        acNum = Collections.unmodifiableList(acNum);
    }

    private static List<Integer> addTenDollars(List<Integer> acNums){
        for(Integer account : acNums){
            System.out.println("Ten Dollars credited to account");
        }
        return acNums;
    }
}
