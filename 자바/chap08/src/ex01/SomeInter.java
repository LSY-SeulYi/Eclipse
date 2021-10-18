package ex01;
// 계산기 만들때에 사용하는 인터페이스
public interface SomeInter<T> {
	int add(int a, int b);
	int sub(int a, int b);
	T add(T a, T b);
	T sub(T a, T b);
	T mul(T a, T b);
	T div(T a, T b);
}
