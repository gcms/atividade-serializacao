package br.edu.ifg.sisd.rpc;


import java.io.IOException;
import java.net.*;
import java.util.Arrays;

public class UDPClient {
    public static final int SERVER_PORT = 6789;

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("UDPClient <SERVER_URL> <OPERACAO> <ARGS>");
            System.exit(1);
        }

        String host = args[0];
        String operacao = args[1];
        String[] params = Arrays.copyOfRange(args, 2, args.length);

        InetSocketAddress destinatario = new InetSocketAddress(host, SERVER_PORT);


    }
}
