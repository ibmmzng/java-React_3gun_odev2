package gun3_odev2;

public class StudentManager extends UserManager {
	public void studentProfil(User student) {
		System.out.println("��renci Bilgileri");
		System.out.println(student.firstName+ student.lastName);
		System.out.println(student.mailAdres);
		System.out.println("Ald��� Kurslar: "+student.kursName );
	}
	public void addSend(Student student) {
		System.out.println(student.getAddExplan1());
	}
	public void addF�n�sh(Student student) {
		System.out.println(student.getAddExplan2());
	}
}
