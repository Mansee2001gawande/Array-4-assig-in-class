// write ajava program to sum even and odd no
import java.util.Scanner;
public class As2Evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int ec=0,od=0,length;
       System.out.print("enter length of array:-");
        length=sc.nextInt();
        int a[]=new int [length];

        System.out.print(" enter array element :-");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
        if(a[i]%2==0)
            ec=ec+a[i];
         else 
            od=od+a[i];
        }
            System.out.println("sum of even no"+ec);
            
            System.out.print("sum of odd number"+od);
    }
    
}
