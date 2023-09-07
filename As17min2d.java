/*  |8  7  3|              
    |9  5  12|                              
    |13 15 4|              |
               
 17. Find every row smallest element 3  5  4 */
/*class As17min2d{
    public static void main(String[] args) {
       int  a[][]={
        {8,7,3},   
        {9,5,12},
        {13,15,4}
    };
    int min;
    for(int i=0;i<a.length;i++){
          min=a[i][0];
        for(int j=0;j<a[i].length;j++){
            if(a[i][j]<min){
                min=a[i][j];
            }
        }
    
            System.out.println("Output Matrix.....");
            for(int r=0; r<a.length; r++){
           for(int c=0; c<a[r].length; c++){
             System.out.println("minimum :"+min);
           }   
    }
} */
   class As17min2d{
    public static void main(String[] args) {
 
      int  a[][]={
        {8,7,3},   
        {9,5,12},
        {13,15,4}
    };
    int min;
    for(int i=0;i<a.length;i++){
          min=a[0][0];
          for(int j=0;j<a[i].length;j++){
            if(a[i][j]<min){
              min=a[i][j];
            }
          }
          System.out.println("Output Matrix.....");
             System.out.println("minimum :"+min);
            }
          }   
        }
      
    

    