// Errors

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 20;
      int b = Math.sqrt(a);
      
  }
}

// Exceptions

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 20;
      int b = 0;
      
      int c = a / b;
      
      System.out.println(c);
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 20;
      int b = 0;
      
      try 
      {
        int c = a / b;
        System.out.println(c);
      }
      catch(Exception e) 
      {
        System.out.println("Division by zero!!");
      }
      finally
      {
        System.out.println("I have never asked for this...");
      }
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 20;
      int b = 0;
      
      try 
      {
        int c = a / b;
        System.out.println(c);
      }
      catch(Exception e) 
      {
        System.out.println("Division by zero!!");
        e.printStackTrace();
      }
      
  }
}

import java.util.*;

public class Main {
    
    public static void method1() {
      method2();
    }
    
    public static void method2() {
      method3();
    }
    
    public static void method3() {
      int a = 20 / 0;
      method4();
    }
    
    public static void method4() {
      System.out.println("Test text");
    }
  
    public static void main(String[] args) {
      
      method1();
      
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 20;
      int b = 10;
      
      int[] array = new int[5];
      
      try 
      {
        int c = a / b;
        array[10] = 10;
        System.out.println(c);
      }
      catch(ArithmeticException ae)
      {
        System.out.println("There is the arithmetic exception!");
      }
      catch(ArrayIndexOutOfBoundsException aioobe)
      {
        System.out.println("There is the array index out of bounds exception!");
      }
      catch(Exception e) 
      {
        System.out.println("Non-standart exception");
      }

  }
}

import java.util.*;

public class Main {
  
    public static int division(int a, int b) throws ArithmeticException
    {
      try 
      {
        int c = a / b;
        return c;
      } 
      catch(ArithmeticException ex) 
      {
        throw new ArithmeticException("You cannot divide by zero!");
      }
    }
    
    public static void main(String[] args) {
      
      System.out.println(division(160,0));

  }
}

import java.util.*;
import java.util.ArrayList;

public class Main {
  
    public static int max(ArrayList<Integer> list) throws IndexOutOfBoundsException
    {
      try
      {
        int max = list.get(0);
      
        for(int i = 0; i < list.size(); i++)
        {
          if(list.get(i) > max)
          {
            max = list.get(i);
          }
        }
        
        return max;  
      }
      catch(IndexOutOfBoundsException e)
      {
        throw new IndexOutOfBoundsException("There is empty list!");
      }
    }
    
    public static void main(String[] args) {
      
      ArrayList<Integer> list = new ArrayList<Integer>();
      
      /*
      list.add(5);
      list.add(10);
      list.add(7);
      */
      
      System.out.println(max(list));

  }
}

// Unit tests
https://codeboard.io/projects/337182
https://codeboard.io/projects/337185