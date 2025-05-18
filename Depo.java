import java.util.ArrayList;

public class Depo {
    public ArrayList<Gene<?>> depoliste = new ArrayList<>(); 

    public Depo(){}

    public Gene<?> kutula(IBoxable urun){
        return new Gene<>(urun);
    }


    public void kamyonaYukle(Kamyon kamyon){
        kamyon.kamyonliste.add(depoliste.removeLast());
    }

    public void kamyondanIndir(Kamyon kamyon){
        depoliste.add(kamyon.kamyonliste.removeLast());
        
    }

    public Oyuncak KutudanOyuncakCikar(Gene<Oyuncak> urun){
         return urun.get();
    }

    public Giysi KutudanGiysiCikar(Gene<Giysi> urun){
         return urun.get();
    }

}
