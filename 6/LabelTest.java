class LabelTest {
	public static void main(String[] args) {
		Label.common = "�}";
		Label l1 = new Label("�l���̔�r");
		Label l2 = new Label("���Y�ʂ̌X��");
		l1.output();
		l2.output();
		Label.common = "�\";
		l1.output();
		l2.output();
	}

}
