// creating an arrays

// syntex : datatype arrayname[] = new datatype[size];

// int marks[] = new int[50] user input array

// int number[] = {1,2,3,4,5,};

// string fruits[] = {"apple" "mango" "orange" };

/*import java.util.*;
public class arrays{
    public static void main(String args[]){
         int marks[] = new int [10];
         Scanner sc=new Scanner(System.in);
         marks[0] = sc.nextInt();  //phy
         marks[1] = sc.nextInt();  // che
         System.out.println("phy = " +marks[0]);
         System.out.println("che = " +marks[1]);
         marks[0] = marks[0]+1;
         System.out.println("phy = " +marks[0]);

         System.out.println(marks.length);
    }
}*/

// arrays call by refrence 

/*import java.util.*;
public class arrays{
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[] = {3,4,5}; 
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] +" ");
        }
        System.out.println(marks.length);
    }
}*/

// Linear search

import java.util.*;
public class arrays{
    public static int linear_search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = linear_search(numbers,key);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println( "key is at index :" +index);
        }
    }
}