// write a java program to sum of  arrays elements.
import java.util.Scanner;
public class As1sum {
    public static void main(String[] args) {
    int sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.print("enter length of element");
    int size=sc.nextInt();
    int []a= new int [size];

    System.out.print("enter array elements");
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
        sum= sum+a[i];
    }
    System.out.print("addition of given ele "+ sum);
    }
}
