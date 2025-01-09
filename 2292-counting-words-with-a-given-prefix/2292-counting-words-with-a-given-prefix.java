class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0; i<words.length; i++){
            if(words[i].startsWith(String.valueOf(pref))){
                count++;
            }
        }
        return count;
    }
}