class ExceptionExam {
	
	public static void main(String[] args) {
		int[] array = new int[3];
		for(int i = 0; i < 4; i++){
			try{
				array[i] = 0;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("��O��: " + e);
			}
		}
		System.out.println("�v���O�������I�����܂��B");
	}
	
}
