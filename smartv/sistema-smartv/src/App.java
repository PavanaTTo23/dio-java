public class App {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();
        System.out.println(tv.ligada);
        tv.ligar();
        System.out.println(tv.ligada);
        tv.aumentarVolume();
        System.out.println(tv.volume);
    }
}
