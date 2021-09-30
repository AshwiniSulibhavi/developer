class LibraryUtil{


public static void main(String a[]){

LibraryDTO lib = new LibraryDTO();

lib.setLibraryName("Ashokapuram Libraries");
lib.setNoOfBooks(100000);
lib.setPlace("Marappa complex,8th cross road Palya Ward Yeshwanthpur Banglore");
lib.setType("central");
lib.setIsOpen(true);
lib.setTimmings("8:30am-5pm");


System.out.println(lib.getLibraryName()+"     "+lib.getNoOfBooks()+"     "+lib.getPlace()+"      "+lib.getType()+"     "+lib.getIsOpen()+"     "+lib.getTimmings());
}
}