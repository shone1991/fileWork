package read;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * @author Frank Shin on 2/10/2022
 * @project FileReadWriteExample
 */
public class FileWriterUtil {

    public void writeToFileText(String fileLocation, String text){
        Path path=Path.of(fileLocation);
        try {
            Files.write(path, ("\n"+text).getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            System.out.println("Fayl topilmadi");
            e.printStackTrace();
            //exception handling left as an exercise for the reader
        }
    }
}
