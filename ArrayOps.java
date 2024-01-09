public class ArrayOps {
    public static void main(String[] args) {
        int[] myArray1= {2, 8, 3, 7, 8};
        System.out.println(secondMaxValue(myArray1));
        int[] missingArr= {0, 1, 2, 4, 6, 5};
        System.out.println(findMissingInt(missingArr)); 
        int [] array1 = {2, 2, 3, 7, 8, 3, 2, 9};
        int [] array2 = {8, 2, 7, 7, 3};
        System.out.println(containsTheSameElements(array1, array2));
        int [] sortArray =  {1, 3, 2};
        System.out.println(isSorted(sortArray));
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
        for (int i=0; i < array1.length; i++){
            boolean foundInArray2 = false;
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]) {
                    foundInArray2 = true;
                    break;
            }
        }
        if (!foundInArray2) {
            return false;
        }
    }
     for (int i = 0; i < array2.length; i++) {
       boolean foundInArray1 = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    foundInArray1 = true;
                    break;
               }
            }
          if (!foundInArray1) {
              return false;
         }
    }  
        return true;
    }
    public static boolean isSorted(int [] sortArray) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < sortArray.length; i++) {
            if (sortArray[i] > sortArray[i - 1]) {
            decreasing = false;
        } else if (sortArray[i] < sortArray[i - 1]) {
           increasing = false; 
        }
     }  
        return increasing || decreasing;
    }

}
