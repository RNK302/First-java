import java.util.*;
class Array
  {
    public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    System.out.println("enter row");
    int row=sc.nextInt();
    System.out.println("enter col");
    int col=sc.nextInt();
    int [][] a =new int[row][col];
   for(int i=0;i<row;i++){
   for(int j=0;j<col;j++){
   a[i][j]=(i+1)*(j+1);
}
}
   for(int i=0;i<row;i++){
   for(int j=0;j<col;j++){
   System.out.println(a[i][j]+" ");
}
sc.close();
}



}
}
