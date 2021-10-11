class Duster{

private static Duster duster=null;//Single Ton 

public static Duster  getDuster(){

return duster;
}

static{

duster=new Duster();




}

}
