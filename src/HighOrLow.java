import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class HighOrLow {

	static int win = 0;
	//メソッドの呼び出し実行
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ゲームは5回！！");
		System.out.println("GAME_START");
		int win = hantei();
		result(win);
	}
	//ゲーム判定メソッド
	public static int hantei(){
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int dai = 0;
		int dai2 = 0;
		int toi = 0;
		for(int i = 0; i < 5; i++){
			try{
				dai = rd.nextInt(10);
				dai2 = rd.nextInt(10);
				System.out.println(dai);
				System.out.println("↑の数字より大きいですか？小さいですか？");
				System.out.println("大きければ0、小さければ1と打ち込んでください");
				toi = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("0か1の数字を入力してください。");
				System.out.println("終了");
				break;
			}
			if(toi == 0 || toi == 1){
				if(dai > dai2 && toi == 1 || dai < dai2 && toi == 0){
					System.out.println("正解！！");
					win++;
				}
				else{
					System.out.println("不正解ﾃﾞﾃﾞｰﾝ");
				}
			}
			else{
				System.out.println("0か1の数字を入力してください。");
			}
		}
		return win;
	}
	public static void result(int i){
		System.out.println("結果:" + i + "勝");
		switch(i){
		case 0:
			System.out.println("頑張ろう");
			break;
		case 1:
			System.out.println("次こそは半分以上勝とう");
			break;
		case 2:
			System.out.println("もうちょい頑張ろう");
			break;
		case 3:
			System.out.println("まぁまぁかな");
			break;
		case 4:
			System.out.println("あと一勝でハイローマスター！");
			break;
		case 5:
			System.out.println("あなたが神");
			break;
		}
	}

}
