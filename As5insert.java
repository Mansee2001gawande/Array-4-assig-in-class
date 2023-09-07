//5. insert the element at a specify position array in given array.

import java.util.Scanner;
public class As5insert {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
       int length;
       System.out.print("enter the length of an array");
       length=sc.nextInt();
       int a[]=new int[length];
       System.out.print("enter the array elements :-");
       for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
        }
       System.out.print("given array :-");
       for(int i=0;i<a.length;i++){
       System.out.print(" "+a[i]);
       }

        System.out.print("enter the element you want to insert :-");
        int insert=sc.nextInt();
         System.out.print("enter the position where you want to insert :-");
        int pos=sc.nextInt();
    for(int i=a.length-1;i>pos-1;i++){
            a[i+1]=a[i];
        }
            a[pos-1]=insert;
            length=length+1;
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
   
    }
    
}
   // for(int i=pos-1;i>=a.length;i++){
