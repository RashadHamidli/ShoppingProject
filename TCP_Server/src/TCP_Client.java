import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCP_Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 55555);
        OutputStream outputStream= socket.getOutputStream();
        DataOutputStream dataOutputStream= new DataOutputStream(outputStream);
        dataOutputStream.write("test".getBytes(StandardCharsets.UTF_8));
        socket.close();
    }
}
