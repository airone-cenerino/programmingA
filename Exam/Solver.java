import java.util.Scanner;

/**
 * Solver
 */
public class Solver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();

        if(a<=0){
            System.out.println("a should be positive.");
            return;
        }

        if((b*b-4*a*c) == 0){ // d‚©‚¢
            System.out.println("x1 = " + (-b)/(2*a));
        }else if((b*b-4*a*c) < 0){ // ‹•”‰ð
            System.out.println("The roots are not real numbers.");
        }else{
            System.out.println("x1 = " + (-b+Math.sqrt(b*b-4*a*c))/(2*a) + ", x2 = " + (-b-Math.sqrt(b*b-4*a*c))/(2*a));
        }
    }
}