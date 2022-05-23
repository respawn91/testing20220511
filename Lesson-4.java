// Task 1

public class HelloWorld{

    public static void main(String []args){
        
        System.out.println("20 20 20 20 20 20 20 20 20 20");
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.print("20 ");   
        }
    }
}

// FOR

public class HelloWorld{

    public static void main(String []args){
        
        for(int i = 0; i <= 10; i++)
        {
            System.out.print(i + " ");   
        }
    }
}

public class HelloWorld{

    public static void main(String []args){
        
        for(int i = 10; i >= 0; i = i - 1)
        {
            System.out.print(i + " ");   
        }
    }
}

public class HelloWorld{

    public static void main(String []args){
        
        for(int i = 20; i >= 0; i = i - 3)
        {
            System.out.print(i + " ");   
        }
    }
}

public class HelloWorld{

    public static void main(String []args){
        
        for(int i = 1; i <= 1000; i = i * 2)
        {
            System.out.print(i + " ");   
        }
    }
}

public class HelloWorld{

    public static void main(String []args){
       
       for(int i = 1; i <= 10; i++)
       {
            System.out.println(i);
            System.out.println("PLACEHOLDER");
            System.out.println("===========");
       }
    }
}

// Task 2

public class HelloWorld{

    public static void main(String []args){
       
       for(int i = 10; i <= 25; i++)
       {
            System.out.printf("%d %d.4\n", i, i);    
       }
    }
}

// Task 3

public class HelloWorld{

    public static void main(String []args){
       
       for(int i = 1; i <= 9; i++)
       {
           System.out.printf("%d x 7 = %d\n", i, i * 7);
       }
    }
}

// Task 4.1

public class HelloWorld{

    public static void main(String []args){
       
       int sum = 0;
       
       for(int i = 100; i <= 500; i++)
       {
           System.out.println("==============");
           System.out.println("i = " + i);
           System.out.println("Sum before = " + sum);
           sum = sum + i;
           System.out.println("Sum after = " + sum);
           System.out.println("==============");
       }
       
       System.out.println("Answer is " + sum);
    }
}

// Task 5

import java.util.Scanner;

public class HelloWorld{

    public static void main(String []args){
       
       int n = 9;
       double sum = 0;
       
       Scanner sc = new Scanner(System.in);
       
       for(int i = 0; i < 9; i++)
       {
           double temp = sc.nextDouble();
           sum = sum + temp;
       }
      
       System.out.println("Answer is " + sum/n);
    }
}

// WHILE / DO WHILE

public class HelloWorld{

    public static void main(String []args){
       
       int i = 0;
       
       while(i < 10)
       {
           System.out.print(i + " ");
           i++;
       }

    }
}

public class HelloWorld{

    public static void main(String []args){
       
        int i = 0;
        
        do
        {
            System.out.print(i + " ");
			i++;    
        }
               
        while(i < 10);
    }
}

// Task 7

import java.util.Scanner;

public class HelloWorld{

    public static void main(String []args){
       
        Scanner sc = new Scanner(System.in);
       
        int sum = 0;
        int counter = 0;
        
        int value = sc.nextInt();
       
        while(value != 0)
        {
            sum = sum + value;
            counter++;
            System.out.print(value + " ");
            value = sc.nextInt();
        }
        
        System.out.println();
        
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + counter);    
        
        double avg = sum / counter;
        
        System.out.println("Average = " + avg);
    }
}

// Task 8.1

public class HelloWorld{

    public static void main(String []args){
       
        int number = 12523533;
        
        int lastDigit = number % 10;
        
        int count = 0;
        
        while(number > 0)
        {
            if(lastDigit == 3)
            {
                count++;
            }
            
            number = number / 10;
            lastDigit = number % 10;
        }
        
        System.out.println("Count = " + count);
        
    }
}

// Напечатать все четные числа от 1 до 100

public class HelloWorld{

    public static void main(String []args){
       
        for(int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
        
        for(int j = 1; j <= 100; j++)
        {
            if(j % 2 != 0)
            {
                continue;
            }
            System.out.print(j + " ");
        }
        
        System.out.println();

        
    }
}

// Task 11

public class HelloWorld{

    public static void main(String []args){
       
        for(int i = 5000; i > 1; i--)
        {
            if(i % 39 == 0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}