package gun3_odev2;

public class Main {

	public static void main(String[] args) {
		User user1=new User();
		user1.firstName="�brahim";
		user1.lastName="M�ezzino�lu";
		user1.mailAdres="muezzinogluibrahim@gmail.com";
		user1.kursName="Java/React";
		
		User user2=new User();
		user2.firstName="Ali";
		user2.lastName="Y�lmaz";
		user2.mailAdres="y�lmazal�@gmail.com";
		user2.kursName="C#/Angular";
		
		User user3=new User();
		user3.firstName="Hasan";
		user3.lastName="Kald�r�m";
		user3.mailAdres="kald�r�mhasan@gmail.com";
		user3.kursName="JavaScript";
		
		Instructor �nstructor=new Instructor();
		�nstructor.firstName="Engin Demiro�";
		�nstructor.kursName="Java/React";
		�nstructor.gunDers="3.g�n";
		�nstructor.odevVer="2. �dev";
		
		UserManager userManager= new UserManager();
		User[] users= {user1,user2,user3};	
		for (User user :users ) {
			userManager.addStudent(user);
		}
		
		System.out.println("----E�itmen ��lemleri--------");
		InstructorManager �nstructorManager=new InstructorManager();
		�nstructorManager.addLesson1(�nstructor);
		�nstructorManager.addQu�z(�nstructor);;
		
		System.out.println("----��renci ��lemleri--------");
		StudentManager studentManager=new StudentManager();
		studentManager.studentProfil(user1);
		studentManager.cancelStudent(user2);
		studentManager.addSend(new Student());
		studentManager.addF�n�sh(new Student());
		studentManager.addStudent(user3);
		

	}

}
