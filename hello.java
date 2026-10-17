/*public class hello{
    public static void main(String args[]){
        int a = 3;
        int b = 5;
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}*/

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}*/

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income<=500000){
            tax = 0;
        }
        else if(income>=500000 && income<=100000){
            tax =  (int) (income*0.2);
        }
        else{
            tax =  (int) (income*0.3);
        }
        System.out.println("income tax is: "   +tax );
    }
}*/

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        int A = 3, B = 6, C = 9;
        if(A>=B && A>=C){
            System.out.println("A");
        }
        else if(B>=C){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }
}*/

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //ternary operator

        String type = (number%2==0)? "even" : "odd";
        System.out.println("this number is : " + type);
    }
}*/

//switch statement

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        int number = 4;
        switch(number){
            case 1 : System.out.println("apple");
            break;
            case 2 : System.out.println("moango");
            break;
            case 3 : System.out.println("dates");
            break;
            default : System.out.println("not found");
        }
    }
}*/

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        System.out.println("enter operator : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("no such found");
            break;

        }
    }
}*/

// while loop

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        int n = 1;
        while(n<10){
            System.out.println("hii coder");
            n++;
        }
    }
}*/

// print number 1 to n

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.println("enter the value of number");
        int number = sc.nextInt();
        while(count<=number){
            System.out.println(count);
            count++;
        }
    }
}*/

// print sum 1 to n number

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        int i = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("sum : " +sum);
    }
}*/

// for loop

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        for(int i=1; i<=10; i++){
            System.out.println("hello coder");
        }
    }
}*/

// square pattern

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        for(int line=1; line<=4; line++){
            System.out.println("* * * *");
        }
    }
}*/

// print reverse of a number

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        int n = 1234;
       while(n>0){
        int lastdigit = n%10;
        System.out.print(lastdigit + " ");
        n = n/10;
       }
    
    }
}*/

// print reverse given number

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = (rev*10) + lastdigit;
            n = n/10;
        }
        System.out.println("rev :" +rev);
    }
}*/

// do while loop

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        int count =1;
        do{
            System.out.println("hello devops");
            count++;
        }while(count<=10);
    }
}*/

// break statement 

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("enter your number");
          int n = sc.nextInt();
            
            if(n%10 == 0){
                break;
            }
            System.out.println( "number was :" +n);

        }while(true);
    }
}*/

// continue statement

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter your number");
            int n = sc.nextInt();
            if(n%10== 0){
                continue;
            }System.out.println(n);
        }while(true);
    }
}*/

// number is prime or not

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int number = sc.nextInt();
        if(number==2){
            System.out.println("number is prime");
        }
        else{
            boolean isprime = true;
            for(int i=2; i<=Math.sqrt(number); i++){
                if(number%i==0){
                    isprime = false;
                }
            }
           if(isprime==true){
            System.out.println("number is prime");
           } 
           else{
            System.out.println("number is not prime");
           }
        }
    }
}*/

// 8. patterns 1

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        for(int line=1; line<=20; line++){
            System.out.println();
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
        }
    }
}*/

// inverted star pattern

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        int n=4;
        for(int line=1; line<=n; line++){
            for(int star=1; star<=n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// half number pyramid 

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        int n = 4;
        for(int line=1; line<=n; line++){
            for(int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}*/

// print char pyramid

/*import java.util.*;
public class hello{
    public static void main(String args[]){
        int n=5;
        char ch ='A';
        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}*/

// 9. function and method

/*import java.util.*;
public class hello{
    public static void printhello(){
        System.out.print("hello coder");
    }
}*/

// claculate sum using method 

/*import java.util.*;
public class hello{
    public static int sum(int a , int b){
         int sum = a+b;
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         int sum = sum(a,b);
         System.out.println("sum is: " +sum);
    }
}*/

// product of a ,b using method

/*import java.util.*;
public class hello{
    public static int product(int a, int b){
        int result = b*d;
        return result;
    }
    public static void main(String args[]){
        int a = 3;
        int b = 4;
        int result = product(a,b);
        System.out.println("product is :" +result);
    }
}*/

//factorial using method 

/*import java.util.*;
public class hello{
    public static int  factorial(int n){
        int fact=1; 
        for(int i=1; i<=n; i++){
            fact=fact*i;
            
        }
        return fact;
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println("factorial is :" +factorial);

    }
}*/

//binomial cofficent 

/*import java.util.*;
public class hello{
public static int factorial(int n){
    int fact =1;
    for(int i=1; i<=n; i++){
        fact=fact*i;
    }
    return fact;
}

public static int binomialcoff(int n, int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int factnmr = factorial(n-r);
    int coff = fact_n / (fact_r*factnmr);

    return coff; 
}
public static void main(String args[]){
     int result = (binomialcoff(5,2));
     System.out.println(result);
}
}*/

// overloading means methods same name ke ho sakte but
//parametrs diff hote h

// check the a number is prime

/*import java.util.*;
public class hello{
    public static boolean checkprime(int n){
        boolean isprime = true;
        if(n==2){
            System.out.println(isprime);
        }
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i ==0){
                    isprime = false;
                    break;
                }
            }
        }
        return isprime;
    }
    public static void main(String args[]){
        System.out.println(checkprime(14));
    }
}*/

// binary to decimal 

/*import java.util.*;
public class hello{
    public static void bintodec(int binum){
        int number = binum;
        int decnum =0;
        int pow =0;
        while(binum>0){
            int lastdigit = binum % 10;
            decnum = decnum + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            binum= binum/10;
        }
        System.out.println("decimal of " +number +"=" +decnum);
    }
    public static void main(String args[]){
        bintodec(111);
    }
}*/

//dec to binum

/*import java.util.*;
public class hello{
    public static void dectobin(int decnum){
    int number= decnum;
    int binum= 0;
    int pow=0;
    while(decnum>0){
        int rem = decnum%2;
        binum = binum + (rem * (int) Math.pow(10, pow));
        pow++;
        decnum = decnum/2;
    }
    System.out.println("binary  of " +number +"=" +binum);
    }
    public static void main(String args[]){
        dectobin(786);
    }

}*/

// method scope : when a variable declear in a method, so varaiable are valid or 
//useful in this particular method.

// block scope : when a variable declear in a block{}, so variable are valid or 
//useful in this particular block{}.