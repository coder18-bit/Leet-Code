class Solution {
    public boolean isvowel(char c){
            if(c == 'a' || c == 'A' || c == 'E'|| c == 'e' || c == 'i' ||
             c =='I' || c == 'o' || c == 'O' || c =='u' || c == 'U'){
                return true;
             }
             else {
                return false;
        }
    }
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int i=0;
        int j= arr.length -1;
        while(i<j){
            if(!isvowel(arr[i])) i++;
            else if(!isvowel(arr[j])) j--;
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}