    class Solution {
        public String reverseStr(String s, int k) {
            char[] str = s.toCharArray();

            for(int i = 0; i < str.length; i += 2 * k){
                int left = i;
                int right = Math.min(i + k - 1, str.length - 1);
                while(left < right){
                    char temp = str[left];
                    str[left] = str[right];
                    str[right] = temp;
                    left++;
                    right--;
                }
                
            }
            return new String(str);
        }
    }