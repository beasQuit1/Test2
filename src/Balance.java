public class Balance {
    // write your code here
    public static void main(String[] args) {


        int r = 6, l = 4;

        void addRight ( int n){
            r += n;
        }

        void addLeft ( int n){
            l += n;
        }

        String getSituation () {
            if (r == l) return "=";
            else if (r > l) return "r";
            else return "l";
        }
    }
}