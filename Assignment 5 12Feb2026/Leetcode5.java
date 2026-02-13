package Assignment 5 12Feb2026;

public class Leetcode5 {
    
}
class Solution {
public:
    int countMonobit(int n) {
        int count = 1;
        int iterator = 1;
        int i=1;
        while(iterator<=n){
            iterator+=pow(2,i++);
            count++;
        }
        return count;
    }
};