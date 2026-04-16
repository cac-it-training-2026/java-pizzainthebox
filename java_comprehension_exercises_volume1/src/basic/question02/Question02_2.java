package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**1. 「商品の名前と値段を入力してください。」とコンソールに標準出力する
商品の名前と値段を入力してください。
2. 標準入力として値を入力し、String 型の変数[itemName]に代入する。
➢ 入力値：ノートパソコン
3. 標準入力として値を入力し、int 型の変数[itemPrice]に代入する。
➢ 入力値：29800
➢ 入力値を数値に変換し、[itemPrice]に代入する。
4. [itemName]、[itemPrice]の順番で値を次のとおりコンソールに標準出力する。
商品の名前はノートパソコンです。
商品の値段は 29800 円です
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("商品の名前と値段を入力してください。");
		System.out.println("商品の名前");

		String itemName = reader.readLine();

		System.out.println("商品の値段");

		String itemPrice = reader.readLine();

		System.out.println("商品の名前は" + itemName + "です。");
		System.out.println("商品の名前は" + itemPrice + "です。");

		// TODO:ここに実装

	}
}
