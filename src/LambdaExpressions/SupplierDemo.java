package LambdaExpressions;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Integer> getMonth = ()-> LocalDate.now().getMonthValue();
        System.out.println(getMonth.get());


    }
}
