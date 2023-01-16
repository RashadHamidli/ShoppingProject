import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {
    public static void main(String[] args) throws Exception {
        readAsByte();
    }

    public static void readAsByte() throws Exception {
        ServerSocket serverSocket = new ServerSocket(55555);
        while (true) {
            System.out.println("gozleme basladi");
            Socket connection = serverSocket.accept();
            System.out.println("yeni client geldi");
            DataInputStream dataInputStream = new DataInputStream(connection.getInputStream());
            byte[] arr = readMessage(dataInputStream);
            FileUtility.writeBytes("C:\\Users\\mr_ra\\OneDrive\\Desktop\\894842a.jpg", arr);

        }
    }

    public static byte[] readMessage(DataInputStream dataInputStream) throws Exception {
        int msgLen = dataInputStream.readInt();
        byte[] msg = new byte[msgLen];
        dataInputStream.readFully(msg);
        return msg;
    }

    public static void readAsString() throws Exception {
        ServerSocket serverSocket = new ServerSocket(55555);
        while (true) {
            System.out.println("gozlemeye basladi");
            Socket connection = serverSocket.accept();
            System.out.println("yeni client geldi");
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String message = bufferedReader.readLine();
            System.out.println("message from client=" + message);
        }
    }
}
