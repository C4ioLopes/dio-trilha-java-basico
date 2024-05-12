public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(12);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Canal Atual? " + smartTv.canal);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Canal atual? " + smartTv.volume);
    }
}
