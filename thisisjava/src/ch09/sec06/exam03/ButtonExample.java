package ch09.sec06.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		}
		
		//OK 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener());
		
		//OK 버튼 클릭하기
		btnOk.click();
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		//Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());
		
		//Cancel 버튼 클릭하기
		btnCancel.click();
		
		
	}
}
