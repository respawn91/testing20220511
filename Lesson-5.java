// Проверка на четность

// Найти наибольшее из двух значений
public class HelloWorld{
    
    public static int Max(int number1, int number2) 
    {
        int max;
        
        if(number1 > number2)
            max = number1;
        else
            max = number2;
            
        return max;
    }
    
    public static void print(int a)
    {
        System.out.println(a);    
    }
    
    public static void main(String []args){
        
        int a = 110;
        int b = 20;
        
        print(Max(a, b));
        
        int x = 30;
        int y = 50;
        
        print(Max(x, y));
        print(Max(a, x));
        print(Max(90, a));
        
        print(100);
    }
}

// Task 1

public class HelloWorld{

    public static void print(int number, int column, int rows)
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        
        print(8, 5, 15);
    }
}

// Task 3

public class HelloWorld{
    
    public static void printElement(int a, int b)
    {
        System.out.printf("%d + %d = %d\t", a, b, a + b);
    }
    
    public static void printLine(int n)
    {
        for(int i = 1; i <= 9; i++)
        {
            printElement(n, i);
        }
        System.out.println();
    }
    
    public static void printTable()
    {
        for(int i = 1; i <= 9; i++)
        {
            printLine(i);
        }
    }
        
    public static void main(String []args){
        
        printTable();
    }
}

// Task 4

public class HelloWorld{
    
    public static void fibClassic(int n)
    {
        if(n <= 0)
        {
            System.out.println("Incorrect data!");
        }
        else
            if(n == 1)
            {
                System.out.print("1");
            }
            else
                if(n == 2)
                {
                    System.out.print("1 1");
                }
                else
                {
                    int f1 = 1;
                    int f2 = 1;
                
                    System.out.print("1 1 ");
                
                    for(int i = 3; i <= n; i++)
                    {
                        int fk = f1 + f2;
                        System.out.print(fk + " ");
                        f1 = f2;
                        f2 = fk;
                    }    
                }
    }
    
    public static int fibRecursionElement(int n)
    {
        if((n == 1) || (n == 2))
            return 1;
        else
            return fibRecursionElement(n - 1) + fibRecursionElement(n - 2);
    }
    
    public static void fibRecursion(int n)
    {
        if(n > 0)
        {
            for(int i = 1; i <= n; i++)
            {
                System.out.print(fibRecursionElement(i) + " ");
            }            
        }
        else
            System.out.println("Incorrect data!");
    }
    
    public static void main(String []args){
       
       fibRecursion(15);
    }
}

// Task 5

public class HelloWorld{

    public static long factClassic(int n)
    {
        long result = 1;
        
        if((n == 0) || (n == 1))
            result = 1;
        else
        {
            for(int i = 1; i <= n; i ++)
            {
                result = result * i;
            }
        }
        
        return result;
    }
    
    public static long factRecursion(int n)
    {
        if((n == 0) || (n == 1))
            return 1;
        else
            return n * factRecursion(n - 1);
    }

    public static void main(String []args){
    
        System.out.println(factClassic(6));
        System.out.println(factRecursion(15));
        
    }
}

// Task 6

public class HelloWorld{

    // max(int, int)
    public static int max(int a, int b) 
    {
        if(a > b)
            return a;
        else
            return b;
    }
    
    // max(double, double)
    public static double max(double a, double b) 
    {
        if(a > b)
            return a;
        else
            return b;
    }

    // max(int, int, int)    
    public static int max(int a, int b, int c)
    {
        return max(max(a, b), c);
    }

    // max(int, int, int, int)
    public static int max(int a, int b, int c, int d)
    {
        return max(max(a, b), max(c, d));
    }
    
    public static void main(String []args){
    
        System.out.println(max(6, 10, 15));
        System.out.println(max(-6, -10, -15));
        System.out.println(max(0, 0, 0));
        System.out.println(max(6, -10, 15));
        
        System.out.println(max(6, 10, 15, 12));
        
        System.out.println(max(5.0, 3.2));
        
    }
}
// Task 7

public class HelloWorld{
    
    public static double perimetr(double a, double b, double c)
    {
        if(isTriangle(a, b, c) == true)
            return a + b + c;
        else
            return 0;
    }
    
    public static double square(double a, double b, double c)
    {
        if(isTriangle(a, b, c) == true)
        {
            double p = perimetr(a, b, c) / 2;
            
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        else
            return 0;
    }
    
    public static boolean isTriangle(double a, double b, double c)
    {
        if((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0))
            return true;
        else
            return false;
    }
    
    public static void print(double a, double b, double c)
    {
        if(isTriangle(a, b, c) == true)
        {
            System.out.printf("Triangle with sides %.2f, %.2f, %.2f exists\n", a, b, c);
            System.out.printf("Perimetr = %.2f, Square = %.2f\n", perimetr(a, b, c), square(a, b, c));
        }
        else
        {
            System.out.printf("Triangle with sides %.2f, %.2f, %.2f does not exist\n", a, b, c);            
        }
    }
    
    public static void main(String []args){
        
        double a = 3;
        double b = 4;
        double c = 5;
        
        print(a, b, c);
    }
}