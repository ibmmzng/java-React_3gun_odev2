package gun3_odev2;

public class InstructorManager {
	public void addLesson1(Instructor ýnstructor) {
		System.out.println(ýnstructor.getJava());
	}
	public void addLesson2(Instructor ýnstructor) {
		System.out.println(ýnstructor.getcAngular());
	}
	public void addLesson3(Instructor ýnstructor) {
		System.out.println(ýnstructor.getJavaScript());
	}
	public void addWork(Instructor ýnstructor) {
		System.out.println(ýnstructor.gunDers+" "+ýnstructor.odevVer+" ödevi verildi.");
	}
	public void addQuýz(Instructor ýnstructor) {
		System.out.println(ýnstructor.gunDers+" "+ýnstructor.odevVer+" quiz ödevi verildi.");
	}
}
