class ProjectUtil{
public static void main(String a[]){

ProjectDTO pro = new ProjectDTO();
pro.setName("Blind Assistance for Visually Impaired Using Raspberry Pie");
pro.setNoOfMembers(4);
pro.setId(2080);
pro.setGuideName("prof.Vinay Shetter");
pro.setIsCompleted(true);

System.out.println(pro.getName()+ "     "+pro.getNoOfMembers()+ "     "+pro.getId()+ "     "+pro.getGuideName()+ "       "+pro.getIsCompleted());
}
}