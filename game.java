package Ren;

public class CoinCase {
	public int yen500 = 0;
	public int yen100 = 0;
	public int yen50 = 0;
	public int yen10 = 0;
	public int yen5 = 0;
	public int yen1 = 0;

	public void AddCoin(int shurui , int maisu) {
		switch(shurui){
			case 500:
				yen500+=maisu;
			break;
			case 100:
				yen100+=maisu;
			break;
			case 50:
				yen50+=maisu;
			break;
			case 10:
				yen10+=maisu;
			break;
			case 5:
				yen5+=maisu;
			break;
			case 1:
				yen1+=maisu;
			break;
		}
	}
	public int GetCount(int shurui) {
		switch(shurui) {
			case 500:
				return yen500;
			case 100:
				return yen100;
			case 50:
				return yen50;
			case 10:
				return yen10;
			case 5:
				return yen5;
			case 1:
				return yen1;
		}
		return 0;
	}
	public int GetAmount() {
		return (yen500 * 500) + (yen100 * 100) + (yen50 * 50) +
				(yen10 * 10) + (yen5 * 5) +  yen1;
	}
    system.out.plint("おつおつ");
}
