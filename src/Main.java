import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
    }

    private static void basamaklarınToplamı(int randomSayi) {
        //int randomSayi = (int)(Math.random()*(1000)); //0 ile 1000 arasında sayı
        System.out.println("random sayi " + randomSayi); //üretilen sayıyı konsola bastırdık
        int birler = randomSayi %10; //birler basamağı

        randomSayi = randomSayi /10;
        int onlar = randomSayi %10;   //onlar basamağı

        int yuzler = randomSayi /10;  //yüzler basamağı

        System.out.println("Toplamları ="+(birler+onlar+yuzler));
    }

    public static int[] twoSum(int[] nums, int target) {
        //input
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
//    Terstende aynı okunan kelimelere palindromik kelime denilmektedir.
//    Konsoldan girilen bir kelime veya cümlenin polindromik olup olmadığını veren java algoritma kodunu yazınız ?

    public static boolean isPolindormikWord(String word) {
        //input
        //System.out.println(isPolindormikWord("madam"));//true
        //System.out.println(isPolindormikWord("oktay"));//false
        String reverseWord = "";
        int length = word.length();
        for (int i = 0; i < length; i++) {
            reverseWord += word.charAt(length - 1 - i);
        }
        return word.equals(reverseWord);
    }
}
