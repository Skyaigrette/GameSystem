public class GameManager implements GameService{
    @Override
    public void buyGame(Game game, Player player) {
        System.out.println(player.getNickName() + " İsimli Oyuncu "+game.getName() + " İsimli Oyunu Satın Aldı.");
    }

    @Override
    public void returnGame(Game game, Player player) {
        System.out.println(player.getNickName() + " İsimli Oyuncu "+game.getName() + " İsimli Oyunu İade Etti.");
    }
}
