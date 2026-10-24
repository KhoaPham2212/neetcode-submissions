class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        // create array int with 250 re = 0
        int[] arr = new int[26];

        for(int i = 0; i < magazine.length(); ++i){
            int c = magazine.charAt(i) - 'a';
            arr[c] += 1;
        }   

        for(int i = 0; i < ransomNote.length(); ++i){
            int c = ransomNote.charAt(i) - 'a';
            if(arr[c] == 0) return false;
            arr[c] -= 1;
        }

        return true;
    }
}