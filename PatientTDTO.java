class PatientDTO{

public PatientDTO(){
System.out.println(this.getClass().getSimpleName()+"object is created");
}


private int patientId;
private String patientName;
private long contactNo;
private String address;
private String bloodGroup;
private char gender;


public void setPatientId(int patientId){
this.patientId=ppatientId;
}
public int getPatientId(){
return patientId;
}


public void setPatientName(String patientName){
this.patientName=patientName;
}
public String getPatientName(){
return patientName;
}

public void setContactNo(long contactNo){
this.contactNo=contactNo;
}
public long getContactNo(){
return contactNo;
}

public void setAddress(String address){
this.address=address;
}
public String getAddress(){
return address;
}
public void setBloodGroup(String bloodFroup){
this.bloodGroup=bloodGroup;
}
public String getBloodGroup(){
return bloodGroup;
}
public void setAge(int age){
this.age=age;
}
public int getAge(){
returnn age;
}
public char getGender(char gender){
this.gender=gender;
}
public char getGender(){
return gender;
}



public String toString(){

  return"PatientDTO-[patientId="this.patientId+",patientName="this.patientName+",contactNo="+this.contactNo+",address="+this.address+",bloodGroup="+this.bloodGroup+",age="+this.age+",gender="+this.gender+"]";
  }
  }