public class Campaign {
    private int campaignID;
    private int discount;
    private String campaignName;
    private Game[] campaignedGames;

    public int getCampaignID() {
        return campaignID;
    }

    public void setCampaignID(int campaignID) {
        this.campaignID = campaignID;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public Game[] getCampaignedGames() {
        return campaignedGames;
    }

    public void setCampaignedGames(Game[] campaignedGames) {
        this.campaignedGames = campaignedGames;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
