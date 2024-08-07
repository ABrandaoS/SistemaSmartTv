public class Usuario {
    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        limpaTela();

        System.out.println("TV Ligada? " + smartTv.ligada);
        //System.out.println("Canal atual: " + smartTv.canal);
        //System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        /* smartTv.desligar();
        System.out.println("TV Ligada? " + smartTv.ligada);
        */

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        // System.out.println(smartTv.canal);
        smartTv.mudarCanal(20);
    }
}
