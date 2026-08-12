class Solution {
    public int getLucky(String s, int k) {
        int num = 0;

        for(char ch : s.toCharArray()){
            int value = ch - 'a' + 1;

            num += value / 10;
            num += value % 10;
        }

        for(int i = 1; i < k; i++){
            int sum = 0;

            while(num > 0){
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }
}
