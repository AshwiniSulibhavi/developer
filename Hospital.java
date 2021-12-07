package com.xworkz.cloning.application;

public class Hospital implements Cloneable {
	

		
		private String hospitalName;
		private long hospitalContactNo;
		private int noOfPatients;
		private String location;
		private int enteranceFees;
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		public String getHospitalName() {
			return hospitalName;
		}
		public void setHospitalName(String hospitalName) {
			this.hospitalName = hospitalName;
		}
		public long getHospitalContactNo() {
			return hospitalContactNo;
		}
		public void setHospitalContactNo(long hospitalContactNo) {
			this.hospitalContactNo = hospitalContactNo;
		}
		public int getNoOfPatients() {
			return noOfPatients;
		}
		public void setNoOfPatients(int noOfPatients) {
			this.noOfPatients = noOfPatients;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getEnteranceFees() {
			return enteranceFees;
		}
		public void setEnteranceFees(int enteranceFees) {
			this.enteranceFees = enteranceFees;
		}
		
		
		


}
