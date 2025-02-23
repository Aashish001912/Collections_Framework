package com.aashish.CabCustomer;


public class CabCustomer
{
	private int custId;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distanca;
	private String phone;
	
	public CabCustomer()
	{
		
	}
	
	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distanca,
			String phone) 
	{
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distanca = distanca;
		this.phone = phone;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public int getDistanca() {
		return distanca;
	}

	public void setDistanca(int distanca) {
		this.distanca = distanca;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", pickupLocation=" + pickupLocation
				+ ", dropLocation=" + dropLocation + ", distanca=" + distanca + ", phone=" + phone + "]";
	}
	
	

}
