class Tablet{

private static Tablet tablet;

public static Tablet getTablet(){

return tablet;
}

static{

 tablet = new Tablet();
 }
}