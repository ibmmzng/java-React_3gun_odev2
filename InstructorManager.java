package gun3_odev2;

public class InstructorManager {
	public void addLesson1(Instructor �nstructor) {
		System.out.println(�nstructor.getJava());
	}
	public void addLesson2(Instructor �nstructor) {
		System.out.println(�nstructor.getcAngular());
	}
	public void addLesson3(Instructor �nstructor) {
		System.out.println(�nstructor.getJavaScript());
	}
	public void addWork(Instructor �nstructor) {
		System.out.println(�nstructor.gunDers+" "+�nstructor.odevVer+" �devi verildi.");
	}
	public void addQu�z(Instructor �nstructor) {
		System.out.println(�nstructor.gunDers+" "+�nstructor.odevVer+" quiz �devi verildi.");
	}
}
