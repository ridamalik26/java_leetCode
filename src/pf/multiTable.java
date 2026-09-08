package pf;

public class multiTable {
    static void multiTable(int num){
        for(int i = 1; i <= 10; i++ ){
            int table = num * i;
            System.out.println(
                    num + " x " + i + " = " + table
            );
        }
    }
}
