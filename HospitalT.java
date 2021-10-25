class Hospital{

public PatientDTO[]patients;

private int index;

public Hospital(int size){

patients= new PatientDTO[size];
}
public boolean createPatientDetails(PatientDTO patients){
boolean patientAdded=false;

System.out.println("inside createPatientDetails()");

if(patients!= null){
this.patients[index++]=patients;
patientAdded=true;
}
else{


System.out.println("No patient aadded");
return patientAdded=false;
}
return patientAdded;
}
public void get AllPatients(){

  for(int i=0;i<patients.length;i++){
      System.out.println(patients[i]);
	  }
	  }
	  
	  public PatientDTO getPatientByName(String patientName){
	    PatientDTO patientDTO=null;
		System.out.println("inside getPatientby Name()");
		
		if(patientName!=null){
		
		   for(int i=0;i<patients.length;i++){
		   
		   if(patients[i].getPatientName().eguals(patientName))
		   System.out.println("patient found by Name:"+patientName);
		   patientDTO=patients[i];
		   }
		   }
		   }
		   else{
		   System.out.println("no patients by Name:"+patientName);
		   }
		   return patientDTO;
		   }
		   }