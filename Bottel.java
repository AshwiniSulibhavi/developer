class Bottel{
private static Bottel bottel;

public static Bottel getBottel(){

return bottel;
}

static {

bottel=new Bottel();
}
}