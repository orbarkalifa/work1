// Or Bar Califa 318279429
// Daniel Fradkin 316410885


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //open files and inputs
        File report = new File("report.txt");// new file for output
        File dep = new File("CS.txt"); // file sorted by id format firstname lastname id
        File course = new File("hedva.txt"); // file sorted by id format id g1 g2
        PrintWriter writer = new PrintWriter(new FileWriter(report));// open write in output
        Scanner depInput = new Scanner(dep);
        Scanner courseInput = new Scanner(course);
        // vars for data if needed(names) and id for comper 
        String fName = depInput.next();
        String lName = depInput.next();
        int depID = depInput.nextInt();
        int courseID= courseInput.nextInt();

        while (depInput.hasNext() && courseInput.hasNext()) {

            if (depID < courseID) { //id in course is higher so we read in dep
                fName = depInput.next();
                lName = depInput.next();
                depID = depInput.nextInt();

            } else if (depID > courseID) {//id in dep is higher we read in course
                courseInput.nextLine();
                if (courseInput.hasNext()) courseID = courseInput.nextInt();

            } else {//match, we advance dep more convinent 
                writer.println(depID + " " + fName + " " + lName + " " + (courseInput.nextInt() + courseInput.nextInt())/2);
                fName = depInput.next();
                lName = depInput.next();
                depID = depInput.nextInt();

            }
        }
        //end code
        writer.close();
        depInput.close();
        courseInput.close();
    }



}
