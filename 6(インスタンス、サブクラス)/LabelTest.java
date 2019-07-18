class LabelTest {
	public static void main(String[] args) {
		Label.common = "}";
		Label l1 = new Label("lŒû‚Ì”äŠr");
		Label l2 = new Label("¶Y—Ê‚ÌŒXŒü");
		l1.output();
		l2.output();
		Label.common = "•\";
		l1.output();
		l2.output();
	}

}
