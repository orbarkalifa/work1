//import java.io.*;
//import java.util.Scanner;
//public class test {
//    public static void main(String[] args) throws FileNotFoundException {
//        File cs = new File("CS.txt");
//        File hedva = new File("hedva.txt");
//        File report = new File("report.txt");
//        Scanner csIn = new Scanner(cs);
//        Scanner hedvaIn = new Scanner(hedva);
//        PrintWriter writer = new PrintWriter(report);
//
//        String name = csIn.next() + " " + csIn.next();
//        int id1 = csIn.nextInt();
//        int id2 = hedvaIn.nextInt();
//        while (csIn.hasNext() && hedvaIn.hasNext()) {
//
//            if (id1 < id2){
//                csIn.nextLine();
//                name = csIn.next() + " " + csIn.next();
//                id1 = csIn.nextInt();
//
//            } else if (id1 > id2) {
//                hedvaIn.nextLine();
//                id2 = hedvaIn.nextInt();
//
//            } else {
//                String out = (id1 + " " + name + " " + (hedvaIn.nextInt()+ hedvaIn.nextInt())/2);
//                writer.println(out);
//                if (csIn.hasNext() && hedvaIn.hasNext()) {
//                    name = csIn.next() + " " + csIn.next();
//                    id1 = csIn.nextInt();
//                    hedvaIn.nextLine();
//                    id2 = hedvaIn.nextInt();
//                }
//            }
//        }
//
//        if (id1 == id2) writer.println(id1 + " " + name + " " + (csIn.nextInt() + hedvaIn.nextInt()) / 2);
//
//        writer.close();
//        csIn.close();
//        hedvaIn.close();
//
//    }
//
//}
