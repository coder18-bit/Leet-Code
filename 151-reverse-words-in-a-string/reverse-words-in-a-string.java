class Solution {
    public void swap(int i,int j,String arr[]){
        String word = arr[i];
        arr[i]=arr[j];
        arr[j]= word;
    }
    public String reverseWords(String s) {
     String words[] =s.trim().split("\\s+");
     int i=0; int j=words.length-1;
     while(i<j){
        swap(i,j,words);
        i++;
        j--;
     }
     return String.join(" ",words);
    }
}