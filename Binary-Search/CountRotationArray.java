public class CountRotationArray {
    public static void main(String[] args) {
        int[] array = {12, 14, 15, 0, 2, 4, 5, 6, 7, 8};
        int pivot = findPivot(array);
        if(pivot == -1){
            System.out.println(0);
        }else{

        int countOfRotation = pivot + 1;
        System.out.println(countOfRotation);
        }
    }


    static int findPivot(int[] array){
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && array[mid + 1] < array[mid]){
                return mid;
            }else if(mid > start && array[mid-1] > array[mid]){
                return mid - 1;
            }else if(array[start] < array[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            }
        return -1;
        }
    }

