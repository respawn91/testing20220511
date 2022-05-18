public class HelloWorld{

    public static void main(String []args){
        
        double pi = Math.PI;
        double e = Math.E;
        
        System.out.println(pi);
        System.out.println(e);
        
        double sin = Math.sin(0);
        
        System.out.println(sin);
        
        double sqrt = Math.sqrt(8);
        
        System.out.println(sqrt);
    }
}

public class HelloWorld{

    public static void main(String []args){
        
        double a = 10;
        double b = 20;
        double c = 5;
        double d = 9;
        
        double result = (a * (b + c * Math.sqrt(d)));
    
        System.out.println(result);
    }
}

// Task 1

public class HelloWorld{

    public static void main(String []args){
        
        double r = 4;
        
        double C = 2 * Math.PI * r;
    
        System.out.println(C);
    }
}

// Task 3

public class HelloWorld{

    public static void main(String []args){
        
        int number = 184;
        
        int s = number / 100;
        int d = number % 100 / 10;
        int e = number % 10;
        
        System.out.printf("%d = %d * 100 + %d * 10 + %d", number, s, d, e);
    }
}

public class HelloWorld{

    public static void main(String []args){
        
        boolean b1 = (5 > 3);       //  true
        boolean b2 = (5 == 5);      //  true
        boolean b3 = (5 < 3);       //  false
        boolean b4 = (5 <= 3);      //  false
        boolean b5 = (5 >= 3);      //  true
        boolean b6 = (5 != 3);      //  true
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
    }
}

public class HelloWorld{

    public static void main(String []args){
        
        boolean b1 = ((5 > 3) || (5 < 3));      //  true
        boolean b2 = ((5 > 3) && (5 < 3));      //  false
        boolean b3 = ((5 == 3) || (5 < 3));     //  false
        boolean b4 = ((5 > 3) && (5 != 3));     //  true
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}

// Task 5

public class HelloWorld{

    public static void main(String []args){
        
        int number = 1423;
        
        boolean b1 = (number %2 == 0);      // even?
        boolean b2 = (number % 10 == 7);    // ended by 7
        
        System.out.println("Number " + number + " is even? " + b1);
        System.out.println("Number " + number + " is ended by 7? " + b2);
    }
}

// IF

public class HelloWorld{

    public static void main(String []args){
        
        int a = 10;
        int b = 20;
        
        if(a > 5)
        {
            System.out.println(a); 
        }
        else
        {
            System.out.println(b);    
        }
    }
}

// Task 6

public class HelloWorld{

    public static void main(String []args){
        
        int a = 30;
        int b = 20;
        
        if(Math.abs(a) > Math.abs(b))
        {
            System.out.println("Abs(a) > Abs(b)");
            a = a / 2;
        }
        
        System.out.println(a);
    }
}

// Task 7

public class HelloWorld{

    public static void main(String []args){
        
        int w = 100;
        
        if(w <= 0)
        {
            System.out.println("Incorrect input!");
        }
        else
        {
            if(w < 75)
            {
                if(w < 60)
                {
                    System.out.println("Light");
                }
                else
                {
                    System.out.println("Medium");
                }
            }
            else
            {
                if(w < 91)
                {
                    System.out.println("Heavy");
                }
                else
                {
                    System.out.println("Superheavy");
                }
            }
        }
    }
}

// Task 8

public class HelloWorld{

    public static void main(String []args){
        
        int day = 1;
        
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Incorrect day!");
                break;
        }
    }
}

// MAX

public class HelloWorld{

    public static void main(String []args){
    
        int a = 210;
        int b = 330;
        
        boolean isMax = (a > b);

        if(isMax)
            System.out.println(a);
        else
            System.out.println(b); 
        
        /*
        if(isMax == true)
            System.out.println(a);
        else
            System.out.println(b); 
        */
        
        /*
        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);
        */
    }
}