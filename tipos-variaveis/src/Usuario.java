public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está ligada? " +smartTv.ligada);
        System.out.println("volume da tv: " +smartTv.volume);
        System.out.println("canal da tv: " +smartTv.canal);

        smartTv.onOff();
        System.out.println("Tv está ligada? " +smartTv.ligada);
        smartTv.onOff();
        System.out.println("Tv está ligada? " +smartTv.ligada);

        smartTv.avancarCanal();
        System.out.println("canal da tv: " +smartTv.canal);
        smartTv.avancarCanal();
        System.out.println("canal da tv: " +smartTv.canal);

        smartTv.voltarCanal();
        System.out.println("canal da tv: " +smartTv.canal);
        smartTv.voltarCanal();
        System.out.println("canal da tv: " +smartTv.canal);
        smartTv.voltarCanal();
        System.out.println("canal da tv: " +smartTv.canal);
        smartTv.voltarCanal();
        System.out.println("canal da tv: " +smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("volume da tv: " +smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("volume da tv: " +smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("volume da tv: " +smartTv.volume);
        
    }
}
