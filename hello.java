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

