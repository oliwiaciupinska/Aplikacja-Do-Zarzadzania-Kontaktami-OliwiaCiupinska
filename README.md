# Projekt-Aplikacja-Do-Zarzadzania-Kontaktami-Oliwia-Ciupinska
# Aplikacja do zarządzania kontaktami

## Opis

Konsolowa aplikacja napisana w Javie do zarządzania kontaktami prywatnymi i firmowymi. Pozwala na dodawanie, aktualizację, usuwanie oraz wyświetlanie kontaktów.

## Struktura aplikacji

- `Run` – główna klasa z menu i obsługą użytkownika.
- `Kontakty` – klasa reprezentująca kontakt z polami: imię, nazwisko, email, id, numer telefonu, wraz z walidacją.
- `DodajKontakt`, `UpdateKontakt`, `UsunKontakt` – klasy do obsługi CRUD.
- `KontaktFirmowy` – klasa rozszerzająca `Kontakty` o pole nazwa firmy.
- W klasie `Kontakty` znajduje się tablica `typKontaktow` z typami kontaktów.

## Działanie

1. Uruchom klasę `Run` i wywołaj metodę `uruchom()`.
2. Wybierz opcję z menu:
   - Dodaj, zaktualizuj lub usuń kontakt.
   - Wyświetl wszystkie kontakty.
   - Dodaj kontakt firmowy.
   - Zakończ program.
3. Podaj dane kontaktu w konsoli.
4. Kontakty są przechowywane w pamięci (HashMap) pod unikalnym kluczem.
5. Program waliduje dane i obsługuje błędy.

## Wymagania

Projekt spełnia następujące wymagania:

1. Napisany w języku Java z wykorzystaniem programowania obiektowego (konsolowy projekt).
2. Wykorzystuje typy proste, referencyjne i tablicowe, instrukcje warunkowe i pętle oraz przetwarzanie łańcuchów tekstowych.
3. Zawiera minimum 5 klas, w tym przynajmniej jedną z przeciążonym konstruktorem/metodą oraz z hermetyzacją (modyfikatory dostępu).
4. Wykorzystuje dziedziczenie (klasa `KontaktFirmowy` rozszerza `Kontakty`) i przesłanianie metod (`toString`).
5. Używa kolekcji z pakietu `java.util` (HashMap).
6. Zawiera standardową obsługę wyjątków i walidację danych.
7. Umożliwia wykonywanie operacji CRUD.
8. Posiada prosty mechanizm menu użytkownika w konsoli.
9. Zawiera komentarze w kodzie oraz instrukcję uruchomienia w tym pliku README.
10. Jest umieszczony w repozytorium Git z historią zmian (minimum 5 commitów).
11. Dokumentacja projektowa sporządzona w LaTeX (poza kodem źródłowym).
