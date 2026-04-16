package basic.question04;

import java.io.IOException;

/**1. int 型の配列変数[ageGroup]を宣言する。
➢ 要素数：5
2. [ageGroup]の要素に、次の 5 つの数値を順番に代入する。
➢ 12、18、24、19、20
3. 次の通り配列変数の要素の 3 番目の値をコンソールに標準出力する。
3 番目の人の年齢は[ageGroup の 3 番目の要素の値]歳です。

 * 第7章 配列
 */

public class Question04_1 {

	public static void main(String[] args) throws IOException {

		int[] ageGroup = { 12, 18, 24, 19, 20 };

		System.out.println("3番目の人の年齢は" + ageGroup[2] + "です。");

		// TODO:ここに実装

	}

}
