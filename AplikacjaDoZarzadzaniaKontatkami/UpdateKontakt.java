package  AplikacjaDoZarządzaniaKontaktami;

import java.util.Map;
import java.util.Scanner;

//Klasa do aktualizacj kontaktów
public class UpdateKontakt {

    //Metoda aktualizacji istniejacego kontakut
    public void wykonaj(Map<String, Kontakty> kontakty, Scanner sc) {
        System.out.println("Podaj ID kontaktu, który chcesz zaktualizować: ");
        String id = sc.nextLine();

        //Instrukcja warunkowa sprawdzajaczy czy kontakt wgl istniej
        if (!kontakty.containsKey(id)) {
            System.out.println("Kontakt o podanym ID nie istnieje.");
            return;
        }

        Kontakty kontakt = kontakty.get(id);

        try {
            /*Pobieranie i aktualizwaonie danych w kontakcie
              Każdy z przypadków zawierra równie insturkcje warunkowe w celu uniknięcie
              błędu podczas aktualizacji kontaktu
             */
            System.out.println("Podaj nowe Imie (aktualne: " + kontakt.getImie() + "): ");
            String imie = sc.nextLine();
            if (!imie.isEmpty()) kontakt.setImie(imie);

            System.out.println("Podaj nowe Nazwisko (aktualne: " + kontakt.getNazwisko() + "): ");
            String nazwisko = sc.nextLine();
            if (!nazwisko.isEmpty()) kontakt.setNazwisko(nazwisko);

            System.out.println("Podaj nowy Email (aktualny: " + kontakt.getEmail() + "): ");
            String email = sc.nextLine();
            if (!email.isEmpty()) kontakt.setEmail(email);

            System.out.println("Podaj nowy numer telefonu (aktualny: " + kontakt.getNumerTelefonu() + "): ");
            String numerTelefonuStr = sc.nextLine();
            if (!numerTelefonuStr.isEmpty()) {
                int numerTelefonu = Integer.parseInt(numerTelefonuStr);
                kontakt.setNumerTelefonu(numerTelefonu);
            }

            System.out.println("Podaj nowy ID (aktualny: " + kontakt.getId() + "): ");
            String kontaktIdStr = sc.nextLine();
            if (!kontaktIdStr.isEmpty()) {
                int kontaktId = Integer.parseInt(kontaktIdStr);
                kontakt.setId(kontaktId);
            }

            System.out.println("Kontakt został zaktualizowany.");

        } catch (NumberFormatException e) {
            System.out.println("Błąd: numer telefonu i ID muszą być liczbą całkowitą." + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd podczas aktualizacji: " + e.getMessage());
        }
    }
}
