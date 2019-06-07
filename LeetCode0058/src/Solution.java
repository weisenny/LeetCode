class Solution {
    public int lengthOfLastWord(String s) {
        if(s.equals(" "))
            return 0;

       String [] cs= s.split(" ");
       return cs[cs.length-1].length();

    }
}