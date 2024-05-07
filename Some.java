import java.util.*;
class Some
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value");
int value=sc.nextInt();
Boolean prime=true;
for(i=2;i<=value/2;i++)
{
if(value%i==0)
{
prime=false;
break;
}
}
if(prime)
{
System.out.println("prime number:"+value);
}
else
{
System.out.println("Is not prime no");
}
sc.close();
}
}
    
