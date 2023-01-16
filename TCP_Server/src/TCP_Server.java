import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket=new ServerSocket(55555);
        while (true){
            System.out.println("gozlemeye basladi");
            Socket connection =serverSocket.accept();
            System.out.println("gozleyir");
            InputStream inputStream=connection.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

            String message =bufferedReader.readLine();
            System.out.println("message from client="+message);
        }

    }
}
