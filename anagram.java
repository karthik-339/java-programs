import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();
        sc.close();
        int i;
        if (str.length() != str2.length()) {
            System.out.println("Strings are not anagrams");
        } else {
            char freq[] = new char[26];
            char freq2[] = new char[26];
            for (i = 0; i < str.length(); i++) {
                if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                        && (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')) {
                    freq[str.charAt(i) - 'a']++;
                    freq2[str2.charAt(i) - 'a']++;
                } else {
                    System.out.println("Strings are not anagrams");
                    return;
                }
            }
            for (i = 0; i < 26; i++) {
                if (freq[i] != freq2[i]) {
                    System.out.println("Strings are not anagrams");
                    break;
                }
            }
            if (i == 26) {
                System.out.println("Strings are anagrams");
            }
        }
    }
}
