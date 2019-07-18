public class Prime {
	
	public static void listPrime1() {
		for (int n = 2; n <= 100; n++) { // 2～100の全ての数について確認する 
			int flg = 1;
			for(int i=2;i<n;i++){
				if(n%i==0){
					flg = 0;
					break;
				}
			}

			if(flg == 1){
				System.out.print(n + ", ");
			}
		}
		System.out.println(); // 改行
	}
	
	public static void listPrime2() {
		for (int n = 2; n <= 100; n++) { // 2～100の全ての数について確認する 
			if(n%2==0 && n!=2) continue;	// 2以外の偶数を除く

			int flg = 1;
			for(int i=2;i<=Math.sqrt(n);i++){
				if(n%i==0){
					flg = 0;
					break;
				}
			}

			if(flg == 1){
				System.out.print(n + ", ");
			}
		}
		System.out.println(); // 改行
	}
	
	public static void main(String[] args) {
		listPrime1();
		listPrime2();
    }
}
