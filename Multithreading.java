import java.util.*;
class Five extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println(i+"*"+"5"+"="+(i*5));
        }
    }
}

class Prime extends Thread{
      public void run(){
       int num=3;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the limit upto which you need to find the prime number:");
       int n=sc.nextInt();
       int status=0;
       if(n>=1){
           System.out.println(2);
       }
       for(int i=2;i<=n;){
           for(int j=2;j<=9;j++){
               if(num%j==0){
                   status=1;
                   break;
               }
           }
           if(status!=1){
               System.out.println(num);
               i++;
           }
           status=0;
           num++;
       }
   }
}

public class Main
{
public static void main(String[] args) {
Five f=new Five();
Prime p=new Prime();
    f.start();
    p.start();
}
}
