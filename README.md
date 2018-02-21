# JavaSuper
superを使って親クラスのメンバ変数を変える

## 処理
superを使って、JewelryBoxクラスから親クラスのコンストラクタの変数を変えて出力。

## コード
```
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
```

## 出力結果  
```
宝箱を開いた。鋼鉄の剣を手に入れた。
宝箱はキラキラと輝いている
宝箱を開いた。魔法の指輪を手に入れた。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
