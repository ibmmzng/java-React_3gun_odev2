package gun3_odev2;

public class Instructor extends User {
	String java="Java/React kursu ba�lad�.";
	String cAngular="C#/Angular kursu ba�lad�.";
	String javaScript="JavaScript kursu ba�lad�.";
	String gunDers;
	String odevVer;
	public String getJava() {
		return java;
	}
	public String getcAngular() {
		return cAngular;
	}
	public String getJavaScript() {
		return javaScript;
	}
	public void setGunDers(String gunDers) {
		this.gunDers = gunDers;
	}
	public void setOdevVer(String odevVer) {
		this.odevVer = odevVer;
	}

	
}
