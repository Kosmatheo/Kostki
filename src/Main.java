import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Losowania losowania = new Losowania();
        Scanner scanner = new Scanner(System.in);
        boolean czydalej = true;
        do {

            int liczbaK;
            do {
                System.out.println("Podaj liczbę kości którymi chcesz rzucić z przedziału: (3:10): ");
                liczbaK = scanner.nextInt();
            } while (liczbaK <= 3 || liczbaK >= 10);
            losowania.losujKosci(liczbaK);
            System.out.println("Wynik: " + losowania.liczPunkty());
            System.out.println("Czy chcesz to powtórzyć? (true/false)");
            czydalej = scanner.nextBoolean();
        }while(czydalej);
    }
}