package Entities;

public class Campaign 
{
	private int campaingId;
	private String campaingName;
	private String campaingDescription;
	private double discount;
	

	public Campaign(int campaingId, String campaingName, String campaingDescription, double discount) {
		super();
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		this.campaingDescription = campaingDescription;
		this.discount = discount;
	}
	
	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public String getCampaingDescription() {
		return campaingDescription;
	}

	public void setCampaingDescription(String campaingDescription) {
		this.campaingDescription = campaingDescription;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
