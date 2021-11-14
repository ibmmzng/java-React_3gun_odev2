package gun3_odev2;

public class Main {

	public static void main(String[] args) {
		User user1=new User();
		user1.firstName="Ýbrahim";
		user1.lastName="Müezzinoðlu";
		user1.mailAdres="muezzinogluibrahim@gmail.com";
		user1.kursName="Java/React";
		
		User user2=new User();
		user2.firstName="Ali";
		user2.lastName="Yýlmaz";
		user2.mailAdres="yýlmazalý@gmail.com";
		user2.kursName="C#/Angular";
		
		User user3=new User();
		user3.firstName="Hasan";
		user3.lastName="Kaldýrým";
		user3.mailAdres="kaldýrýmhasan@gmail.com";
		user3.kursName="JavaScript";
		
		Instructor ýnstructor=new Instructor();
		ýnstructor.firstName="Engin Demiroð";
		ýnstructor.kursName="Java/React";
		ýnstructor.gunDers="3.gün";
		ýnstructor.odevVer="2. ödev";
		
		UserManager userManager= new UserManager();
		User[] users= {user1,user2,user3};	
		for (User user :users ) {
			userManager.addStudent(user);
		}
		
		System.out.println("----Eðitmen Ýþlemleri--------");
		InstructorManager ýnstructorManager=new InstructorManager();
		ýnstructorManager.addLesson1(ýnstructor);
		ýnstructorManager.addQuýz(ýnstructor);;
		
		System.out.println("----Öðrenci Ýþlemleri--------");
		StudentManager studentManager=new StudentManager();
		studentManager.studentProfil(user1);
		studentManager.cancelStudent(user2);
		studentManager.addSend(new Student());
		studentManager.addFýnýsh(new Student());
		studentManager.addStudent(user3);
		

	}

}
