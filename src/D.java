
import java.util.Scanner;

public class D {

    static boolean leap (int n) {
    if (n % 100 == 0) {
        if (n % 400 == 0)
            return true;
        else
            return false;
    } else
    {if (n % 4 == 0)
        return true;
    else
        return false;
    }
}
    static void checkdate(int d,int m,int y)
    {
        boolean k;
        int max=0;
        if (m==1 || m==3 || m==5 || m==7 || m==9 || m==11)
            max=31;
        else
        if (m==4 || m==6 || m==8 || m==10 || m==12)
            max=30;
        else
        if (m==2)
        {
            k=leap(y);
            if (k==true)
                max=29;
            else
                max=28;

        }

        if (d >=1 && d<=max)
            System.out.println("valid date");
        else
            System.out.println("invalid date");
    }

    public static void main (String [] args){


        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter date : ");
            int d = s.nextInt();
            System.out.println("enter month");
            int m=s.nextInt();
            System.out.println("Enter year");
            int y=s.nextInt();
            checkdate(d,m,y);
        }




    }




}
//PRANEERTH SANKALANA//
