// Queue 
https://codeboard.io/projects/343946

// ArrayList #1

import java.util.*;
import java.util.ArrayList;

public class Main {
    
    public static void print(ArrayList<String> list) {
      for(int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ");
      }
      System.out.println();
    }
    
    public static void setByName(ArrayList<String> list, String name1, String name2) {
      
      if(list.contains(name1) == true) {
        int index = list.indexOf(name1);
        list.set(index, name2);
      }
    }
    
    public static void main(String[] args) {
      
      ArrayList<String> list = new ArrayList();
      list.add("Kate");
      print(list);
      
      list.add("Anton");
      print(list);
      
      list.add("Sergey");
      print(list);
      
      list.add(1, "Anna");
      print(list);
      
      list.set(2, "Denis");
      print(list);
      
      setByName(list, "Sergey", "Veronika");
      print(list);
      
      setByName(list, "Ivan", "Vasilii");
      print(list);
      
      list.add("Sergey");
      list.add("Viktoria");
      list.add("Ivan");
      print(list);
      
      list.remove(5);
      print(list);
      
      list.add("Anna");
      print(list);
      list.remove("Anna");
      print(list);
      
  }
}

// ArrayList #2
https://codeboard.io/projects/343959