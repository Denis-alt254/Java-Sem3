class SubString {
    public int lengthOfLongestSubstring(String s) {
        String[] array = {s};
        
        for (int i = 0; i<array.length; i++ ){
            if(array[0] != array[i]){
            return i;
        }
        }
        
        
    }

    public static void main(String[] args){
        SubString sub = new SubString();
        
        try{
            sub.lengthOfLongestSubstring("abcabcbb");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}