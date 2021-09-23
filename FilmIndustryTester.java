class FilmIndustryTester{

public static void main(String args[]){

FilmIndustry  filmIndustry=new FilmIndustry();

filmIndustry.name="KGF";
filmIndustry.heroName="Rocking Star Yash";
filmIndustry.heroineName="Srinidhi Shetty";

System.out.println(filmIndustry.name+" "+filmIndustry.heroName+" "+filmIndustry.heroineName);

filmIndustry.watch();


FilmIndustry  filmIndustry1=new FilmIndustry();

filmIndustry1.name="Yuvarathnaa";
filmIndustry1.heroName="Puneeth Rajkumar";
filmIndustry1.heroineName="Sayyeshaa";

System.out.println(filmIndustry1.name+" "+filmIndustry1.heroName+" "+filmIndustry1.heroineName);

filmIndustry1.watch();



FilmIndustry  filmIndustry2=new FilmIndustry();

filmIndustry2.name="Inspector Vikram";
filmIndustry2.heroName="Prajwal Devaraj";
filmIndustry2.heroineName="Bhavana";

System.out.println(filmIndustry2.name+" "+filmIndustry2.heroName+" "+filmIndustry2.heroineName);

filmIndustry2.watch();

}
}
