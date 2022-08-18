// Functions & Methods
import java.util.*;

public class Main {
    
    public static void print(int value) {
      
      System.out.println(value);
    }
    
    public static void printMax(int a, int b) {
      
      if(a > b)
        System.out.println("Большее число " + a);
      else
        if(a < b)
          System.out.println("Большее число " + b);
        else
          System.out.println("Числа одинаковые");
    }
    
    public static int max(int numberOne, int numberTwo) {
      
      if(numberOne > numberTwo)
        return numberOne;
      else
        return numberTwo;
    }
    
    public static void main(String[] args) {
      
      int x = 100;
      int y = 20;
      
      int maximum = max(x,y);
      print(maximum);
      
      int v1 = 9;
      int v2 = 11;
      print(max(9,11));
      
      int a = 10;
      int b = 20;
      int c = 20;
      
      printMax(a,b);
      printMax(c,a);
      printMax(b,c);
  }
}

// Task #1
import java.util.*;

public class Main {
    
    public static void printNumber(int number, int columns, int rows) {
      
      for(int i = 0; i < rows; i++) {
        for(int j = 0; j < columns; j++) {
          System.out.print(number + " ");
        }
        System.out.println();
      }
    }
    
    public static void printText(String line, int columns, int rows) {
      
      for(int i = 0; i < rows; i++) {
        for(int j = 0; j < columns; j++) {
          System.out.print(line + " ");
        }
        System.out.println();
      }
    }
    
    public static void main(String[] args) {
      
      printNumber(5, 6, 4);
      printText("Hi", 3, 3);
  }
}


// Task #3
import java.util.*;

public class Main {
    
    public static void printElement(int a, int b) {
      
      System.out.printf("%d + %d = %d\t", a, b, a + b);
    }
    
    public static void printLine(int n) {
      
      for(int i = 1; i <= 9; i++) {
        printElement(n, i);
      }
      System.out.println();
    }
    
    public static void printTable() {
      
      for(int i = 1; i <=9; i++) {
        printLine(i);
      }
    }
    
    public static void main(String[] args) {
      
      printTable();
  }
}


// Task #5
import java.util.*;

public class Main {
    
    public static long factorialClassic(int n) {
      
      long result = 1;
      
      for(int i = 1; i <= n; i++) {
        result = result * i;
      }
      
      return result;
    }
    
    public static long factorialRecursion(int n) {
      
      if(n == 1)
        return 1;
      else
        return n * factorialRecursion(n - 1);
    }
    
    public static void main(String[] args) {
      System.out.println(factorialClassic(1));
      System.out.println(factorialClassic(3));
      System.out.println(factorialClassic(5));
      System.out.println(factorialClassic(13));
      
      System.out.println(factorialRecursion(1));
      System.out.println(factorialRecursion(3));
      System.out.println(factorialRecursion(5));
      System.out.println(factorialRecursion(13));
  }
}

// Task #6
import java.util.*;

public class Main {
    
    public static int max(int a, int b) {
    // int max(int, int)  
      if(a > b)
        return a;
      else
        return b;
    }
    
    public static double max(double a, double b) {
    // double max(double, double)
      if(a > b)
        return a;
      else
        return b;
    }
    
    public static int max(int a, int b, int c) {
    // int max(int, int, int)
      return max(max(a, b), c);
    }
    
    public static int max(int a, int b, int c, int d) {
      // int max(int, int, int, int)
      return max(max(a, b), max(c, d));
    }
    
    public static void main(String[] args) {
      
      System.out.println(max(5,7));          // 7
      System.out.println(max(-1,-3));        // -1
      
      System.out.println(max(1, 2, 3));    // 3
      System.out.println(max(1, 4, 3));    // 4
      System.out.println(max(5, 2, 3));    // 5
      
      System.out.println(max(1, 2, 3, 4));  // 4
      System.out.println(max(7, 10, 13, 5));  // 13
      System.out.println(max(11, 21, 13, 14));  // 21
      System.out.println(max(31, 22, 13, 24));  // 31
      
      System.out.println(max(1.5, 2.5));        // 2.5
      
      
  }
}

// Task #7
import java.util.*;

public class Main {
    
    public static boolean isTriangle(double a, double b, double c) {
      
      if((a > 0) && (b > 0) && (c > 0) && (a + b > c) && (a + c > b) && (b + c > a))
        return true;
      else
        return false;
    }
    
    public static double perimetr(double a, double b, double c) {
      
      if(isTriangle(a, b, c) == true)
        return a + b + c;
      else
        return 0;
    }
    
    public static double square(double a, double b, double c) {
      
      if(isTriangle(a, b, c) == true) {
        double p = perimetr(a, b, c) / 2;
      
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
      
        return s;  
      }
      else
        return 0;
      
    }
    
    public static void printInfo(double a, double b, double c) {
      
      if(isTriangle(a, b, c) == true) {
        System.out.printf("Треугольник со сторонами %.2f, %.2f, %.2f существует\n", a, b, c);
        System.out.printf("Площадь равна %.2f, периметр равен %.2f\n", square(a,b,c), perimetr(a,b,c));
      }
      else
        System.out.printf("Треугольник со сторонами %.2f, %.2f, %.2f не существует\n", a, b, c);
    }
  
    public static void main(String[] args) {
      
      printInfo(3,4,5);
      printInfo(-3,-4,-5);
      printInfo(3,4,7);
      printInfo(1,1,1);
      
  }
}