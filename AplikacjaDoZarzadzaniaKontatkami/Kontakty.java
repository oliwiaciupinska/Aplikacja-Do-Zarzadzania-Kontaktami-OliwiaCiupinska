package AplikacjaDoZarządzaniaKontaktami;

public class Kontakty {
    // Hermetyzacja danych ( pola klasy widoczne tylko z klasy)
    private String imie;
    private String nazwisko;
    private String email;
    private int id;
    private  int numerTelefonu;

    //Konstruktor klasy Kontakty bez przypisanych zmiennych startowych
    public Kontakty() {
        this.imie = " ";
        this.nazwisko = " ";
        this.email = " ";
        this.id = 0;
        this.numerTelefonu = 0;
    }

    //Konstruktor klasy Kontakty z przypisanymi zmiennymi startowymi (przeciążenie konstruktora)
    public Kontakty(String imie , String nazwisko,String email, int id , int numerTelefonu){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.id = id;
        this.numerTelefonu = numerTelefonu;
    }


    //Gettery służące do pobierania pola klasy

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public String getEmail(){
        return email;
    }

    public int getId(){
        return id;
    }

    public int getNumerTelefonu(){
        return numerTelefonu;
    }


    //Settery służąće do modyfikacji pola klasy

    public void setImie(String imie) {
        //Instrukcja warunkowa do obsługi  błednych danych w polu imie
        if (imie == null || imie.replace(" ", " ").isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko){
       //Instrukcja warunkowa do obsługi błędnych danych w polu nazwisko
        if(nazwisko == null || nazwisko.replace(" ", " ").isEmpty()){
            throw  new IllegalArgumentException("Pole nazwisko nie może być puste");
        }
        this.nazwisko = nazwisko;
    }

    public void setEmail(String email){
      //Instrukcja warunkowa do obsługi błędnych danych w polu email
        if (email == null || email.replace(" ", " ").isEmpty()){
            throw  new IllegalArgumentException("Pole email nie może być puste");
        }
        this.email = email;
    }

    public void setId(int id){
       //Instrukcja warunkowa do obsługi błędnych danych w polu ID
        if(id <= 0){
            throw new IllegalArgumentException("ID nie może być mniejsze bądź równe zeru");
        }
        this.id = id;
    }

    public void setNumerTelefonu(int numerTelefonu){
       //Instrukcja warunkowa do obsługi błędncyh danych w polu numerTelefonu
        if (numerTelefonu <= 0){
            throw  new IllegalArgumentException("Numer telefonu musi być większy od zera.");
        }
        this.numerTelefonu = numerTelefonu;
    }

    // Metoda wywołania klasy nadrzędnej w programie (Wypisanie tekstu za pomocą toString)
    @Override
    public String toString(){
        return "ID: "  + id + ", Imie: " + imie + ", Nazwisko: " + nazwisko + " , Email: " + email + ", Numer telefonu: " + numerTelefonu;
    }
}
