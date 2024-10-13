import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Qual CEP vc deseja procurar?");
        ConsultaCep cep = new ConsultaCep();
        try {
            Endereco nvEndereco = cep.buscaCep(leitura.nextLine());
            System.out.println(nvEndereco);
            CriadorDeArquivo criador = new CriadorDeArquivo();
            criador.geraArquivo(nvEndereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Não foi possivel procurar o endereco");
        }
    }
}