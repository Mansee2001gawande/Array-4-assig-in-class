public class Demo {
    public static void main(String[] args) {
        int sum=0,max=0,row=0;
       int a[][]={{3,7,8},{12,5,9},{13,15,4}};
       for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            sum=a[i][j]+sum;
         }
        if(max<sum){
            max=sum;
            row=i;
        }
    }
    
                  for(int i=0;i<a.length;i++){
                    // for(int j=0;j<a.length;j++){
                System.out.print(" "+a[row][i]);
                    // }

        }

    }
    
}
