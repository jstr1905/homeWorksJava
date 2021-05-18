package entities;

import abstracts.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private String detail;
	private String developer;
	private String platform;
	private double unitPrice;

	public Game() {
	}

	public Game(int id, String name, String detail, String developer, String platform, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.developer = developer;
		this.platform = platform;
		this.unitPrice = unitPrice;
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
