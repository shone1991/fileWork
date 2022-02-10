package read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Frank Shin on 2/10/2022
 * @project FileReadWriteExample
 */
public class FileReaderUtil {
    /**
     *
     * @param fileLocation
     * @throws InterruptedException
     * @throws IOException
     */
    public void readFile(String fileLocation) throws InterruptedException, IOException {
        FileReader fileReader=null;
        try {
            fileReader=new FileReader(fileLocation);
        } catch (FileNotFoundException e) {
            System.out.println("Berilgan fayl topilmadi");
            e.printStackTrace();
        }
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String line;
        while((line=bufferedReader.readLine())!=null){
            Thread.sleep(1000);
            System.out.println(line);
        }
    }
}
