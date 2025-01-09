class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(words[i].charAt(j)==x){
                    l.add(i);
                    break;
                }
            }
        }
        return l;
    }
}