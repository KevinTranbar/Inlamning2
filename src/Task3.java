import java.util.Scanner;

public class Task3 {

    public static double netSalary(double salary) {

        double netSalary = 0;
        double churchFee = 0.0022 * salary;

        if (salary > 200) { //if > 200 = netSalary += calculations
            netSalary += 200 - ((20.00 / 100) * 200); //max tax lvl 1 range -> moves to next calculation
        }
        else { //else if < 200 = netSalary += calculations
            netSalary += salary -((20.00 / 100) * salary); //final netSalary
            return netSalary - churchFee; //need return here because salary is also > 468, therefore gets moved to next else
        }

        if (salary > 468) { //if > 468 = netSalary += calculations
            netSalary += 468 - 200 - ((32.12 / 100) * (468 - 200)); //max tax lvl 2 range -> moves to next calculation
        }
        else { //else if < 468 and > 200 = netSalary += calculations
            netSalary += salary - 200 - ((32.12 / 100) * (salary - 200)); //final netSalary
            return netSalary - churchFee; //same principle as previous return
        }

        if (salary > 675) { //if > 675 = netSalary += calculations
            netSalary += 675 - 468 - ((52.35 / 100) * (675 - 468)); //max tax lvl 3 range -> moves to next calculation
            netSalary += salary - 675 - ((57.48 / 100) * (salary - 675)); //max tax lvl 4 range -> final netSalary
        }
        else { //else if < 675 and > 468 = netSalary += calculations
            netSalary += salary - 468 - ((52.35 / 100) * (salary - 468)); //final netSalary if < 675 but > 468 (tax lvl 3)
        } //return not needed here because there aren't any more calculations after

        return netSalary - churchFee;
    }

    public static void readSalary() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a gross salary: ");
        double grossSalary = scanner.nextDouble(); //input of gross salary

        double churchFee = 0.0022 * grossSalary; //church fee
        double tax = grossSalary - netSalary(grossSalary) - churchFee; //calculated tax

        //results
        System.out.printf("Gross salary: %.2f%n", grossSalary);
        System.out.printf("Church fee: %.2f%n", churchFee);
        System.out.printf("Tax: %.2f%n", tax);
        System.out.printf("Net salary: %.2f%n", netSalary(grossSalary)); //invoked from netSalary() method

        scanner.close();
    }

    public static void main(String[] args)
    {

        readSalary();
    }
}