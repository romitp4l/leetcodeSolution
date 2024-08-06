class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder normalText = new StringBuilder();
        for(char c :s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                normalText.append(Character.toLowerCase(c));
            }
            
        }
        
        String normalString = normalText.toString();
        String reversedString = normalText.reverse().toString();
        
        return normalString.equals(reversedString);
        
    /*    
        String normalizedStr = normalized.toString();
        String reversedStr = normalized.reverse().toString();
        return normalizedStr.equals(reversedStr);
       
       */
    }
}