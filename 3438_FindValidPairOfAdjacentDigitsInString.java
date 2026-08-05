class Solution {
    public String findValidPair(String s) {
      int[] freq = new int[10];

      for(char ch : s.toCharArray()){
        freq[ch - '0']++;
      }  

      for(int i = 0; i < s.length() - 1; i++){
        char first = s.charAt(i);
        char second = s.charAt(i+1);

        if(first != second && freq[first - '0'] == first - '0' && freq[second - '0'] == second - '0'){
            return "" + first + second;
        }
      }

      return "";
    }
}
