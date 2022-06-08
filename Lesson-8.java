// Arrays

public class HelloWorld{

    public static void main(String []args){
        
        int[] array1 = new int[5];
        
        array1[0] = 5;
        array1[2] = 15;
        
        for(int i = 0; i < 5; i++)
        {
            System.out.print(array1[i] + " ");
        }
        
        System.out.println();
        
        String[] array2 = new String[5];
        
        array2[1] = "Anton";
        array2[4] = "Georgii";
        
        for(int j = 0; j < 5; j++)
        {
            System.out.print(array2[j] + " ");
        }
    }
}

public class HelloWorld{
    
    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }

    public static void main(String []args){
        
        int[] array1 = new int[5];
        
        array1[0] = 5;
        array1[2] = 15;
        
        printArray(array1);
    }
}

public class HelloWorld{
    
    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }

    public static void main(String []args){
        
        int[] array1 = {1, 3, 6, 8, 9, 10, 5, 4, 6, -2, 0, 10, -5};
        
        printArray(array1);
    }
}

// Task 1
import java.util.Scanner;

public class HelloWorld{
    
    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    
    public static int[] scanArray(int n)
    {
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
        
      for(int i = 0; i < array.length; i++)
      {
        array[i] = sc.nextInt();
      }
      
      return array;
    }

    public static void main(String []args){
        
        int[] array1 = scanArray(30);
        
        printArray(array1);
    }
}

// Task 2
import java.util.Scanner;
import java.util.Random;

public class HelloWorld{
    
    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    
    public static int[] scanArray(int n)
    {
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
        
      for(int i = 0; i < array.length; i++)
      {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n)
    {
      int[] array = new int[n];
      
      Random r = new Random();
        
      for(int i = 0; i < array.length; i++)
      {
        array[i] = r.nextInt(50);
      }
      
      return array;
    }

    public static void main(String []args){
        
        int[] array1 = generateArray(20);
        
        printArray(array1);
    }
}

// Task 4
import java.util.Scanner;
import java.util.Random;

public class HelloWorld{
    
    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    
    public static int[] scanArray(int n)
    {
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
        
      for(int i = 0; i < array.length; i++)
      {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n)
    {
      int[] array = new int[n];
      
      Random r = new Random();
        
      for(int i = 0; i < array.length; i++)
      {
        array[i] = r.nextInt(50);
      }
      
      return array;
    }
    
    public static int[] multiplyArray(int[] array, int n)
    {
      for(int i = 0; i < array.length; i++)
      {
        array[i] = array[i] * n;
      }
      
      return array;
    }
    
    public static int[] decreaseArray(int[] array, int n)
    {
      for(int i = 0; i < array.length; i++)
      {
        array[i] = array[i] - n;
      }
      
      return array;
    }

    public static void main(String []args){
        
        int[] array1 = generateArray(10);
        
        printArray(array1);
        
        multiplyArray(array1, 3);
        
        printArray(array1);
        
        decreaseArray(array1, 5);
        
        printArray(array1);
    }
}

// Task 6
import java.util.Scanner;
import java.util.Random;

public class HelloWorld{
    
    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    
    public static int[] scanArray(int n)
    {
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
        
      for(int i = 0; i < array.length; i++)
      {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n)
    {
      int[] array = new int[n];
      
      Random r = new Random();
        
      for(int i = 0; i < array.length; i++)
      {
        array[i] = r.nextInt(50);
      }
      
      return array;
    }
    
    public static int[] multiplyArray(int[] array, int n)
    {
      for(int i = 0; i < array.length; i++)
      {
        array[i] = array[i] * n;
      }
      
      return array;
    }
    
    public static int[] decreaseArray(int[] array, int n)
    {
      for(int i = 0; i < array.length; i++)
      {
        array[i] = array[i] - n;
      }
      
      return array;
    }
    
    public static int findMaxElementOfArray(int[] array)
    {
      int max = array[0];
      
      for(int i = 1; i < array.length; i++)
      {
        if(array[i] > max)
        {
          max = array[i];
        }
      }
      
      return max;
    }
    
    public static int findIndexOfMaxElementOfArray(int[] array)
    {
      int index = -1;
      
      int max = findMaxElementOfArray(array);
      
      for(int i = 0; i < array.length; i++)
      {
        if(array[i] == max)
        {
          index = i;
          break;
        }
      }
      
      return index;
    }

    public static void main(String []args){
        
        int[] array1 = generateArray(15);
        
        printArray(array1);
        
        System.out.println(findMaxElementOfArray(array1));
        System.out.println(findIndexOfMaxElementOfArray(array1));
    }
}

// Task 7
import java.util.Scanner;
import java.util.Random;

public class HelloWorld{
    
    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    
    public static int[] scanArray(int n)
    {
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
        
      for(int i = 0; i < array.length; i++)
      {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n)
    {
      int[] array = new int[n];
      
      Random r = new Random();
        
      for(int i = 0; i < array.length; i++)
      {
        array[i] = r.nextInt(50);
      }
      
      return array;
    }
    
    public static int[] multiplyArray(int[] array, int n)
    {
      for(int i = 0; i < array.length; i++)
      {
        array[i] = array[i] * n;
      }
      
      return array;
    }
    
    public static int[] decreaseArray(int[] array, int n)
    {
      for(int i = 0; i < array.length; i++)
      {
        array[i] = array[i] - n;
      }
      
      return array;
    }
    
    public static int findMaxElementOfArray(int[] array)
    {
      int max = array[0];
      
      for(int i = 1; i < array.length; i++)
      {
        if(array[i] > max)
        {
          max = array[i];
        }
      }
      
      return max;
    }
    
    public static int findIndexOfMaxElementOfArray(int[] array)
    {
      int index = -1;
      
      int max = findMaxElementOfArray(array);
      
      for(int i = 0; i < array.length; i++)
      {
        if(array[i] == max)
        {
          index = i;
          break;
        }
      }
      
      return index;
    }
    
    
    public static int[] swapElementsOfArray(int[] array, int idx1, int idx2)
    {
      if((idx1 >= 0) && (idx2 >= 0) && (idx1 < array.length) && (idx2 < array.length))
      {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
        
        return array;
      }
      else
      {
        return array;
      }
      
    }

    public static void main(String []args){
        
        int[] array1 = generateArray(15);
        printArray(array1);
        
        swapElementsOfArray(array1, 1, 4);
        printArray(array1);
        
        swapElementsOfArray(array1, 2, findIndexOfMaxElementOfArray(array1));
        printArray(array1);
        
        swapElementsOfArray(array1, 20, 4);
        printArray(array1);
    }
}

// 

public class HelloWorld{
    
    public static void main(String []args){
        
        int[][] array = new int[14][9];
        
        for(int i = 0; i < array.length; i++)
        {
          for(int j = 0; j < array[i].length; j++)
          {
            System.out.print(array[i][j] + " ");
          }
          System.out.println();
        }
    }
}

// Task 11

// Task 11
import java.util.Random;

public class HelloWorld{
  
    public static int[][] generateArray(int n, int m)
    {
      int[][] array = new int[n][m];
      
      Random r = new Random();

      for(int i = 0; i < array.length; i++)
        {
          for(int j = 0; j < array[i].length; j++)
          {
            array[i][j] = r.nextInt(50);
          }
        }
      
      return array;
    }
    
    public static void printArray(int[][] array)
    {
      for(int i = 0; i < array.length; i++)
        {
          for(int j = 0; j < array[i].length; j++)
          {
            System.out.print(array[i][j] + "\t");
          }
          System.out.println();
        }
    }
    
    public static int[][] swapLinesOfArray(int[][] array, int idx1, int idx2)
    {
        int[] temp = new int[array[idx1].length];
        
        for(int i = 0; i < array[idx1].length; i++)
        {
          temp[i] = array[idx1][i];
        }
        
        array[idx1] = array[idx2];
        array[idx2] = temp;
        
        return array;
    }
    
    public static void main(String []args){
      
        int[][] array1 = generateArray(5,7);
        printArray(array1);
        
        System.out.println();
        
        swapLinesOfArray(array1, 1, 3);
        printArray(array1);
    }
}

// Beer project
https://codeboard.io/projects/334187