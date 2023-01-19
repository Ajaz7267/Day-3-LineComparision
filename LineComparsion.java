//STEP 1
//Start with Displaying Welcome to Line Comparison Computation Program on Master Branch
//STEP 2
//As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system,So that I can calculate its length
//A Length as 2 Points (x1, y1) and (x2, y2)
// - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
//STEP 3
//As a fan of geometry, I want to check equality of two lines based on the end points, So that I know when two lines are the equal. - Using Java equals method
//- Using Java equals method to check equality of 2 Lengths is preferable.
//STEP 4
//As a fan of geometry, I want to compare two lines based on the end points, So that I know one line is equal, greater or less than the other line.
//    - Using Java compareTo method to compare 2 Lengths is preferable.
package LineComparsionProblem;
import java.util.Scanner;

public class LineComparsion {


    //STEP 2
//As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system,So that I can calculate its length
//A Length as 2 Points (x1, y1) and (x2, y2)
// - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
    public static void main(String args[]) {

            System.out.println("WELCOME TO LINE COMPARISION");
            System.out.println("Enter the co-ordinates of line:");
            Scanner sc = new Scanner(System.in); //Scanner for user input;
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
            float len = (float) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            System.out.println("length of the line: " + len);


        //STEP 3
//As a fan of geometry, I want to check equality of two lines based on the end points, So that I know when two lines are the equal. - Using Java equals method
//- Using Java equals method to check equality of 2 Lengths is preferable.
//        public static void lengthEquals () {
//            System.out.println("Enter the co-ordinates of first line: ");
//            Scanner sc = new Scanner(System.in);
//            int x1 = sc.nextInt() ,y1 = sc.nextInt(),x2 = sc.nextInt(),y2 = sc.nextInt();
//            System.out.println("Enter the co-ordinates of second line: ");
//            int x12 = sc.nextInt(),y12 = sc.nextInt(),x22 = sc.nextInt(),y22 = sc.nextInt();
//            Double len1 = (double) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
//            Double len2 = (double) Math.sqrt((x12 - x22) * (x12 - x22) + (y12 - y22) * (y12 - y22));
//            System.out.println("len1: " + len1);
//            System.out.println("len2: " + len2);
//            if (len1.equals(len2)) {
//                System.out.println("Both lines are equal");
//            } else {
//                System.out.println("Both lines are Not equal");
//            }
//        }
        //STEP 4
//As a fan of geometry, I want to compare two lines based on the end points, So that I know one line is equal, greater or less than the other line.
// - Using Java compareTo method to compare 2 Lengths is preferable.
//        public static void lengthCompare () {
//            System.out.println("Enter Values to check the lines: ");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter len1 value: ");
//            double len1 = sc.nextInt();
//            System.out.println("Enter len2 value: ");
//            double len2 = sc.nextInt();
//            if (Double.compare(len1, len2) == 0) {
//                System.out.println("len1=len2");
//            } else if (Double.compare(len1, len2) < 0) {
//                System.out.println("len1 is less than len2");
//            } else {
//                System.out.println("len1 is greater than len2");
//            }
//        }





        }
    }


