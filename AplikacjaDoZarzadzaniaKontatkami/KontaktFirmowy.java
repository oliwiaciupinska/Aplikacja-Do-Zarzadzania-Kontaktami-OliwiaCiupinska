package AplikacjaDoZarzadzaniaKontatkami;


// Klasa dziedzicząca po Kontakty - kontakt firmowy
public class KontaktFirmowy extends Kontakty {
    private String nazwaFirmy;

    public KontaktFirmowy(String imie, String nazwisko, String email, int id, int numerTelefonu, String nazwaFirmy) {
        super(imie, nazwisko, email, id, numerTelefonu);
        this.setNazwaFirmy(nazwaFirmy);
    }

    // Getter
    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    // Setter z walidacją
    public void setNazwaFirmy(String nazwaFirmy) {
        if (nazwaFirmy == null || nazwaFirmy.trim().isEmpty()) {
            throw new IllegalArgumentException("Pole z nazwą firmy nie może być puste");
        }
        this.nazwaFirmy = nazwaFirmy;
    }

    // Nadpisanie toString, by dodać nazwę firmy
    @Override
    public String toString() {
        return super.toString() + ", Nazwa firmy: " + nazwaFirmy;
    }
}
