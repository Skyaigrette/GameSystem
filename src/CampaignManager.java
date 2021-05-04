public class CampaignManager implements CampaignService{
    @Override
    public void startCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " Kampanyası Başlatıldı !");
        for(Game game: campaign.getCampaignedGames()){
            game.setDiscountAmount(campaign.getDiscount());
        }
    }

    @Override
    public void endCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " Kampanyası Durduruldu !");
        for(Game game: campaign.getCampaignedGames()){
            game.setDiscountAmount(0);
        }
    }
}
