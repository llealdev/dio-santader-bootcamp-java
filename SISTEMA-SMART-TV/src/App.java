public class App {
    public static void main(String[] args) throws Exception {
        
        SmartTV tv = new SmartTV();


        System.out.println("A televisão está ligada: " + tv.ligada);
        System.out.println("Volume: " + tv.volume);
        System.out.println("Canal: " + tv.canal);

        System.out.println();
        System.out.println("---------- LIGAR TV ----------");;

        tv.ligarTv();
        System.out.println("A televisão está ligada: " + tv.ligada);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.println("Volume: " + tv.volume);

        tv.mudarCanal(10);
        System.out.println("Canal: " + tv.canal);
    }
}
