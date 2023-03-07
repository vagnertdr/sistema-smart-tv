public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Canal atual:" + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal atual:" + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual:" + smartTv.canal);



        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Aumentado: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume Diminuido: " + smartTv.volume);


    }
}