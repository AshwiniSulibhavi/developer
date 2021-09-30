public class LicDTO{

public LicDTO(){
System.out.println("LicDTO object is created");
}

private String holderName;
private int policyId;
private int years;

public String getHolderName(){
return holderName;
}
public void setHolderName(String holderName){
this.holderName = holderName;
}
public int getPolicyId(){
return policyId;
}
public void setPolicyId(int policyId){
this.policyId = policyId;
}
public int getYears(){
return years;
}
public void setYears(int years){
this.years = years;
}
}
