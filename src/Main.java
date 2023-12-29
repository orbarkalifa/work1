// Or Bar Califa 318279429
// Daniel Fradkin 316410885


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File report = new File("report.txt");
        File dep = new File("CS.txt");
        File course = new File("hedva.txt");
        PrintWriter writer = new PrintWriter(new FileWriter(report));
        Scanner depInput = new Scanner(dep);
        Scanner courseInput = new Scanner(course);

        String fName = depInput.next();
        String lName = depInput.next();
        int depID = depInput.nextInt();
        int courseID = courseInput.nextInt();

        while (courseInput.hasNext() && depInput.hasNext()) {

            if (depID < courseID) {
                if (depInput.hasNext()) {
                    fName = depInput.next();
                    lName = depInput.next();
                    depID = depInput.nextInt();
                }
            } else if (depID > courseID) {
                courseInput.nextLine();
                if (courseInput.hasNext()) courseID = courseInput.nextInt();

            } else {
                writer.println(depID + " " + fName + " " + lName + " " + (courseInput.nextInt() + courseInput.nextInt()) / 2);
                if (depInput.hasNext()) {
                    fName = depInput.next();
                    lName = depInput.next();
                    depID = depInput.nextInt();
                }
            }
        }
        if (depID == courseID) writer.println(depID + " " + fName + " " + lName + " " + (courseInput.nextInt() + courseInput.nextInt()) / 2);

        writer.close();
        depInput.close();
        courseInput.close();
    }
}