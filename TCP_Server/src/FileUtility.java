import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtility {
public static byte[] readBytes (String fileName) throws Exception{
    File file = new File(fileName);
    try(FileInputStream fileInputStream= new FileInputStream(file);){
        byte[] bytesArray = new byte[(int)file.length()];
        fileInputStream.read(bytesArray);
        return bytesArray;
    }
}
public static void writeBytes(String fileName, byte[] data) throws Exception{
    FileOutputStream fileOutputStream=new FileOutputStream(fileName);
    fileOutputStream.write(data);
    fileOutputStream.flush();
    fileOutputStream.close();

    System.out.println("done");
}
}