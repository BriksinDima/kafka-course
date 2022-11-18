package io.conducktor.demos.kafka.opensearch;

public class Solution {
    public static void main(String[] args) {
        new Solution().guessNumber(10);
    }
    public int guessNumber(int n) {
        boolean isNotGuessed = true;
        while(isNotGuessed) {
            int mid = n / 2;
            if(mid == 0) {
                return mid;
            } else if (mid < 0) {
                n = mid + 1;
            } else {
                n = mid - 1;
            }
        }
        return n;
    }
}