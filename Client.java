import java.io.DataOutputStream;
import java.net.Socket;
public class Client{

    public static void main(String[] args) throws
    Exception{
        Socket s2 = new Socket("10.110.54.133",7777);
        DataOutputStream ds2 = new DataOutputStream(s2.getOutputStream());
        ds2.writeUTF("break");
    }
}