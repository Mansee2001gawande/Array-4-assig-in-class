/*|3 7 8|                     
|12 5 9|                  19. Print 13 15 4.
|13 15 4|     
*/public class As19printlastrow {
    public static void main(String[] args) {
        /*int a[][]={{3,7,8},{12,5,9},{13,15,4}};
        //{{00,01,02},{10,12,13},{20,21,22}}
         int max=0,sum1=0,sum2=0,sum3=0,row=0;
            

                 sum1=sum1+a[0][0]+a[0][1]+a[0][2];
                 sum2=sum2+a[1][0]+a[1][1]+a[1][2];;
                 sum3=sum3+a[2][0]+a[2][1]+a[2][2];
                  if (sum1>sum2 &&sum1>sum3){
                    max=sum1;
                   }else if(sum2>sum3) {
                    max=sum2;
                  }else {
                    max=sum3;
                  }
                  row=2;
                System.out.print(" "+a[2][0]+" "+a[2][1]+" "+a[2][2]);
                  }

            }   */

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
     
    
    

