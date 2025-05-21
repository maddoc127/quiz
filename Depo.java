import java.util.ArrayList;

public class Depo {
    public ArrayList<Gene<?>> depoliste = new ArrayList<>(); 
    int limit;

    public Depo(){}

    public Depo(int limit){
        this.limit = limit;
    }

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

    public <T> T KutudanHerşeyiCikar(Gene<T> urun){
        return urun.get();
    }

    public Gene<?> bavulkutula(Bavul urun){
        if(urun.weight > this.limit){
            throw new CustomException("bavul çok ağır.");
        }
        return new Gene<>(urun);
    }
}