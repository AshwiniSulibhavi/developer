class CameraTester{

public static void main(String args[]){
Camera camera=new Camera();

camera.name="canon";
camera.price=40000;

System.out.println(camera.name+" "+camera.price);
camera.click();


Camera camera1=new Camera();

camera1.name="Nikon";
camera1.price=60000;

System.out.println(camera1.name+" "+camera1.price);
camera1.click();



Camera camera2=new Camera();

camera2.name="Sony";
camera2.price=70000;

System.out.println(camera2.name+" "+camera2.price);
camera2.click();

}
}