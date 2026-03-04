package WrapperClass;

/**
 * IApplciabl fro Int Byte Short and Long
 */
public class WrapperObjectCaching {

    public static void main(String[] args) {
        Integer obj1 = 16;
        Integer obj2 = 16;
        System.out.println(obj1 == obj2);

//Caching mechanism : -128 to 127
        Integer obj3 = 161;
        Integer obj4 = 161;
        System.out.println(obj3 ==obj4);
    }
}
