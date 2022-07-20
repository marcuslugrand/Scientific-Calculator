import java.util.*;
import java.lang.*;

public class SciCalculator {
    public static double result;
    public static double average;

    public static double add(double op1, double op2) {
        result = op1 + op2;
        return result;
    }

    public static double sub(double op1, double op2) {
        result = op1 - op2;
        return result;
    }

    public static double mult(double op1, double op2) {
        result = op1 * op2;
        return result;
    }

    public static double division(double op1, double op2) {
        result = op1 / op2;
        return result;
    }

    public static double exponent(double op1, double op2) {
        result = Math.pow(op1, op2);
        return result;
    }

    public static double logarithm(double op1, double op2) {
        result = Math.log(op2) / Math.log(op1);
        return result;
    }

    public static double average(double sum, double num) {
        average = sum / num;
        return average;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuSel = 0;
        double firstOp = 0;
        double secondOp = 0;
        int numCalc = 0;
        double sumCalc = 0;


        while (menuSel > -1 && menuSel < 8) {
            System.out.println("Current Result: " + result);
            System.out.println(" ");
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println(" ");
            System.out.println("Enter Menu Selection: ");
            menuSel = scan.nextInt();
            System.out.println(" ");


            switch (menuSel) {
                case 0:
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter first operand: ");
                    firstOp = scan.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondOp = scan.nextDouble();
                    System.out.println(" ");
                    add(firstOp, secondOp);
                    break;
                case 2:
                    System.out.println("Enter first operand: ");
                    firstOp = scan.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondOp = scan.nextDouble();
                    System.out.println(" ");
                    sub(firstOp, secondOp);
                    break;
                case 3:
                    System.out.println("Enter first operand: ");
                    firstOp = scan.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondOp = scan.nextDouble();
                    System.out.println(" ");
                    mult(firstOp, secondOp);
                    break;
                case 4:
                    System.out.println("Enter first operand: ");
                    firstOp = scan.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondOp = scan.nextDouble();
                    System.out.println(" ");
                    division(firstOp, secondOp);
                    break;
                case 5:
                    System.out.println("Enter first operand: ");
                    firstOp = scan.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondOp = scan.nextDouble();
                    System.out.println(" ");
                    exponent(firstOp, secondOp);
                    break;
                case 6:
                    System.out.println("Enter first operand: ");
                    firstOp = scan.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondOp = scan.nextDouble();
                    System.out.println(" ");
                    logarithm(firstOp, secondOp);
                    break;
                case 7:
                    if (numCalc != 0) {
                        System.out.println("Sum of calculations: " + sumCalc);
                        System.out.println("Number of calculations: " + numCalc);
                        average(sumCalc, numCalc);
                        System.out.printf("Average of calculations: %.2f", average);
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("Enter Menu Selection: ");
                        menuSel = scan.nextInt();
                        switch (menuSel) {
                            case 0:
                                System.out.println("Thanks for using this calculator. Goodbye!");
                                System.exit(0);
                                break;
                            case 1:
                                System.out.println("Enter first operand: ");
                                firstOp = scan.nextDouble();
                                System.out.println("Enter second operand: ");
                                secondOp = scan.nextDouble();
                                System.out.println(" ");
                                add(firstOp, secondOp);
                                break;
                            case 2:
                                System.out.println("Enter first operand: ");
                                firstOp = scan.nextDouble();
                                System.out.println("Enter second operand: ");
                                secondOp = scan.nextDouble();
                                System.out.println(" ");
                                sub(firstOp, secondOp);
                                break;
                            case 3:
                                System.out.println("Enter first operand: ");
                                firstOp = scan.nextDouble();
                                System.out.println("Enter second operand: ");
                                secondOp = scan.nextDouble();
                                System.out.println(" ");
                                mult(firstOp, secondOp);
                                break;
                            case 4:
                                System.out.println("Enter first operand: ");
                                firstOp = scan.nextDouble();
                                System.out.println("Enter second operand: ");
                                secondOp = scan.nextDouble();
                                System.out.println(" ");
                                division(firstOp, secondOp);
                                break;
                            case 5:
                                System.out.println("Enter first operand: ");
                                firstOp = scan.nextDouble();
                                System.out.println("Enter second operand: ");
                                secondOp = scan.nextDouble();
                                System.out.println(" ");
                                exponent(firstOp, secondOp);
                                break;
                            case 6:
                                System.out.println("Enter first operand: ");
                                firstOp = scan.nextDouble();
                                System.out.println("Enter second operand: ");
                                secondOp = scan.nextDouble();
                                System.out.println(" ");
                                logarithm(firstOp, secondOp);
                                break;
                            case 7:
                                System.out.println("Sum of calculations: " + sumCalc);
                                System.out.println("Number of calculations: " + numCalc);
                                average(sumCalc, numCalc);
                                System.out.printf("Average of calculations: %.2f", average);
                                System.out.println(" ");
                                break;
                        }
                    }
                    else {
                            System.out.println("Error: No calculations yet to average!");
                            System.out.println(" ");
                            System.out.println("Enter Menu Selection: ");
                            menuSel = scan.nextInt();
                            switch (menuSel) {
                                case 0:
                                    System.out.println("Thanks for using this calculator. Goodbye!");
                                    System.exit(0);
                                    break;
                                case 1:
                                    System.out.println("Enter first operand: ");
                                    firstOp = scan.nextDouble();
                                    System.out.println("Enter second operand: ");
                                    secondOp = scan.nextDouble();
                                    System.out.println(" ");
                                    add(firstOp, secondOp);
                                    break;
                                case 2:
                                    System.out.println("Enter first operand: ");
                                    firstOp = scan.nextDouble();
                                    System.out.println("Enter second operand: ");
                                    secondOp = scan.nextDouble();
                                    System.out.println(" ");
                                    sub(firstOp, secondOp);
                                    break;
                                case 3:
                                    System.out.println("Enter first operand: ");
                                    firstOp = scan.nextDouble();
                                    System.out.println("Enter second operand: ");
                                    secondOp = scan.nextDouble();
                                    System.out.println(" ");
                                    mult(firstOp, secondOp);
                                    break;
                                case 4:
                                    System.out.println("Enter first operand: ");
                                    firstOp = scan.nextDouble();
                                    System.out.println("Enter second operand: ");
                                    secondOp = scan.nextDouble();
                                    System.out.println(" ");
                                    division(firstOp, secondOp);
                                    break;
                                case 5:
                                    System.out.println("Enter first operand: ");
                                    firstOp = scan.nextDouble();
                                    System.out.println("Enter second operand: ");
                                    secondOp = scan.nextDouble();
                                    System.out.println(" ");
                                    exponent(firstOp, secondOp);
                                    break;
                                case 6:
                                    System.out.println("Enter first operand: ");
                                    firstOp = scan.nextDouble();
                                    System.out.println("Enter second operand: ");
                                    secondOp = scan.nextDouble();
                                    System.out.println(" ");
                                    logarithm(firstOp, secondOp);
                                    break;
                                case 7:
                                    System.out.println("Sum of calculations: " + sumCalc);
                                    System.out.println("Number of calculations: " + numCalc);
                                    average(sumCalc, numCalc);
                                    System.out.printf("Average of calculations: %.2f", average);
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    break;
                            }
                            break;
                        }

                    }
                    numCalc++;
                    sumCalc += result;
            }
            if (menuSel < 0 || menuSel > 7) {
                System.out.println("Error: Invalid selection!");
                System.out.println(" ");
                System.out.println("Enter Menu Selection: ");
                menuSel = scan.nextInt();
                switch (menuSel) {
                    case 0:
                        System.out.println("Thanks for using this calculator. Goodbye!");
                        System.exit(0);
                        break;
                    case 1:
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        add(firstOp, secondOp);
                        break;
                    case 2:
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        sub(firstOp, secondOp);
                        break;
                    case 3:
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        mult(firstOp, secondOp);
                        break;
                    case 4:
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        division(firstOp, secondOp);
                        break;
                    case 5:
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        exponent(firstOp, secondOp);
                        break;
                    case 6:
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        logarithm(firstOp, secondOp);
                        break;
                    case 7:
                        System.out.println("Sum of calculations: " + sumCalc);
                        System.out.println("Number of calculations: " + numCalc);
                        average(sumCalc, numCalc);
                        System.out.printf("Average of calculations: %.2f", average);
                        System.out.println(" ");
                        break;

                }
            }
        }
    }