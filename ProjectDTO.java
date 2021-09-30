public class ProjectDTO{
 
 public ProjectDTO(){
 System.out.println("ProjectDTO object is created");
 }
 
 private String name;
 private int noOfMembers;
 private int id;
 private String guideName;
 private boolean isCompleted;
 
 public String getName(){
 return name;
 }
 public void setName(String name){
 this.name = name;
 }
 public int getNoOfMembers(){
 return noOfMembers;
 }
 public void setNoOfMembers(int noOfMembers){
 this.noOfMembers = noOfMembers;
 }
 public int getId(){
 return id;
 }
 public void setId(int id){
 this.id = id;
 }
 public String getGuideName(){
 return guideName;
 }
 public void setGuideName(String guideName){
 this.guideName = guideName;
 }
 public boolean getIsCompleted(){
 return isCompleted;
 }
 public void setIsCompleted(boolean isCompleted){
 this.isCompleted = isCompleted;
 }
 
}
