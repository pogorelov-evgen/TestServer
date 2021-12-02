import java.io.*;
import java.net.*;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket clientSocet = new Socket("127.0.0.1", 8000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocet.getInputStream()));
        BufferedReader readerClaviatura = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocet.getOutputStream()));

        int end = 1;
        while (end > 0) {
            String messange = reader.readLine();
            System.out.println(messange);

            int chislo = Integer.parseInt(readerClaviatura.readLine());
            writer.write(chislo);
            writer.flush();

        }
        readerClaviatura.close();
        reader.close();
        writer.close();
        clientSocet.close();
    }
}