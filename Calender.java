class Calender{

private static Calender calender;

public static Calender getCalender(){

return calender;
}

static{
calender= new Calender();
}
}