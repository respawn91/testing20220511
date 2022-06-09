// Queue

https://codeboard.io/projects/334498

// ArrayList

import java.util.*;
import java.util.ArrayList;

public class Main {
    
    public static void printArrayList(ArrayList<String> list)
    {
      for(int i = 0; i < list.size(); i++)
      {
        System.out.print(list.get(i) + " ; ");
      }
      System.out.println();  
    }
  
  
    public static void main(String[] args) {
      
      ArrayList<String> list = new ArrayList();
      
      list.add("Anton");
      list.add("Askar");
      printArrayList(list);
      
      list.add("Vlad");
      list.add("Nadya");
      printArrayList(list);
      
      list.add(0, "Kate");
      printArrayList(list);
      
      list.add(2, "Mike");
      printArrayList(list);
      
      list.set(1, "Marina");
      printArrayList(list);
      
      list.remove(2);
      printArrayList(list);
      
      list.remove(3);
      printArrayList(list);
      
      System.out.println(list.contains("Kate"));
      System.out.println(list.indexOf("Kate"));
      System.out.println(list.contains("Anton"));
      
      System.out.println(list.size());
  }
}

//

https://codeboard.io/projects/334506