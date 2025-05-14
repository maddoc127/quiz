public class Main {
    public static void main(String[] args) {
        Depo depo1 = new Depo();
        Depo depo2 = new Depo();
        Kamyon kamyon1 = new Kamyon();
        Oyuncak oyuncak1 = new Oyuncak();
        Giysi giysi1 = new Giysi();
        

        depo1.depoliste.add(depo1.kutula(oyuncak1));
        depo1.depoliste.add(depo1.kutula(giysi1));

        System.out.println(depo1.depoliste);
        System.out.println(kamyon1.kamyonliste);

        depo1.kamyonaYukle(kamyon1);

        System.out.println(depo1.depoliste);
        System.out.println(kamyon1.kamyonliste);

        
    }
}
