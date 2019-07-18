public class Prime {
	
	public static void listPrime1() {
		for (int n = 2; n <= 100; n++) { // 2�`100�̑S�Ă̐��ɂ��Ċm�F���� 
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
		System.out.println(); // ���s
	}
	
	public static void listPrime2() {
		for (int n = 2; n <= 100; n++) { // 2�`100�̑S�Ă̐��ɂ��Ċm�F���� 
			if(n%2==0 && n!=2) continue;	// 2�ȊO�̋���������

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
		System.out.println(); // ���s
	}
	
	public static void main(String[] args) {
		listPrime1();
		listPrime2();
    }
}
