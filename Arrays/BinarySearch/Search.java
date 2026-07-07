package BinarySearch;
import java.util.*;
public class Search {
//public static void main(String[] args) {

        /*char[] arr = {'a', 'b', 'c', 'd', 'e'};
        char target = 'o';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
     System.out.println("Element not found");
    }
}*/

//search in range 


/*int [] arr = {1, 2, 3, 4, 5};
int target = 5;
int start = 2;
int end = 4;
for (int i = start; i <= end; i++) {
    if (arr[i] == target) {
        // System.out.println("Element found at index: " + i);
        return;
    }
}
// System.out.println("Element not found");
    }
}*/



//min no in array
/*int [] arr = {2,4,1,5,3};
int min = arr[0];
for (int i = 0; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
    }
}
System.out.println("Minimum element in the array is: " + min );
}
}  */


// search in 2d array

/*int [][] arr = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
};
int target = 5;
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == target) {
            System.out.println("Element found at index: (" + i + ", " + j + ")");
            return;
        }
    }
}
System.out.println("Element not found");
}
}*/



// leetcode 1295


int [] nums={12,345,2,6,7896};
int count=0;
for(int i=0;i<nums.length;i++){
    if(even(nums[i])){
        count++;
    }
}
System.out.println(count);
}
boolean even(int num){
    int count=0;
    while(num>0){
        count++;
        num=num/10;
    }
    return count%2==0;
}