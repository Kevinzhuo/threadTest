package CancleThread;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2015/10/26.
 */
public class ReaderThread extends Thread {

    private final Socket socket;
    private final InputStream in;
    private ConcurrentHashMap a = new ConcurrentHashMap();
    private Map b = new HashMap<>();

    public ReaderThread(Socket socket, InputStream in) {
        this.socket = socket;
        this.in = in;
    }

    public void interrupt() {
        try {
            socket.close();

        } catch (IOException ignored) {

        } finally {
            super.interrupt();
        }
    }

    public void run() {
        try {
            byte[] buf = new byte[1024];
            while (true) {
                int count = in.read(buf);
                if (count < 0)
                    break;
//                else if (count > 0)
//                    processBuffer(buf, count);
            }
        } catch (IOException e) {

        }
    }

}
