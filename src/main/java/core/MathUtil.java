package core;

public class MathUtil {
    public static long getFactorial(long num){

        //thuật toán tính n! = 1.2.3...n, n từ 0 tới 20
        if(num < 0 || num > 20){
            throw new IllegalArgumentException("Must: 0 < n < 20");
        }
        if(num == 0){
            return 1;  // n = 0 return ngay
        }

        long result = 1; // khởi đầu giai thừa bằng 1
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}