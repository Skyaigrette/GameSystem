import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Game rainbowSixSiege = new Game();
        rainbowSixSiege.setId(1);
        rainbowSixSiege.setName("Tom Clancy's Rainbow Six Siege");
        rainbowSixSiege.setOriginalPrice(120);

        Player goktug = new Player();
        goktug.setId(1);
        goktug.setBirthDayYear(2005);
        goktug.setNationalIdentity("12345678901");
        goktug.setNickName("Skyaigrette");
        goktug.setRealFirstName("Göktuğ Furkan");
        goktug.setRealLastName("Arıca");

        Game[] blackFridayGames = {rainbowSixSiege};

        rainbowSixSiege.getSalePrice();
        Campaign blackFriday = new Campaign();
        blackFriday.setCampaignedGames(blackFridayGames);
        blackFriday.setCampaignID(1);
        blackFriday.setDiscount(10);
        blackFriday.setCampaignName("BLACK FRIDAY");
        CampaignManager campaignManager = new CampaignManager();
        System.out.println("Kampanya Öncesi : " + rainbowSixSiege.getSalePrice());
        campaignManager.startCampaign(blackFriday);
        System.out.println("Kampanya Sırasında : " + rainbowSixSiege.getSalePrice());
        campaignManager.endCampaign(blackFriday);
        System.out.println("Kampanya Sonrası : " + rainbowSixSiege.getSalePrice());

        PlayerManager playerManager = new PlayerManager(new EDevletValidationSystem());
        playerManager.register(goktug);

        GameManager gameManager =new GameManager();
        gameManager.buyGame(rainbowSixSiege, goktug);



    }
}
