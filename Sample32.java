/**
 *
 * @author xekid78
 *
 */
public class Sample32 {

	public static void main(String[] args) {
		Box1 box = new Box1("鋼鉄の剣");
		box.open();

		JewelryBox1 jewelrybox = new JewelryBox1("魔法の指輪");
		jewelrybox.look();
		jewelrybox.open();

	}

}

class Box1 {
	public String myItem;

	public Box1(String item) {
		myItem = item;
	}

	public void open() {
		System.out.println("宝箱を開いた。" + myItem + "を手に入れた。");
	}
}

class JewelryBox1 extends Box1 {
	public JewelryBox1(String item) {
		super(item);
	}

	public void look() {
		System.out.println("宝箱はキラキラと輝いている");
	}
}
