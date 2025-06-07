package AplikacjaDoZarzadzaniaKontatkami;



import java.util.Map;
import java.util.Scanner;

// Klasa do dodawania kontaktów
public class DodajKontakt {

    // Metoda używana do dodawania kontaktów
    public void wykonaj(Map<String, Kontakty> kontakty, Scanner sc) {
        try {
            // Wprowadzanie kluczowych danych
            System.out.println("Podaj ID kontaktu: ");
            String id = sc.nextLine();
            int idInt = Integer.parseInt(id);

            System.out.println("Podaj Imię: ");
            String imie = sc.nextLine();

            System.out.println("Podaj Nazwisko: ");
            String nazwisko = sc.nextLine();

            System.out.println("Podaj Email: ");
            String email = sc.nextLine();

            System.out.println("Podaj numer telefonu: ");
            String numerTelefonuStr = sc.nextLine();
            int numerTelefonu = Integer.parseInt(numerTelefonuStr);

            // Tworzenie nowego obiektu kontaktu
            Kontakty kontakt = new Kontakty();
            kontakt.setId(idInt);
            kontakt.setImie(imie);
            kontakt.setNazwisko(nazwisko);
            kontakt.setEmail(email);
            kontakt.setNumerTelefonu(numerTelefonu);

            // Dodanie kontaktu do mapy (klucz to String id)
            kontakty.put(id, kontakt);

            System.out.println("Dodano nowy kontakt.");
        } catch (NumberFormatException e) {
            System.out.println("Błąd: zarówno numer telefonu jak i ID muszą być liczbami całkowitymi.");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd podczas dodawania kontaktu: " + e.getMessage());
        }
    }
}
