import java.util.Locale;

public class EDevletValidationSystem implements ValidationService {
    @Override
    public boolean checkUser(Player player) {
        if (player.getRealFirstName().equalsIgnoreCase("GÖKTUĞ FURKAN") && player.getRealLastName().equalsIgnoreCase("ARICA") &&
                player.getBirthDayYear() == 2005 && player.getNationalIdentity().equals("12345678901")) {
            System.out.println(player.getNationalIdentity() + " TC'li oyuncu doğrulandı.");
            return true;
        } else {
            System.out.println(player.getRealFirstName().toUpperCase());
            System.out.println(player.getRealLastName().toUpperCase());
            System.out.println(player.getNationalIdentity() + " TC'li oyuncu doğrulanamadı.");
            return false;
        }
    }
}
