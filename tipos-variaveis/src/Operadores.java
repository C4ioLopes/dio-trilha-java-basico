public class Operadores {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        if (numero1 > numero2){
            System.out.println("Verdadeiro");
        }
        else{
            System.out.println("Falso");
        } 
    
        System.out.println("numeroUm e igual a numeroDois? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numero1 e Diferente do Numero2 ? " + simNao);
    }
}
