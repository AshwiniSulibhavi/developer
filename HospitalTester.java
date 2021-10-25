import java.util.*;

class HospitalTester{
public static void main(String a[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the size");
int size=sc.nextInt();

Hospital hospital=new Hospital(size);

for (int i=0;i<size;i++){

PatientDTO dto= new PatientDTO();

System.out.println("Enter the patient details");

System.out.println("Enter the patient id");

int patientId= sc.nextInt();

System.out.println("Enter the patient Name");

String patientName= sc.next();


System.out.println("Enter the patient age");

int patientAge=sc.nextInt();


dto.setPatientId(patientId);
dto.setPatientName(patientName);

boolean isAdded=hospital.createPatientDetails(dto);
System.out.println("patientAdded:"+isAdded);

hospital.getAllPatients();
}
	}
}

