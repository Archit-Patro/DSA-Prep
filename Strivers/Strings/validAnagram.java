package Strivers.Strings;

import java.util.Scanner;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine().toLowerCase();  // converting to lowercase to handle case insensitivity
        System.out.print("Enter second string: ");
        String t = sc.nextLine().toLowerCase();
        
        validAnagram validator = new validAnagram();
        boolean result = validator.isAnagram(s, t);
        
        if(result){
            System.out.println("\"" + s + "\" and \"" + t + "\" are anagrams.");
        } else {
            System.out.println("\"" + s + "\" and \"" + t + "\" are NOT anagrams.");
        }
        sc.close();
    }
}