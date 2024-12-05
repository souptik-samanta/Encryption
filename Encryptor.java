import java.util.*;

public class Encryptor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be encrypted:");
        String s = sc.nextLine();
        System.out.println("Enter key 1 and key 2:");
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int[] asciiValues = toAscii(s, k1);
        int primeFactor = toPrime(asciiValues, k2);
        int[] encryptedArray = encode(primeFactor, asciiValues);

        System.out.println("Encrypted data (keys and array):");
        System.out.println("Key 1: " + k1);
        System.out.println("Key 2: " + primeFactor);
        System.out.println("Encrypted Array: " + Arrays.toString(encryptedArray));
    }
    public static int[] toAscii(String s, int k1) {
        int len = s.length();
        int[] asciiArray = new int[len];
        for (int i = 0; i < len; i++) {
            asciiArray[i] = s.charAt(i) * k1;
        }
        return asciiArray;
    }
    public static int toPrime(int[] a, int k2) {
        int primeKey = 0;
        for (int value : a) {
            boolean isPrime = true;
            primeKey = value;
            for (int i = 2; i <= primeKey / 2; i++) {
                if (primeKey % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeKey = primeKey * k2;
            }
        }
        return primeKey;
    }
     public static int[] encode(int primeFactor, int[] asciiArray) {
        for (int i = 0; i < asciiArray.length; i++) {
            asciiArray[i] *= primeFactor;
        }
        return asciiArray;
    }
}