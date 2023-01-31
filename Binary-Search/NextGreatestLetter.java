package Questions;

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = start + (end - start)/2;

        while (start <= end){
            if((int)(letters[mid]) > (int)(target)){
                end = mid + 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
