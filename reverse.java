import java.util.Scanner;
class reverse{
    public static void main(String args[]){
          Scanner input=new Scanner(System.in);
          int num,i,r=0,var;
          System.out.print("enter a number:");
          num=input.nextInt();
          for (i=0;num!=0;num=num/10){
            var=num%10;
            r=r*10+var;
            

          }
          System.out.print("number"+r);
          System.out.print("Reversed number"+r);



    }
}