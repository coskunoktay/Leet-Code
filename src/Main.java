import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        
    }

        //TODO 1-)sum of digits of a given random number
    private static void sumOfNumbers(int randomNumber) {
        //int randomSayi = (int)(Math.random()*(1000)); //Returns a random number from 0 to 100
        System.out.println("random sayi " + randomNumber); //we printed the generated number to the console
        int ones = randomNumber %10; //ones digit

        randomNumber = randomNumber /10;
        int tens = randomNumber %10;   //tens digit

        int hundreds = randomNumber /10;  //hundreds digit

        System.out.println("Totals ="+(ones+tens+hundreds));
    }


        //TODO 2-)In this problem, we have to find a pair of two distinct indices in a sorted array that
        // their values add up to a given target. We can assume that the array has only one pair of integers that add up to the target sum.
        // Note that the array is sorted in a non-decreasing manner.
    public static int[] twoSum(int[] nums, int target) {

//        input
//        int[] a = {3, 4,5,6};
//        int[] ints = twoSum(a, 18);
//        System.out.println(Arrays.toString(ints));
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
        //TODO  3-)Words that read the same backwards are called palindromic words.
        //    Write the java algorithm code that gives whether a word or sentence entered from the console is palindromic?

    public static boolean isPalindromicWord(String word) {
        //input
        //System.out.println(isPalindromicWord("madam"));//true
        //System.out.println(isPalindromicWord("oktay"));//false
        StringBuilder reverseWord = new StringBuilder();
        int length = word.length();
        for (int i = 0; i < length; i++) {
            reverseWord.append(word.charAt(length - 1 - i));
        }
        return word.equals(reverseWord.toString());
    }
}
