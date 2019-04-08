// 数値入力
Scanner sc = new Scanner(System.in);
int n = Integer.parseInt(sc.next());
sc.close();


// 配列入力
Scanner sc = new Scanner(System.in);
int n = Integer.parseInt(sc.next());
int[] a = new int[n];

for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt();
}
