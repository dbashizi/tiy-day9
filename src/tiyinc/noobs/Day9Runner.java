package tiyinc.noobs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dbashizi on 8/18/16.
 */
public class Day9Runner {

    public static void main(String[] args) {
        System.out.println("Running ...");
        Day9Runner myRunner = new Day9Runner();
        myRunner.testWriteFile();
        myRunner.testReadFile();
    }

    public void testReadFile() {
        try {
            File testFile = new File("src/tiyinc/noobs/Day9Runner.java");
            Scanner fileScanner = new Scanner(testFile);
            int numLines = 0;
            int numChars = 0;
            int numInts = 0;
            while (fileScanner.hasNext()) {
                String currentLine = fileScanner.nextLine();
                numLines++;
                numChars += currentLine.length();
                int intIndex = currentLine.indexOf("int");
                if (intIndex != -1) {
                    numInts++;
                }
                System.out.println(currentLine);
            }
            System.out.println("Boom! You have " + numLines + " lines in your file!");
            System.out.println("Boom! You have " + numChars + " characters in your file!");
            System.out.println("Boom! You have " + numInts + " references to \"int\" in your file!");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void testWriteFile() {
        System.out.println("testWriteFile()");
        FileWriter testWriter = null;

        try {
            File testFile = new File("noobs.txt");
            testWriter = new FileWriter(testFile);
            testWriter.write("Java Rocks! Harder!!!!");
//            testWriter.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (testWriter != null) {
                try {
                    testWriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
