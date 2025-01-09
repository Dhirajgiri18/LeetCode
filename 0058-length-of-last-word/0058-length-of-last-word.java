class Solution {
    public int lengthOfLastWord(String s) {
     String[] st = s.split(" ");
     int l = st[st.length-1].length();
     return l;

    //  int count=0;
    //  for(int i=s.length()-1; i>=0; i--){
    //     if(s.charAt(i)!=' '){
    //         count++;
    //     }else{
    //         break;
    //     }
    //  }
    //  return count;
    }
}