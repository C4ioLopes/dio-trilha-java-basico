import java.util.Locale;
import java.util.Scanner;

public class AboutMe1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite Sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o Seu Nome");
        String nome = scanner.next();

        System.out.println("Digite seu SobreNome");
        String sobreNome = scanner.next();
        
        System.out.println("Meu nome: " + nome);
        System.out.println("Nome completo: "+ nome + " " + sobreNome);
        System.out.println("Minha altura: " + altura);
    }
}

