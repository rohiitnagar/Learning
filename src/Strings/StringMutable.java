package Strings;

public class StringMutable {
    public static void main(String[] args) {

        //Approach1
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("World");
        stringBuilder.insert(0,"Hello");
        stringBuilder.deleteCharAt(4);
        stringBuilder.insert(4,'o');
        stringBuilder.setLength(5);
        stringBuilder.reverse();

        //Approach2
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("World");
        stringBuffer.insert(0,"Hello");
        stringBuffer.deleteCharAt(4);
        stringBuffer.insert(4,'o');
        stringBuffer.setLength(5);
        stringBuffer.reverse();

    }
}
