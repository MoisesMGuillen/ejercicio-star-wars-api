package Modelos;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorDeArchivos {
    public EscritorDeArchivos(String ep, String json) {
        try {
            FileWriter escritura = new FileWriter("Episodio "+ep);
            escritura.write(json);
            escritura.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
