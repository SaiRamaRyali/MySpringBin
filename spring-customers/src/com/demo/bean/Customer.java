package com.demo.bean;

public class Customer {
	
	
	private String name;
	private int rewards;
	
	
	public Customer()
	{
		
	}
	
	
	public Customer(String name, int rewards) {
		super();
		this.name = name;
		this.rewards = rewards;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRewards() {
		return rewards;
	}
	public void setRewards(int rewards) {
		this.rewards = rewards;
	}
	
	public double findRewardsAount()
	{
		return rewards*2.5;
	}
}
