package AplikacjaDoZarządzaniaKontaktami;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Klasa główna do uruchamiania i obsługi menu
public class Run {

    // Tworzymy mapę kontaktów i skaner do pobierania danych
    private Map<String, Kontakty> kontakty = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    // Tworzymy obiekty do obsługi CRUD
    private DodajKontakt dodajKontakt = new DodajKontakt();
    private UpdateKontakt updateKontakt = new UpdateKontakt();
    private UsunKontakt usunKontakt = new UsunKontakt();

    // Metoda uruchamiająca menu aplikacji
    public void uruchom() {
        boolean dziala = true;

        while (dziala) {
            // Wyświetlamy menu
            System.out.println("\n=== MENU ===");
            System.out.println("1. Dodaj kontakt");
            System.out.println("2. Aktualizuj kontakt");
            System.out.println("3. Usuń kontakt");
            System.out.println("4. Wyświetl wszystkie kontakty");
            System.out.println("5. Dodaj kontakt firmowy");
            System.out.println("6. Zakończ");
            System.out.println("Wybierz opcję: ");

            String wybor = scanner.nextLine();

            // Obsługa wyboru użytkownika
            switch (wybor) {
                case "1":
                    dodajKontakt.wykonaj(kontakty, scanner); // dodawanie kontaktu
                    break;
                case "2":
                    updateKontakt.wykonaj(kontakty, scanner); // aktualizacja kontaktu
                    break;
                case "3":
                    usunKontakt.wykonaj(kontakty, scanner); // usuwanie kontaktu
                    break;
                case "4":
                    wyswietlKontakty(); // wyświetlanie wszystkich
                    break;
                case "5":
                    dodajKontaktFirmowy(); // dodawanie kontaktu firmowego
                    break;
                case "6":
                    dziala = false; // zakończenie programu
                    System.out.println("Zakończono program.");
                    break;
                default:
                    System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
            }
        }

        // Zamykanie skanera po zakończeniu działania
        scanner.close();
    }

    // Metoda do wyświetlania kontaktów
    private void wyswietlKontakty() {
        if (kontakty.isEmpty()) {
            System.out.println("Brak kontaktów do wyświetlenia.");
        } else {
            System.out.println("\n==== Lista kontaktów ====");
            for (Map.Entry<String, Kontakty> entry : kontakty.entrySet()) {
                System.out.println("ID klucza: " + entry.getKey() + " ====> " + entry.getValue());
            }
        }
    }

    //Metoda do dodania kontaktu firmowego
    private  void dodajKontaktFirmowy(){
        System.out.println("\n==== Dodawanie kontaktu firmowego ===");

        System.out.println("Imię ");
        String imie = scanner.nextLine();

        System.out.println("Nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.printf("Numer telefonu: ");
        int numerTelefonu = Integer.parseInt(scanner.nextLine());

        System.out.println("Nazwa firmy: ");
        String nazwaFirmy = scanner.nextLine();

        //Tworzymy nowy obiekt umożliwajacy nam dodawanie kontaktu firmowego
        KontaktFirmowy kontaktFirmowy = new KontaktFirmowy(imie , nazwisko , email ,id ,numerTelefonu , nazwaFirmy);

        String klucz = nazwaFirmy.toLowerCase().replace(" ", " ") + id;

        //Sprawdzamy czy nie istnieje już wcześniej kontak o podanym ID
        if(kontakty.containsKey(klucz)){
            System.out.println("Istnieje już kontakt z takim ID");
        } else {
            kontakty.put(klucz, kontaktFirmowy);
            System.out.println("Dodano kontakt firmowy.");
        }
    }
}
