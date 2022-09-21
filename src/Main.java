public class Main {
    public static int sum(int k){
        if( k>0) {
            return k + sum(k - 1);
        }
        else
        {
            return 0;
        }
    }
    int home=7;
    public static void main(String [] args){
        int result = sum(300);
       // Main dhhd = new Main();
        //dhhd
        System.out.println(result);
    }
}
