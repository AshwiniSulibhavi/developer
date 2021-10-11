class Bag{


private static Bag bag=null;

public static Bag getBag(){

return bag;
}

static{

bag=new Bag();

}
}

