package Array.main;

public class ForLoop {
    public static void main(String[] args) {
        int mobileNumber[] = new int[116];

        mobileNumber[0] = 3734472;
        mobileNumber[5] = 3734472;
        mobileNumber[54] = 3734472;
        mobileNumber[52] = 3734472;
        mobileNumber[36] = 3734472;
        for(int i=0; i<mobileNumber.length; i++){
            System.out.println("The eleemnt at index:"+i +"is:"+mobileNumber[i]);
        }

        String names[] = new String[12];
        for(int i=0; i<names.length; i++){
            System.out.println("The eleemnt at index:"+i +"is:"+names[i]);
        }
    }
}
