package com.james.io;

import java.io.*;

public class ReadTester {

    public static void main(String[] args) {
//        inputstream();
//        fileReader();

        try {
            FileReader reader = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileReader() {
        try {
            FileReader reader = new FileReader("data.txt");
            int n = reader.read();
            while (n != -1) {
                System.out.print((char) n);
                n = reader.read();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            InputStream inputStream = new FileInputStream(file);
            int n = inputStream.read();
            while (n != -1) {
                System.out.print((char) n);
                n = inputStream.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File Open Success!!!");
    }
}
