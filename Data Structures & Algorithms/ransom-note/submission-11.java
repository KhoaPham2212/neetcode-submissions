class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        // create array int with 250 re = 0
        int[] arr = new int[130];

        for(int i = 0; i < magazine.length(); ++i){
            char c = magazine.charAt(i);
            arr[c] += 1;
        }   

        for(int i = 0; i < ransomNote.length(); ++i){
            char c = ransomNote.charAt(i);
            if(arr[c] == 0) return false;
            arr[c] -= 1;
        }

        return true;
    }
}