public class SearchInRange {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,0};
        int range1 = 1, range2 = 8;
        int target = 0;
        boolean ans = search(list, target, range1, range2);
        System.out.println(ans);
    }

    // function to print if the number is present in a given range or not
    static boolean search(int[] list, int target, int r1, int r2){
        if (list.length == 0)
            return false;
        for (int elements = r1; elements <= r2 ; elements++) {
            if (elements == target)
                return true;
        }
        return false;
    }
}
