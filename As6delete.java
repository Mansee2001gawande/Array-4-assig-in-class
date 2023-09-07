//6. delete a element from the given array.
import java.util.Scanner;
public class As6delete {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int length;
       System.out.print("enter the length of an array");
       length=sc.nextInt();
       int a[]=new int[length];
       System.out.print("enter the array elements");
       for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
        }
        System.out.print("enter the element you want to delete");
        int delete=sc.nextInt();
         System.out.print("enter the position you want to delete");
        int pos=sc.nextInt();

        for(int i=pos-1;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        
            for(int i=0;i<a.length-1;i++){

                System.out.print(a[i]+" ");
             }

    }
    
}
