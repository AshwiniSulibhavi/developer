class Mask{

private static Mask mask;

public static Mask getMask(){

return mask;
}



static {

mask= new Mask();
}

}