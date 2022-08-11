// Math
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double pi = Math.PI;
      double e = Math.E;
      
      double result1 = Math.cos(0);
      double result2 = Math.sin(0);
      
      double result3 = Math.sqrt(8);
      double result4 = Math.pow(3, 4);
      
      System.out.println(pi);         // 3.14
      System.out.println(e);          // 2.71
      System.out.println(result1);    // 1
      System.out.println(result2);    // 0
      System.out.println(result3);    // 2.82
      System.out.println(result4);    // 81
  }
}


// Task #1
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double r = 4;
      
      double C = 2 * Math.PI * r;
      
      System.out.println(C);
  }
}


// Task #3
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 405;
      
      int s = number / 100;
      int d = number / 10 % 10;
      int e = number % 10;
      
      System.out.printf("%d = %d*100 + %d*10 + %d\n", number, s, d, e);
      
      int sum = s + d + e;
      int multiplication = s * d * e;
      
      System.out.println("Sum = " + sum);
      System.out.println("Multiplication = " + multiplication);
  }
}


// Операции сравнения
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 20;
      int b = 10;
      
      boolean result1 = (a == b);   // false
      boolean result2 = (a != b);   // true
      boolean result3 = (a > b);    // true
      boolean result4 = (a <= b);   // false
      
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
  }
}

// Логичечкие операции
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 20;
      int b = 10;
      
      boolean result1 = ((a > 10) && (b > 10));   // false
      boolean result2 = ((a > 10) && (b >= 10));  // true
      
      boolean result3 = ((a > 10) || (b > 10));   // true
      boolean result4 = ((a > 20) || (b > 10));   // false
      
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
  }
}

// Task #5
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 2452247;
      
      boolean isEven = (number % 2 == 0);
      boolean isEndedBySeven = (number % 10 == 7);
      
      System.out.printf("Number %d is even? %b\n", number, isEven);
      System.out.printf("Number %d is ended by 7? %b\n", number, isEndedBySeven);
  }
}

// if/else
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      
      if(a > 0) 
      {
        System.out.println("Данное число больше 0");
      }
  }
}

// if/else
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double a = 0.0;
      
      if(a > 0) {
        System.out.println("Данное число больше 0");
      }
      else {
        System.out.println("Данное число не больше 0");
      }
  }
}

// Task #6
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 16;
      int b = 2;
      
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      
      if(Math.abs(a) > Math.abs(b)) {
        a = a / 2;
      }
      
      System.out.println("a = " + a);
  }
}

// Task #8
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int day = 17;
      
      switch(day) 
      {
        case 1:             // day = 1
          System.out.println("Это - понедельник");
          break;
        case 2:
          System.out.println("Это - вторник");
          break;
        case 3:
          System.out.println("Это - среда");
          break;
        case 4:
          System.out.println("Это - четверг");
          break;
        case 5:
          System.out.println("Это - пятница");
          break;
        case 6:
          System.out.println("Это - суббота");
          break;
        case 7:
          System.out.println("Это - воскресенье");
          break;
        
        default:
          System.out.println("Не существует такого дня!");
          break;
      }
  }
}


// Task #7 (вариант №1)

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int weight = 35;
      
      if(weight <= 0) {
        System.out.println("Вес невалиден!");
      } 
      else
        if(weight < 37) {
          System.out.println("Иди и набирай вес!");
        }
        else
          if(weight < 60) {
            System.out.println("Легкий вес");
          }
          else
            if(weight < 75) {
              System.out.println("Средний вес");
            }
            else
              if(weight < 91) {
                System.out.println("Тяжелый вес");
              }
              else {
                System.out.println("Супертяжелый вес");
              }
  }
}