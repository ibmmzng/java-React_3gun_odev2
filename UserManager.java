package gun3_odev2;

public class UserManager {
	public void addStudent(User user) {
		System.out.println(user.firstName+" "+user.lastName+" "+user.kursName+" kursuna kay�t oldu.");
	}
	public void cancelStudent(User user){
		System.out.println(user.firstName+" "+user.lastName+" "+user.kursName+" kursundan ayr�ld�n�z.");
	}
	
}
