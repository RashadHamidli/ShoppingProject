import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCP_Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.1.101", 55555);
        OutputStream outputStream= socket.getOutputStream();
        DataOutputStream dataOutputStream= new DataOutputStream(outputStream);

        byte[] bytes=FileUtility.readBytes("C:\\Users\\mr_ra\\OneDrive\\Desktop\\ET\\894842.jpg");
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        socket.close();
    }
}
