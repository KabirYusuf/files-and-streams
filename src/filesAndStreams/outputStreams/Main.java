package filesAndStreams.outputStreams;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.write(67);
        System.out.flush();

        for (int i = 0; i < 127; i++) {
            System.out.write(i);
            System.out.flush();
        }

        String word = "My name";
        byte [] wordByte = word.getBytes();
        System.out.println(Arrays.toString(wordByte));
        try {
            System.out.write(wordByte);
        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            System.out.close();
        }

        try {
            int[] data = new int[5];
            for (int i = 0; i < data.length ; i++) {
                data[i] = System.in.read();
            }
            for (int datum : data) {
                System.out.write(datum);

            }System.out.flush();


        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.close();

        try {
            InputStream input = new FileInputStream("src/filesAndStreams/outputStreams/textFile");
            while (true){
                int data = input.read();
                if(data == -1){
                    System.out.println("End of stream");
                    break;
                }
                else {
                    System.out.write(data);
                }
                System.out.flush();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.close();

        try {
            InputStream inputStream = new FileInputStream("src/filesAndStreams/outputStreams/textFile");
            while (true){
                int data = inputStream.read();
                if(data == -1){
                    System.out.println("End of Stream");
                    break;
                }
                else {
                    OutputStream outputStream = new FileOutputStream("src/filesAndStreams/outputStreams/outputFile", true);
                    outputStream.write(data);
                    System.out.flush();
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            InputStream inputStream = new FileInputStream("src/filesAndStreams/outputStreams/textFile");
                byte[] data = new byte[inputStream.available()];
                inputStream.read(data);
            OutputStream outputStream =  new FileOutputStream("src/filesAndStreams/outputStreams/outputFile");

            for (byte datum : data) {
                outputStream.write(datum);
                System.out.flush();
            }

        } catch (IOException e) {
            System.out.println(e);
        }




    }
}
