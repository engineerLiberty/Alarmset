public class Alarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        // Your code here...
        if(employed==true && vacation==false){
            return true;

        } else {return false;}
    }
    public static int trick(int[] x,int n){
        int result = 0;
        for (int i=0;i<n; i++){
           if(x[i]==8) {
                x[i] += 5;
            }
            else if (!(x[i]%2==0)) {

                x[i] += 3;
            } else if (x[i]%2==0) {
                x[i] += 1;
            }
            result += x[i];
        }
        return result;
    }


}

