class DrivingLicenseUtil{
public static void main(String a[]){

DrivingLicenseDTO dl = new DrivingLicenseDTO();
dl.setName("Vinayak Sulibhavi");
dl.setId(426);
dl.setAge(20);
dl.setIsValid(true);

System.out.println(dl.getName()+ " "+dl.getId()+ " "+dl.getAge()+ " "+dl.getIsValid());
}
}
