import java.io.*;
import  java.net.*;
import java.util.Arrays;


public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        Logika logika = new Logika();
        Socket clientSocet = serverSocket.accept();
        System.out.println("Client conect");

        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocet.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocet.getOutputStream()));

        int[][] massiv = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,}};

        int end = 1;
        while ( end > 0) {

            logika.printMassiv(massiv);
            writer.write("vvedi in 1-9\n");
            writer.flush();
            int chislo = reader.read();
            System.out.println("");
            System.out.println(chislo);
            logika.poiskChisla(chislo,massiv);
            logika.proverka(massiv);
            logika.randomnoe(massiv);
            logika.proverkaServ(massiv);
            logika.printMassiv(massiv);
        }
        reader.close();
        writer.close();
        clientSocet.close();
        serverSocket.close();
    }

}
