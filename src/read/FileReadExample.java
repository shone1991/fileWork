package read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Frank Shin on 2/10/2022
 * @project FileReadWriteExample
 */
public class FileReadExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileReaderUtil fileReaderUtil=new FileReaderUtil();
        fileReaderUtil.readFile("F:\\aa.txt");
    }
}
