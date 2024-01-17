package DataType.ownDataType;

public class Cat {
int legs=4;
int eyes=2;
String color="white";
String breed="italian odd eye";
}
class PersianCat{
	int legs=4;
	int eyes=2;
	String color="white and orange";
	String breed="persian ";
	boolean isoddeye=false;
	public void cat_things(){
		System.out.println("food is fish");
		System.out.println("plays");
		}
	public static void main(String args[]) {
		PersianCat pc =new PersianCat();
		Cat cc=new Cat();
		System.out.println("Persian Cat\n");
		System.out.println(pc.legs);
		System.out.println(pc.eyes);
		System.out.println(pc.color);
		System.out.println(pc.breed);
		System.out.println(pc.isoddeye);
		pc.cat_things();
		System.out.println("\nItalian Cat\n");
		System.out.println(cc.legs);
		System.out.println(cc.eyes);
		System.out.println(cc.color);
		System.out.println(cc.breed);
	}
}