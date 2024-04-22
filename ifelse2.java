import java.util.Scanner;
class ifelse2 {
    public static void main(String args[])
    {
        Scanner thiya = new Scanner(System.in);
        int num1 = thiya.nextInt();
        int num2 = thiya.nextInt();
        if(num1==num2)
        {
            System.out.print("#");
        }
        else
        {
            System.out.print("@");
        }    
        
    }
}
