package gun3_odev2;

public class StudentManager extends UserManager {
	public void studentProfil(User student) {
		System.out.println("Öğrenci Bilgileri");
		System.out.println(student.firstName+ student.lastName);
		System.out.println(student.mailAdres);
		System.out.println("Aldığı Kurslar: "+student.kursName );
	}
	public void addSend(Student student) {
		System.out.println(student.getAddExplan1());
	}
	public void addFınısh(Student student) {
		System.out.println(student.getAddExplan2());
	}
}
