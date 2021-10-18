package ex01;

public class ThreadTest {
//지역 이너 클래스(로칼클래스-메소드 안의 이너클래스)

void someMethod() {
class D{
D(){};// 기본생성자
int age;
String name;
void dispInfo() {
System.out.println(age+"세인 "+name);
}
}
D d = new D();
d.age = 18;
d.name ="순이";
d.dispInfo();
class MyThread extends Thread{
@Override
public void run() {
for(char i='a';i<='z';i++) {
System.out.println(i);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
}
}
}// 로컬클래스 end 
MyThread thread = new MyThread();
thread.start();

new Thread() {
@Override
public void run() {
for(char i='A';i<='Z';i++) {
System.out.println(i);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
}
}
}.start();


}

public static void main(String[] args) {
new ThreadTest().someMethod();
}

}