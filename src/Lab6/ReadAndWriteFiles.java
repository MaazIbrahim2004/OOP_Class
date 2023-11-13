package Lab6;

import java.io.*;

public class ReadAndWriteFiles {
    public static void main(String[] args) {

        // Class needs to take something in as BufferedWriter can writer
        // many things, a file is just one of them
        String[] names = {"Maaz", "Saarim", "Johnson", "Radhey"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")); // writes input into txt file
            writer.write("Writing to a file");
            writer.write("\nhi\n");

            // let's write a file using an array we have
            // loop through array, and write each element to file
            for(String name: names) { // for each name in names array. Can also do for(int i = 0; i < names.length; i++) { writer.write(names[i] + "\n"); }
                writer.write(name + "\n");
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // let's read a file using an array we have
            BufferedReader reader = new BufferedReader(new FileReader("output.txt")); // reads input from txt file and prints it out
            System.out.println(reader.readLine()); // returns a string of the line

            String line; // string that holds each line of text for each iteration of the while loop
            // for each loop, it reads a line, and prints it out
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
