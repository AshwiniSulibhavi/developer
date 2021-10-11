class Cable{


public static Cable cable;
public static  Cable getCable(){

return cable;

}

static {

cable= new Cable();
}
}