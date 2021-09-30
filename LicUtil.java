class LicUtil{
public static void main(String a[]){

LicDTO lic = new LicDTO();
lic.setHolderName("Mahantesh");
lic.setPolicyId(8040);
lic.setYears(5);

System.out.println(lic.getHolderName()+ " "+lic.getPolicyId()+ " "+lic.getYears());
}
}