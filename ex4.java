import java.util.Scanner;
class ex4{
    public static void main(String args[]){
          Scanner input=new Scanner(System.in);
          int num;
          
          System.out.println("\t Menu");
          System.out.print(" 1.Sunday \n 2. Monday \n 3.Tuesday \n 4.Wednesday \n 5.Thursday  \n 6.Friday \n 7.Saturday");
          System.out.println("\n Enter a number:");
          num=input.nextInt();
          switch (num)
          {
            case 1:
                {
                    System.out.println("Sunday");
                    break;
                }
            case 2 :
                {
                    System.out.println("Monday");
                    break;
                } 
            case 3 :
                {
                    System.out.println("tuesday");
                    break;
                }
            case 4 :
                {
                    System.out.println("Wednesday");
                    break; 
                }
            case 5 :
                {
                    System.out.println("Thusday");
                    break;} 
            case 6 :
                {
                    
                    System.out.println("Friday");
                    break;
                }
            case 7 :
                {
                    System.out.println("Saturday");
                    break;
                }                          
            default:
            {
                System.out.println("invalid number");
            }          
          }
          


           
           
    }
}      
          
          
