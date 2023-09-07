
/*|3 7 8|          18. Reverse upper matrix in these form and find    sum of each            row element in array
  |12 5 9|                  
  |13 15 4|     
*/public class As18reverse2d {
    public static void main(String[] args) {
        int a[][]= {{8,7,3},{9,5,12},{4,15,13}};
    //int a[i][j]={{00 01 02},{10,11,12},{20,21,22}}
    int sum=0;
    for(int i=0;i<a.length;i++){
    for(int j=a[i].length-1;j>=0;j--){
        sum=sum+a[i][j];
        System.out.print(a[i][j]+" ");
            }
        System.out.print("="+sum);

        System.out.println();

        }


        }
    }
