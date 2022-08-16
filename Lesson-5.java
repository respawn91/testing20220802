// FOR
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 0; i < 10; i++) {
        System.out.println("Test message");
      }
      
  }
}

// FOR
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = -5; i <= 0; i++) {
        System.out.println("Test message");
      }
      
  }
}

// FOR
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 0; i < 10; i = i + 3) {
        System.out.print(i + " ");
      }
  }
}

// FOR
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 1; i < 10; i = i * 2) {
        System.out.print(i + " ");
      }
  }
}

// Task #1
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 0; i < 10; i++) {
        System.out.print("20 ");
      }
  }
}


// Task #2

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 10; i <= 25; i++) {
        System.out.printf("%d %d.4\n", i, i);
      }
  }
}

// Task #3

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 1; i <= 9; i++) {
        System.out.printf("%d x 7 = %d\n", i, i*7);
      }
  }
}

// Task #4.1
/*
Найти сумму всех целых чисел от 100 до 500
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int sum = 0;
      
      for(int i = 100; i <= 500; i++) {
        System.out.println("====================");
        System.out.println("i = " + i);
        System.out.println("Сумма до внесения изменений " + sum);
        sum = sum + i;
        System.out.println("Сумма после внесения изменений " + sum);
      }
      
      System.out.println("Сумма диапозона равна " + sum);
  }
}

// Task #5
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = 10;
    
    double sum = 0;
    
    for(int i = 0; i < n; i++) {
      System.out.println("=============");
      System.out.println("i = " + i);
      double temp = sc.nextDouble();
      System.out.println(temp);
      sum = sum + temp;
    }
    
    double avg = sum / n;
    
    System.out.printf("AVG = %.2f", avg);
  }
}

// DO (WHILE)
import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    int i = 0;
    
    do {
      System.out.print(i + " ");
      i++;
    }
    while(i < 10);
  }
}

// WHILE
import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    int i = 0;
    
    while(i < 10) {
      System.out.print(i + " ");
      i++;
    }
  }
}

// Task #7

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      int sum = 0;
      int count = 0;
      
      Scanner sc = new Scanner(System.in);
      
      int temp = sc.nextInt();
      
      while(temp != 0) {
        // System.out.println("=============");
        // System.out.println("Scanning " + temp);
        sum = sum + temp;
        count++;
        temp = sc.nextInt();
      }
      
      System.out.printf("Сумма ряда %d. Количество чисел %d", sum, count);
    
  }
}

// Найти сумму всего ряда чисел

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      int sum = 0;
      int count = 0;
      
      Scanner sc = new Scanner(System.in);
      
      while(sc.hasNext() == true) {
        int temp = sc.nextInt();
        sum = sum + temp;
        count++;
      }
      
      System.out.printf("Сумма ряда %d. Количество чисел %d", sum, count);
  }
}

// Task #8 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
    int number = -151232;
    int countOfThree = 0;
    
    System.out.println("Оригинальное число " + number);
    
    number = Math.abs(number);
    
    while(number != 0) {
      int ending = number % 10;
      
      if(ending == 3) {
        countOfThree++;
      }
      
      number = number / 10;
    }
    
    System.out.println("Цифра 3 встречается в нем " + countOfThree + " раз");
  }
}

// Task #11

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 5000; i > 0; i--) {
        if(i % 39 == 0) {
          System.out.println(i);
          break;
        }
      }    
  }
}

