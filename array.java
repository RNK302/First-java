import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc = new scanner(System.in);
System.out.println("Enter you row and col of the matrix");
int row=sc.nextInt();
int col=sc.nextInt();
System.out.println("enter the metrix1");
int[][] matrix1=readmatrix(sc,row,col)
System.out.println("enter the matrix2");
int [][] matrix2=read matrix2(sc,row,col);
int[][] result=add matrix(matrix1,matrix2,row,col);
print matrix(result,row,col);

}
}