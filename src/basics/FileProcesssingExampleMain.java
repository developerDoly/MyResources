package basics;

import java.io.FileNotFoundException;

public class FileProcesssingExampleMain {

    public static void main(String [] args) throws FileNotFoundException {
        FileProcessing fileProcessing = new FileProcessing();

        fileProcessing.readInFile();

        String contentFromFile = fileProcessing.getContent();

        System.out.println(contentFromFile);
    }
}
