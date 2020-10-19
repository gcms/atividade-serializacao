package br.edu.ifg.sisd.rpc;

import java.io.*;

public class Mensagem implements Serializable {
    private static final long serialVersionUID = 1;

    public static Mensagem deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (Mensagem) ois.readObject();
    }

    public static byte[] serialize(Mensagem msg) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(msg);
        oos.close();

        return baos.toByteArray();
    }

    public byte[] getBytes() throws IOException {
        return serialize(this);
    }

}