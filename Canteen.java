package com.xworkz.cloning.application;

public class Canteen implements Cloneable {
	
	
		
		
		private String canteenName;
		private String canteenLocation;
		private String iteam;
		private int iteamCost;
		private long contactNo;
		@Override
		protected Object clone() throws CloneNotSupportedException {

			return super.clone();
		}
		public String getCanteenName() {
			return canteenName;
		}
		public void setCanteenName(String canteenName) {
			this.canteenName = canteenName;
		}
		public String getCanteenLocation() {
			return canteenLocation;
		}
		public void setCanteenLocation(String canteenLocation) {
			this.canteenLocation = canteenLocation;
		}
		public String getIteam() {
			return iteam;
		}
		public void setIteam(String iteam) {
			this.iteam = iteam;
		}
		public int getIteamCost() {
			return iteamCost;
		}
		public void setIteamCost(int iteamCost) {
			this.iteamCost = iteamCost;
		}
		public long getContactNo() {
			return contactNo;
		}
		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		
			
		}


}
