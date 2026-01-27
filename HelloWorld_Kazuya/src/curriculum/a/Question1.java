package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		/* Q1 */
		byte byteNum;   //変数byteNumの初期値を設定
		short shortNum; //変数shortNumの初期値を設定
		int intNum;     //変数intNumの初期値を設定
		long longNum;   //変数longNumの初期値を設定
		float floatNum; //変数floatNumの初期値を設定
		double doubleNum; //変数doubleNumの初期値を設定
		char letter;    //変数letterの初期値を設定
		String letters; //変数lettersの初期値を設定
		boolean isBoolean;//変数isBooleanの初期値を設定

		/* Q2 １で宣言した各型の変数に指定された値を代入 */
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		/* Q3 変数を用いて出力　*/
		System.out.println(longNum + intNum + shortNum + byteNum); //11110を出力
		System.out.println(byteNum * 2); //20を出力s
		System.out.println(letter + letters + isBoolean); //a ハロー trueの出力
		System.out.println(longNum + intNum + shortNum + byteNum + floatNum + doubleNum);//数字を全て足して出力
		System.out.println(longNum * intNum * shortNum * byteNum); //小数点意外の数字をすべてかけて出力 
		System.out.println(doubleNum / shortNum); //10.5割る100をして出力
		System.out.println(byteNum - shortNum); //10引く100をして出力
		
		/* Q4 */
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！"); 
		
		/* Q5 */
		int age = 25;
		System.out.println("年齢: " + age + "歳" ); 
		
		/* Q6 */
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum); //num1とnum2の合計を表示
		
		/* Q7 */
		int score = 80;
		score = score + 20;
		System.out.println("最終スコア: " + score);// 最終スコア100と表示
		
		/* Q8 */
		double price = 99.99;
		int intPrice = (int)price; //doubleからint型に変換
		System.out.println("整数価格: " + intPrice);// 整数価格99と表示
		
		/* Q9 */
		String numStr = "123";
		int intnumStr = Integer.parseInt(numStr); // Stringからint型に変換
		System.out.println("変換後の値: " + intnumStr + 10);// 変換後の値に10を加えたものを表示
		
		/* Q10 */
		int num = 50;
		String strNum = Integer.toString(num); // intからString型に変換
		System.out.println("得点: " + strNum);// 得点: 50点と表示
		
		/* Q11 */
		int a = 10;
		int b = 20;
		boolean result = (a < b); //aがbより小さいかどうかの判定
		System.out.println(result); //resultを表示
		
		/* Q12 */
		int x = 15;
		String sankouenzanshi = x >= 10 ? "OK" : "NG"; //三項演算子を使用して判定
		System.out.println(sankouenzanshi); //条件演算子を使ってOKを表示 
		
		/* Q13 */
		String text = "私はJavaが好きです。Javaは楽しい！";
		System.out.println(text.replace("Java", "Python")); //JavaをPythonに置き換えて表示
	}

}
