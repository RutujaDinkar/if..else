import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
    int x;
   Scanner Sc=new Scanner(System.in);
    System.out.println("enter a number");
    x=Sc.nextInt();
    if(x==0){
        System.out.println(x+"is zero");
    }else if(x>0){
        System.out.println(x+"is positive");
    }else if(x<0){
        System.out.println(x+"is negative");
    }
        
    }
}
