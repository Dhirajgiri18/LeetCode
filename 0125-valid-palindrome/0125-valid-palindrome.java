class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=s.length()-1; i>=0; i--){
            if(Character.isLetterOrDigit(s.charAt(i)))
                sb.append(Character.toLowerCase(s.charAt(i)));
        }

        StringBuilder original = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                original.append(Character.toLowerCase(s.charAt(i)));
        }

        return (sb.toString()).equals(original.toString());
    }
}