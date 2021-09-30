public class DrivingLicenseDTO{

public DrivingLicenseDTO(){
System.out.println("DrivingLicenseDTO object is created");
}

private String name;
private int id;
private int age;
private boolean isValid;

public String getName(){
return name;
}
public void setName(String name){
this.name = name;
}
public int getId(){
return id;
}
public void setId(int id){
this.id = id;
}
public int getAge(){
return age;
}
public void setAge(int age){
this.age = age;
}
public boolean getIsValid(){
return isValid;
}
public void setIsValid(boolean isValid){
this.isValid = isValid;
}
}
