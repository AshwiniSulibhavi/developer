public class LibraryDTO{

public LibraryDTO(){
System.out.println("Library object is created ");
}

private String libraryName;
private int noOfBooks;
private String place;
private String type;
private boolean isOpen;
private String timmings;


public String getLibraryName(){
return libraryName;
}

public void setLibraryName(String libraryName){
this.libraryName=libraryName;
}

public int getNoOfBooks(){
return noOfBooks;
}

public void setNoOfBooks(int noOfBooks){
this.noOfBooks=noOfBooks;
}

public String getPlace(){
return place;
}
public void setPlace(String place){
this.place=place;
}

public String getType(){
return type;
}
public void setType(String type){
this.type=type;
}

public boolean getIsOpen(){
return isOpen;
}
public void setIsOpen(boolean isOpen){
this.isOpen=isOpen;
}
public String getTimmings(){
return timmings;
}
public void setTimmings(String timmings){
this.timmings=timmings;
}
}


 
