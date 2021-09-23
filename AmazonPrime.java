class AmazonPrime{

static String movies[]={"Shershah","Cindrella","RakthaChaitra","JathiRathnalu","Robert","KGF","Conjuring","QuitePlace","yuvarathna"};
static String Series[]={"Mirjapur","The Family Man","Light out","money Heist","Four more shots","Vampire Diaries","Master","The last Ship","inside edge"};

static String movie="Dia";
public static void main(String a[]){
getMovies(movies);
String movie= getMovies(movie);
System.out.println(movie);


}
public static void getMovies(String[] movies){
System.out.println("inside get movies method with string array parameter");							
for(int i=0;i<movies.length;i++){
System.out.println(movies[i]);
}
}
public static void getMovies(String movie){
System.out.println("inside getMovies method");
return movie;
}
}