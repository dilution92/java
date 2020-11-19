package cheating;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {

    private static final String IP = "192.168.40.124";
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try {
            final Socket socket = new Socket(IP, PORT);
            // �ܺο��� ���� ���� �����͸� ȭ�鿡 ����ϴ� ������
            final ListenerThread listener = new ListenerThread(socket.getInputStream());
            listener.start();
            
            while (true) {
                writeMessage(socket.getOutputStream());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeMessage(OutputStream outputStream) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("�Է� > ");
        final String messageToSend = scanner.nextLine();
        final byte[] raw = messageToSend.getBytes(StandardCharsets.UTF_8);
        outputStream.write(raw);
    }
}
