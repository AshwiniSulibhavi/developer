class Pillow{

private static Pillow pillow;

public static Pillow getPillow(){

return pillow;
}



static {

pillow = new Pillow();
}

}