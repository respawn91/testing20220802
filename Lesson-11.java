// Exceptions

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      System.out.println("Hello, World!");
      
      int a = 10;
      int b = 0;
      int c = a / b;
      
      System.out.println(c);
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      try {
        int a = 10;
        int b = 0;
        System.out.println(a/b);
      }
      catch(Exception e) {
        System.out.println("Делить на ноль нельзя!");
      }
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      int b = 0;
      int[] array = new int[10];
      
      try {
        int c = a / b;
        array[5] = 10;
      }
      catch(ArithmeticException ae) {
        System.out.println("Делить на ноль нельзя!");
      }
      catch(ArrayIndexOutOfBoundsException ai) {
        System.out.println("Ой! Вышли за границу массива!");
      }
      catch(Exception e) {
        System.out.println("Что-то пошло не так...");
      }
      
      System.out.println("Я живая!!!");
  }
}

// StackTrace

import java.util.*;

public class Main {
  
    public static void method1() {
      method2();
    } 
    
    public static void method2() {
      method3();
    }
    
    public static void method3() {
      int a = 10;
      int b = 0;
      int c = a / b;
      method4();
    }
    public static void method4() {
      method5();
    }
    public static void method5() {
      System.out.println("Hello, World!");
    }
  
    public static void main(String[] args) {
      method1();
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      int b = 0;
      int[] array = new int[10];
      
      try {
        int c = a / b;
        array[5] = 10;
      }
      catch(ArithmeticException ae) {
        System.out.println("Делить на ноль нельзя!");
        ae.printStackTrace();
      }
      catch(ArrayIndexOutOfBoundsException ai) {
        System.out.println("Ой! Вышли за границу массива!");
      }
      catch(Exception e) {
        System.out.println("Что-то пошло не так...");
      }
      
      System.out.println("Я живая!!!");
  }
}

import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      
      int[] array = new int[10];
      Random r = new Random();
      
      try {
        for(int i = 0; i <= 10; i++) {
        array[i] = r.nextInt(100);
        }  
      }
      catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Границ не видим!!!");
      }
      
      try {
        for(int i = 0; i <= array.length; i++) {
        System.out.print(array[i] + " ");
        }  
      }
      catch(ArrayIndexOutOfBoundsException ex) {
        System.out.println("Опять?!");
      }
  }
}

// Unit tests
https://codeboard.io/projects/344221
https://codeboard.io/projects/344225