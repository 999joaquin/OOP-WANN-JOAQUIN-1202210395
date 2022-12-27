import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void printMenu(){
        System.out.println("===MENU===");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Calculation cal = new Calculation();
        boolean repeat = true;
        boolean report = false;

        do{
            try{
                printMenu();
                System.out.print("Select Menu: ");
                int menu = sc.nextInt();
                System.out.println();
                switch(menu){
                    case 1:
                        System.out.print("Enter the side length of the square: ");
                        double side = sc.nextDouble();

                        cal.setSquare(side);
                        cal.run();
                        System.out.println();
                        System.out.println("The Calculation result: " + cal.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle: ");
                        double radius = sc.nextDouble();

                        cal.setCircle(radius);
                        cal.run();
                        System.out.println();
                        System.out.println("The Calculation result: " + cal.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter the base side of the trapezoid: ");
                        double sideBase = sc.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid: ");
                        double sideUpper = sc.nextDouble();
                        System.out.print("Enter the height of the trapezoid: ");
                        double height = sc.nextDouble();

                        cal.setTrapezoid(sideBase, sideUpper, height);
                        cal.run();
                        System.out.println();
                        System.out.println("The Calculation result: " + cal.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("===Program Ended===");
                    default:
                        System.out.println("===Option not available===");
                        System.out.println();
                        continue;
                }
                repeat = false;
            } catch(InputMismatchException err){
                System.out.println("===Error: Input must be a number!===");
                break; //dibreak soalnya kalo ga dibreak ngeloop trus gatau harus diapain lagi
            } catch(IllegalArgumentException err){
                err.printStackTrace();
            }
        }while(repeat);
        sc.close();
    }
}
