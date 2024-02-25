public class CountingOddNumbers {
    public int countOdds(int low, int high) {
        // 1 3 5 7 2n-1
        if(low%2 == 0){
            low++;
        }
        if(high%2 == 0){
            high--;
        }
        int a = (low+1)/2;
        int b = (high+1)/2;
        return b-a+1;

    }
}
