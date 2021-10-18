package l02_fundamental;
@FunctionalInterface
public interface NumToString<Number, String> {

	public String change(Number x);
}
