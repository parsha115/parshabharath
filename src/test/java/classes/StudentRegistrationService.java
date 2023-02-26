package classes;

public class StudentRegistrationService {
   public void register(Student1 st) {
	   System.out.println(st.getStudentId());
	   System.out.println(st.getStudentName());
   }
   public void save(Product1 pr) {
	   System.out.println(pr.getPid());
	   System.out.println(pr.getPname());
   }
   public void foo(int x) {
	   System.out.println(x);
   }
}
