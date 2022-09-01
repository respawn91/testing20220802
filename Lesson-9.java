// Arrays
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] array1 = new int[5];
      //  System.out.println(array1[0]);
      
      array1[3] = 5;
      array1[0] = 1;
      
      System.out.println(array1[0]);
      System.out.println(array1[1]);
      System.out.println(array1[2]);
      System.out.println(array1[3]);
      System.out.println(array1[4]);
      
      /*
      String[] array2 = new String[5];
      System.out.println(array2[0]);
      */
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] array1 = {1, 3, 5, 6, 8, 10, 12, 15, 0, 1};
      
      int l = array1.length;
      
      System.out.println(l);
  }
}

import java.util.*;

public class Main {
    
    public static void printArray(int[] array) {
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      
      int[] array1 = {1, 3, 5, 6, 8, 10, 12, 15, 0, 1};
      
      printArray(array1);
  }
}

// Task #1
import java.util.*;
import java.util.Scanner;

public class Main {
    
    public static void printArray(int[] array) {
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static void main(String[] args) {
      
      int[] array = scanArray(10);
      
      printArray(array);
      
  }
}

// Task #2

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(int[] array) {
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      int[] array = new int[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100); // 0 - 100
      }
      
      return array;
    }
    
    public static void main(String[] args) {
      
      int[] array = generateArray(10);
      
      printArray(array);
      
  }
}

// Task #4
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(double[] array) {
      for(int i = 0; i < array.length; i++) {
        System.out.printf("%.2f\t", array[i]);
      }
      System.out.println();
    }
    
    public static double[] scanArray(int n) {
      
      double[] array = new double[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextDouble();
      }
      
      return array;
    }
    
    public static double[] generateArray(int n) {
      
      double[] array = new double[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100); // 0 - 100
      }
      
      return array;
    }
    
    public static double[] multiplyArrayByNumber(double[] array, double number) {
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] * number;
      }
      
      return array;
    }
    
    public static double[] decreaseArrayByNumber(double[] array, double number) {
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] - number;
      }
      
      return array;
    }
    
    public static double[] divideArrayByFirstElement(double[] array) {
      
      double temp = array[0];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] / temp;
      }
      
      return array;
    }
    
    public static void main(String[] args) {
      
      double[] array = generateArray(5);
      printArray(array);
      
      multiplyArrayByNumber(array, 5);
      printArray(array);
      
      decreaseArrayByNumber(array, 15);
      printArray(array);
      
      divideArrayByFirstElement(array);
      printArray(array);
  }
}

// Task #5.1
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(double[] array) {
      for(int i = 0; i < array.length; i++) {
        System.out.printf("%.2f\t", array[i]);
      }
      System.out.println();
    }
    
    public static double[] scanArray(int n) {
      
      double[] array = new double[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextDouble();
      }
      
      return array;
    }
    
    public static double[] generateArray(int n) {
      
      double[] array = new double[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100); // 0 - 100
      }
      
      return array;
    }
    
    public static void printNonNegativeNumbers(double[] array) {
      for(int i = 0; i < array.length; i++) {
        if(array[i] >= 0) {
          System.out.print(array[i] + "\t");
        }
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      
      double[] array = {-2, 0, -3, -6, 5, -3};
      printArray(array);
      
      printNonNegativeNumbers(array);
  }
}

// Task #6
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(double[] array) {
      for(int i = 0; i < array.length; i++) {
        System.out.printf("%.2f\t", array[i]);
      }
      System.out.println();
    }
    
    public static double[] generateArray(int n) {
      
      double[] array = new double[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100); // 0 - 100
      }
      
      return array;
    }
    
    public static double findMaxElement(double[] array) {
      
      double max = array[0];
      
      for(int i = 1; i < array.length; i++) {
        if(array[i] > max) {
          max = array[i];
        }
      }
      
      return max;
    }
    
    public static int findIndexOfMaxElement(double[] array) {
      
      int index = 0;
      
      double max = findMaxElement(array);
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] == max) {
          index = i;
          break;
        }
      }
      
      return index;
    }
    
    public static void main(String[] args) {
      
      double[] array = {5, 7, 8, 7, 8, 3};
      printArray(array);
      
      System.out.println(findMaxElement(array));
      System.out.println(findIndexOfMaxElement(array));
  }
}

// Task #7
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(double[] array) {
      for(int i = 0; i < array.length; i++) {
        System.out.printf("%.2f\t", array[i]);
      }
      System.out.println();
    }
    
    public static double[] generateArray(int n) {
      
      double[] array = new double[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100); // 0 - 100
      }
      
      return array;
    }
    
    public static double[] swapElements(double[] array, int index1, int index2) {
      
      if((index1 >= array.length) || (index2 >= array.length)) {
        return array;
      }
      else {
        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
        return array;
      }
    }
    
    public static void main(String[] args) {
      
      double[] array = generateArray(7);
      printArray(array);
      
      swapElements(array, 1, 4);
      printArray(array);
      
      swapElements(array, 0, 5);
      printArray(array);
      
      swapElements(array, 2, 8);
      printArray(array);
    
  }
}

//
https://codeboard.io/projects/343422