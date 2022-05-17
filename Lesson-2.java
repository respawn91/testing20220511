// Вывод информации на консоль

public class HelloWorld{

     public static void main(String []args){
         
         int a = 10;
         double b = -12.23;
         
         String s = "Some Text! :)";
         
         boolean bool = true;
         
         System.out.println("Hello World");
         System.out.println(a);
         System.out.println(b);
         System.out.println(s);
         System.out.println(bool);
         
     }
}

public class HelloWorld{

     public static void main(String []args){
         
         int a = 10;
         double b = -12.23;
         
         String s = "Some Text! :)";
         
         boolean bool = true;
        
         System.out.print("Hello World\n");
         System.out.print(a);
         System.out.print(b);
         System.out.print(s);
         System.out.print(bool);
         
     }
}

public class HelloWorld{

     public static void main(String []args){
         
        int a = 10;
        double b = -12.0;
         
        String s = "Some Text! :)";
        
        System.out.println(a + b + s);
        
        // 1) a + b -> double
        // 2) + s -> String
        
        System.out.println(a + (b + s));
     }
}

public class HelloWorld{

    public static void main(String []args){
        
        int a = 10;
        int b = 20;
        
        // a = 10; b = 20; a + b = 30;
        System.out.println("a = " + a + "; b = " + b + "; a + b = " + (a + b) + ";");
        
        System.out.printf("a = %d; b = %d, a + b = %d;\n", a, b, a + b);
    }
}

// Task 1

public class HelloWorld{

    public static void main(String []args){
        
        int days = 234;
        
        System.out.printf("We have %d days. It means that there are %d weeks and %d months", days, days / 7, days / 30);
    }
}

// Task 2

public class HelloWorld{

    public static void main(String []args){
        
        int number = 39;
        
        System.out.printf("%d = %d * 10 + %d\n", number, number / 10, number % 10);
    }
}

