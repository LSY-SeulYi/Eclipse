package ex07;

public class NewInstanceTest {

	public static void main(String[] args) {
		exe("ex07.SendAction");
		exe("ex07.ReceiveAction");
		//-----------------
		new NewInstanceTest().exe2(new SendAction());
		new NewInstanceTest().exe2(new ReceiveAction());
	}
	
	public static void exe(String className) {
		Class clazz = null;
		try {
			clazz = Class.forName(className);
			// Car car = new Car(); //이렇게 할 수 없을 경우 
			Action action = (Action)clazz.newInstance();
			action.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 폴리모피즘 활용
	public void exe2(Action action) {
		action.execute();
	}
	
	

}
