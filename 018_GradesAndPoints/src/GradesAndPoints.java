
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //BEGIN SOLUTION
        System.out.println("Type the points [0-60]: ");
        
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.println("Grade: ");
        
        if(a>0 && a<30)
            System.out.print("failed");
        if(a>=30 && a<35)
            System.out.print("1");
        if(a>=35 && a<40)
            System.out.print("2");
        if(a>=40 && a<45)
            System.out.print("3");
        if(a>=45 && a<50)
            System.out.print("4");
        if(a>=50 && a<60)
            System.out.print("5");
        //END SOLUTION
        //STUB: 
        /*
        Ask for a number X between 0-60
        if 0<= x <30  print "failed"
        if 30<= x <35 print "1"
        if 35<= x <40 print "2"
        if 40<= x <45 print "3"
        if 45<= x <50 print "4"
        if 50<= x <=60 print "5"
        */
        
    }
}
