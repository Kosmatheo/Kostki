import java.util.ArrayList;
import java.util.Random;

public class Losowania {
    private ArrayList<Kostki> listak = new ArrayList<>();
    private ArrayList<Integer> listap = new ArrayList<>();
    Random random = new Random();
    int r;
    public void losujKosci(int ileKosci){
        listak.clear();
        for(int i = 0; i < ileKosci ; i++){
            r = random.nextInt(1,6);
            listak.add(new Kostki(i , r));
        }
        for(int i = 0 ; i < ileKosci ; i++){
            System.out.println("Kostka nr. "+(listak.get(i).getNrKostki()+1)+" ma wartość: "+listak.get(i).getWartoscostki());
        }
    }
    public int liczPunkty(){
        listap.clear();
        for(Kostki x :listak){
            if(!listap.contains(x.getWartoscostki())){
                listap.add(x.getWartoscostki());
            }
        }

        int wynik = 0;
        for(int x :listap){
            int liczba = 0;
            for(Kostki y :listak){
                if(y.getWartoscostki() == x){
                    liczba++;
                }
            }
            if(liczba > 1) {
                wynik += liczba * x;
            }
        }
        return wynik;
    }

}
