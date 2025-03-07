package oop.inherit3;

public class Test02 {
	public static void main(String[] args) {
		Browser b1 = new Chrome("105.0.5");
		b1.move();
		b1.refresh();
		b1.info();
		//b1.chromeStore();
		
		Browser b2 = new Firefox("24");
		b2.move();
		b2.refresh();
		b2.info();
		//b2.firefoxAddon();
		
		Browser b3 = new Edge("35.2.4");
		b3.move();
		b3.refresh();
		b3.info();
		//b3.edgeAppCenter();
		
		Browser b4 = new Safari("1.5.9");
		b4.move();
		b4.refresh();
		b4.info();
		//b4.safariExtension();
	}
}
