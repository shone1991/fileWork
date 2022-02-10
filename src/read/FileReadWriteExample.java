package read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

/**
 * @author Frank Shin on 2/10/2022
 * @project FileReadWriteExample
 */
public class FileReadWriteExample {
    public static void main(String[] args) throws IOException, InterruptedException {

        /*faylga yozish*/
        FileWriterUtil fileWriterUtil=new FileWriterUtil();
        for(int i=0; i<=10; i++){
            fileWriterUtil.writeToFileText("F:\\write.txt", UUID.randomUUID().toString());
        }
        /*faylni o'qish*/
        FileReaderUtil fileReaderUtil=new FileReaderUtil();
        fileReaderUtil.readFile("F:\\write.txt");
    }
}
