public class ArrayOps {
    public static void main(String[] args) {
        int[] myArray1= {2, 8, 3, 7, 8};
        System.out.println(secondMaxValue(myArray1));
        int[] missingArr= {0, 1, 2, 3, 4, 6};
        System.out.println(findMissingInt(missingArr)); 
    }
    
    public static int findMissingInt (int []  missingArr) {
    int n = missingArr.length;
    int sumWithMissingInt = n * (n+1) / 2;
    int actualSum = 0;
    for (int i = 0; i < missingArr.length; i++) {
        actualSum += missingArr[i];
        }
    int missingInt = sumWithMissingInt-actualSum;
    return missingInt;
    }

    public static int secondMaxValue(int [] myArray1) {
        int max= myArray1[0];
        int secondMax= myArray1[1];
        for (int i = 1; i < myArray1.length; i++) {
          if (myArray1[i] > max) {
            secondMax = max;
            max = myArray1[i];
    }     else if (myArray1[i] > secondMax) {
            secondMax = myArray1[i];
    }
}
    return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
