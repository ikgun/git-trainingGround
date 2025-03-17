package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

//        createNewFile();
        numbersExceptionHandling();
    }

    public static void createNewFile() {
        File file = new File("recources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("recources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling() {
        File file = new File("recources/numbers.txt");
        try (Scanner scanner = new Scanner(file);) {

            while (scanner.hasNext()) {
                double num = scanner.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
