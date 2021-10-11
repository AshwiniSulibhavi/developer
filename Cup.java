class Cup{
private static Cup cup;
public static Cup getCup(){

return cup;
}
static {
 cup = new Cup();
}
}