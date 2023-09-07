//3. Search an element in an array  (1) linear search (2) binary search.
import java.util.Scanner;        //binary search
public class As3binarysearch {
 public static void main(String[] args) {
    int length,first=0,mid;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the length of an array:-");
     length =sc.nextInt();
    int a[]=new int[length];
    int last=a.length-1;
    boolean flag=false;

System.out.print("enter the element of an array :-");
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }

    System.out.print("enter the no you want to search :-");
    int search=sc.nextInt();
    for(first=0,last=a.length-1;first<=last;){
        mid=(first+last)/2;
        if(search==a[mid]){
            flag=true;
            break;
        }
        else if(search<a[mid])
        last=mid-1;
        else
        first=mid+1;
    }
    if(flag)
    System.out.print("element is found");
    else
    System.out.println("element is not found");
 }   
}
