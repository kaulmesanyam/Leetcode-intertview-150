import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(true) {
            n = replaceWithSumOfSquares(n);
            if(n == 1) return true;
            if(set.contains(n)) return false;
            set.add(n);
        }
    }

    private int replaceWithSumOfSquares(int n) {
        int num = 0;
        while( n >= 1) {
            int rem = n%10;
            num += rem*rem;
            n = n/10;
        }

        return num;
    }
}
