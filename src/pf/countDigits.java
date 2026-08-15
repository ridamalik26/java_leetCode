package pf;

public class countDigits {

    static int countDigits(int n) {
        int count = 0;
        while ( n > 0){
            n = n/10;
             count ++;
        }
        return count;
    }
}
