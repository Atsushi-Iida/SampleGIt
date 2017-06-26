import java.util.ArrayList;
import java.util.List;

public class Hoge {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		list.forEach(System.out::println);
		list.stream().filter(obj -> "a".equals(obj) || "c".equals(obj)).map(obj -> obj + "Room.").forEach(System.out::println);

	}
}
