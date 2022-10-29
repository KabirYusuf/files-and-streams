package filesAndStreams;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Formatter output = new Formatter("clients.txt")) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n?","Enter account number, first name, last name and balance. ", "" +
                    "Enter end-of-file indicator to end input");
        }



    }
}
