class GoldUtil{


public static void main(String a[]){

GoldDTO gold = new GoldDTO();

gold.setShopName("Sheelvant & sons Jewellery");
gold.setItem("Designer Necklace,Bangles,Ear-rings");
gold.setPrice(200000);
gold.setLocation("Gulledgudd");
gold.setOwnerName("Mahantesh");


System.out.println(gold.getShopName()+"   "+gold.getItem()+"   "+gold.getPrice()+"    "+gold.getLocation()+" "+gold.getOwnerName());
}
}