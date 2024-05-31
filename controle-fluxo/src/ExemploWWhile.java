import java.util.concurrent.ThreadLocalRandom;
public class ExemploWWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada>0) /*enquanto o valor da mesada for maior que 0 o Joao vai pegar um doce.*/ {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)/*Se o valor do doce for maior que a mesada automaticamente estamos tornando o valor do doce igual a mesada. */
                valorDoce = mesada;
            
            System.out.println("Valor do Doce: " + valorDoce + "Adicionado ao Carrinho");
            mesada = mesada - valorDoce; /*Instrução so será interrompida qua do o valor da mesada for igual a 0, do contrario continuara adicionando doces ao carrinho. */
        }
            System.out.println("Mesada:" + mesada);
            System.out.println("Joaozinho Gastou toda sua mesada em doces");

        }
    
    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
        
    }
}
