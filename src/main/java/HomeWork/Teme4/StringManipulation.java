package Teme4;

import java.util.*;

class StringManipulation {
    public static void main(String[] args) {
        reverseMethod();
        PrintDuplicates();
        CheckIfAnagram();
        CheckIfDigits();
        Vowels();
        CountOccurence();
        NonRepeteadChar();
        ConvertStringToInt();
        ReversedString();
        Rotation();
        Palindrome();
        LongestSubString();


    }

    private static void reverseMethod() {
        String name = "Covid18";
        String reverse = new StringBuffer(name).reverse().toString();
        //String rev = reverse.toLowerCase();
        System.out.println(reverse);
    }

    private static void PrintDuplicates() {
        String name = "Bonbonjoviistyla";
        char[] chars = name.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("Duplicate characters:" + map);
    }

    private static void CheckIfAnagram() {
        String s1 = "cat";
        String s2 = "atc";
        if (
                Arrays.equals(s1.chars().sorted().toArray(),
                        s2.chars().sorted().toArray())) {
            System.out.println("The given Strings are anagram of each other");
        } else {
            System.out.println("The given Strings aren't anagram of each other");
        }
    }

    private static void CheckIfDigits() {
        String text = "12325321412";
        if (text.matches("[a-zA-Z]+")) {
            System.out.println("The string contains only alphabetical letter");
        } else if (text.matches("[0-9]+")) {
            System.out.println("The String contains only digits");
        }

    }

    private static void Vowels() {
        String str = "TryingThisThingBlaBla";
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }

    }

    private static void CountOccurence() {
        String name = "Ya need to hide your kidss hide , hide dumbbuuubb";
        String occ = "hide";
        String[] a = name.split(" ");
        int count = 0;
        for (String s : a) {
            // if match found increase count
            if (occ.equals(s))
                count++;
        }
        System.out.println("Occurence: " + count);
    }

    private static void NonRepeteadChar() {
        String str1 = "GGGGgetssumhein fffascarr ew";
        //System.out.println("The given string is: " + str1);
        for (int i = 0; i < str1.length(); i++) {
            boolean boo = true;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    boo = false;
                    break;
                }
            }
            if (boo) {
                System.out.println("The first non repeated character in String is: " + str1.charAt(i));
                break;
            }
        }

    }

    private static void ConvertStringToInt() {
        String s = "-123";
        boolean isNegative;
        int number = 0;
        isNegative = true;

        for (int i = 1; i < s.length(); i++) {

            number = number * 10 + s.charAt(i) - '0';
        }
        if (isNegative) {
            number = -number;
        }
        System.out.println(number);
    }

    private static void ReversedString() {
        String str = "Do bi do ba do doberman";
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString.insert(0, words[i]);
            else
                reversedString.insert(0, " " + words[i]);
        }

        System.out.print("Reversed string : " + reversedString);
    }

    private static void Rotation() {
        String str1 = "ABBA";
        String str2 = "ABBAAAA";
        String str3 = str1 + str1;

        if (str1.length() != str2.length()) {
            System.out.println("\nThe words need to be the same length ");
        } else if (str3.contains(str2)) {
            System.out.println("\nThe words are rotation of each other");
        } else {
            System.out.println("\nthe words aren't rotations of each other");
        }


    }

    private static void Palindrome() {
        String original = "GEEG";
        StringBuilder reverse = new StringBuilder();

        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse.append(original.charAt(i));
        if (original.equals(reverse.toString()))
            System.out.println("Stringul introdus este un palindrom.");
        else
            System.out.println("Stringul introdus nu este un palindrom.");

    }

    private static void LongestSubString() {
        String input = "substringfindout";

            HashSet<Character> set = new HashSet<>();

            String longestOverAll = "";
            String longestTillNow = "";

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (set.contains(c)) {
                    longestTillNow = "";
                    set.clear();
                }
                longestTillNow += c;
                set.add(c);
                if (longestTillNow.length() > longestOverAll.length()) {
                    longestOverAll = longestTillNow;
                    System.out.println( longestOverAll.length());
                }

            }

    }


    }


