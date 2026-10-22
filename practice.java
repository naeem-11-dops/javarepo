
// practice questions 1 : check positive or negative

/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the valu of x :");
        float x = sc.nextFloat();
        if(x>0){
            System.out.println("x is greater then 0 : ");
        }
        else{
            System.out.println("x is less then 0 : ");
        }

    }
}*/

// practice question 2 : check fever or not

/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of temp : ");
        float temp = sc.nextFloat();
        if(temp>100){
            System.out.println("you have fever");
        }
        else{
            System.out.println("you don't have fever");
        }

    }
}*/

// practice question 3 : print week days using switch case

/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of day :");
        int day = sc.nextInt();
        switch(day){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("tuesday");
            break;
            case 3 : System.out.println("wednesday");
            break;
            case 4 : System.out.println("thusrday");
            break;
            case 5 : System.out.println("friday");
            break;
            case 6 : System.out.println("saturday");
            break;
            case 7 : System.out.println("sunday");
            break;
            default : System.out.println("no such found");
        }
    }
}*/

// practice question 4 : check leapyear or not leapyear

/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of year : ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if(x && (y || z)){
            System.out.println("year is leap year");
        }
        else{
            System.out.println("year is not leap year");
        }

    }
}*/

// how many time hello print

/*import java.util.*;
public class practice{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            System.out.println("hello");
            i+=1;
        }
    }
}*/

// print the sum of odd and even integers

/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        int oddsum= 0;
        int evensum = 0;
        do{
            System.out.println("enter your number");
            int number = sc.nextInt();
            if(number%2==0){
                evensum+= number;
            }
            else{
                oddsum+= number;
            }
            System.out.println("do you want to continue press 1 or 0 for not");
             choice = sc.nextInt();
        }while(choice==1);
        System.out.println("sum of odd number: " +oddsum);
        System.out.println("sum of even number: " +evensum);
    }
}*/

// find the factorial of n number by user

/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long factorial = 1;
        System.out.println("enter your number");
        int number = sc.nextInt();
        if(number<0){
            System.out.println("not exist");

        }
        else{
            for(int i=1; i<=number; i++){
                factorial *= i;
            }System.out.println("factorial of number :" +factorial);
        }
        
    }
}*/

// table of n number by user

/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int table =1;
        System.out.println("enter your number");
        int number = sc.nextInt();
        for(int i=1; i<=10; i++){
             table = number*i;
            System.out.println(number+ " * " +i+  " = " +table);
        }
    }
}*/

// check this code

/*import java.util.*;
public class practice{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            System.out.println("i = " +i);
        }
        System.out.println("i after loop " +i);
    }
}*/

// 9 : function and method

// 1. average of three number

/*import java.util.*;
public class practice{
    public static float average(int a, int b, int c){
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        System.out.println(average(5,5,5));
    }
}*/

// check arguments are even 

/*import java.util.*;
public  class practice{
    public static boolean Even(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println("argument is even :" +Even(4));
    }
}*/

// check the nuber is palindrom

/*import java.util.*;
public class practice{
    public static boolean palindrom(int n){
        int number = n;
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = (rev * 10 ) + lastdigit;
            n = n/10;
        }
        if(number==rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println("the number is palindrom :" +palindrom(123));
    }
}*/

// sum of digits in an integer

/*import java.util.*;
public class practice{
    public static int sumofdigit(int n){
    int sum = 0;
    while(n>0){
        int lastdigit = n%10;
        sum = sum+lastdigit;
        n = n/10;
    }
    return sum;
    }
    public static void main(String args[]){
        System.out.println("sum of digit :" +sumofdigit(645));
    }
}*/