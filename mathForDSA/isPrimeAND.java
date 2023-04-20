package mathsForDSA;

public class isPrimeAND {
    public static void main(String[] args){
        int num = 12;
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {
        return (num & 1) == 1;
    }
}
