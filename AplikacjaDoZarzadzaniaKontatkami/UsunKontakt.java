package AplikacjaDoZarządzaniaKontaktami;

import java.util.Map;
import java.util.Scanner;

public class UsunKontakt {

    // Metoda usuwająca kontakt po podaniu ID
    public void wykonaj(Map<String, Kontakty> kontakty , Scanner sc){
        System.out.println("Podaj ID kontaktu do usuniecia");
        String id = sc.nextLine();


        if(kontakty.containsKey(id)){
            kontakty.remove(id);
            System.out.println("Kontakt został usunięty.");
        }else{
            System.out.println("Kontakt o podanym ID inie istniej.");
        }
    }
}
