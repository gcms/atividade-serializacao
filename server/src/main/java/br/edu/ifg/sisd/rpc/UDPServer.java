package br.edu.ifg.sisd.rpc;

import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPServer {
    public static final int SERVER_PORT = 6789;

    public static void main(String[] args) throws SocketException {
        DatagramSocket socket = new DatagramSocket(null);
        socket.bind(new InetSocketAddress(SERVER_PORT));
        System.out.println("Servidor esperando na porta " + SERVER_PORT + "...");

        while (true) {

            // le pacotes de requisição, deserializa pacotes em mensagens, executa a chamada, cria uma mensagem de resposta e serializa a resposta
        }
    }

}
