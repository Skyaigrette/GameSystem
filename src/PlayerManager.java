public class PlayerManager implements UserService {

    ValidationService validationService;

    public PlayerManager(ValidationService validationService){
        this.validationService = validationService;
    }

    @Override
    public void register(Player player) {
        if(validationService.checkUser(player)) {
            System.out.println(player.getNickName() + " Nickname'li Kullanıcı Sisteme Kaydedildi.");
        }else{
            System.out.println("Kullanıcı Kaydedilemedi.");
        }
    }

    @Override
    public void update(Player player) {
        System.out.println(player.getNickName() + " Nickname'li Kullanıcının Bilgileri Güncellendi.");
    }

    @Override
    public void deleteRegistry(Player player) {
        System.out.println(player.getNickName() + " Nickname'li Kullanıcı Sisteme Kaydedildi.");
    }

}
