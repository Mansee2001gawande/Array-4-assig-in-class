/*15. |8  7  3|               |3 7 8|
     |9  5  12|              |5 9 12|                  sorting Requried
     |13 15 4|               |4 13 15|
*/import java.util.Scanner;
public class As16sortmatrix2d {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of array");
        int length=sc.nextInt();
        int a[][]=new int[length][length];
    
        for(int r=0;r<a.length;r++){
        System.out.println("enter"+a[r].length+" element of "+(r+1)+"row");
        for(int c=0;c<a[r].length;c++){
            a[r][c]=sc.nextInt();
        }
   }
        for(int r=0;r<a.length;r++){
        for(int c=0;c<a[r].length;c++){
                for(int t=c+1;t<a[r].length;t++){
                if(a[r][c]>a[r][t]){
                a[r][c]=a[r][c]+a[r][t];
                a[r][t]=a[r][c]-a[r][t];
                a[r][c]=a[r][c]-a[r][t];
                }
        }
                 //for(int i=0;i<a.length;i++){
                 System.out.print (a[r][c]);
                }
                System.out.println();
        }   }
}
//}


