import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class CriadorDeArquivo {
    public void geraArquivo(Endereco nvEndereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter escrita = new FileWriter(nvEndereco.cep()+".json");
        escrita.write(gson.toJson(nvEndereco));
        escrita.close();
    }
}
