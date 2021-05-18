package entities;

import abstracts.Entity;

public class Campaign implements Entity {
	private int id;
	private String name;
	private int campaignStock;
	private double campaignDiscount;

	public Campaign(int id, String name, int campaignStock, double campaignDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.campaignStock = campaignStock;
		this.campaignDiscount = campaignDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCampaignStock() {
		return campaignStock;
	}

	public void setCampaignStock(int campaignStock) {
		this.campaignStock = campaignStock;
	}

	public double getCampaignDiscount() {
		return campaignDiscount;
	}

}
