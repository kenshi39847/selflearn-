package to.msn.wings.selflearn.chap09.enumtype;

public enum Season {
	/*
	SPRING,
	SUMMER,
	AUTUMN,
	WINTER,
	*/
	
	// 列挙定数によるコンストラクターの呼び出し
	SPRING(0, "春") {
	    @Override
	    public void show() {
	      System.out.println("春はあけぼの");
	    }
	},
	SUMMER(1, "夏") {
	    @Override
	    public void show() {
	      System.out.println("夏は夜");
	    }
	},
	AUTUMN(2, "秋") {
	    @Override
	    public void show() {
	      System.out.println("秋は夕暮れ");
	    }
	},
	WINTER(4, "冬") {
	    @Override
	    public void show() {
	      System.out.println("冬はつとめて");
	    }
	};

	// フィールド宣言
	private int code;
	private String jpName;

	// コンストラクターの定義
	private Season(int code, String jpName) {
	    this.code = code;
	    this.jpName = jpName;
	}

	// メソッドの定義
	public int toSeasonValue() {
	    return this.code;
	}

	@Override
	public String toString() {
	    return this.jpName;
	}

	// 列挙定数が実装すべき機能（抽象メソッド）
	public abstract void show();
}