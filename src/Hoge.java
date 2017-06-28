import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hoge {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		list.forEach(System.out::println);
		list.stream().filter(obj -> "a".equals(obj) || "c".equals(obj)).map(obj -> obj + "Room.")
				.forEach(System.out::println);

		// Supplierは遅延実行されるので、必要になった段階で実施してほしい重い処理を実行するのに便利？
		Supplier<String> s = () -> "abc";
		System.out.println(s.get());

		Supplier<String> str = ((Supplier<String>) () -> {
			System.out.println("str を初期化します！");
			return "ほげほげ";
		});

		System.out.println(str.get());
		System.out.println(str.get());
		System.out.println(str.get());

		dispTriangle(11);

	}

	private static void dispTriangle(int max) {
		// IntStream.range(0, max).boxed().forEach(i -> {
		// IntStream.range(0, i + 1).boxed().limit(5).map(r ->
		// "*").forEach(System.out::print);
		// System.out.println();
		// });

		// for (int count = 0, starSize = 0; count < max; count++) {
		// starSize = (max / 2 + 1) > count ? starSize + 1 : starSize -1;
		// IntStream.range(0, starSize).boxed().map(i ->
		// "*").forEach(System.out::print);
		// System.out.println();
		// }

		IntStream.rangeClosed(0, max).map(n -> (max + 1) /2 >= n ? n : max - n + 1).mapToObj(n -> IntStream.range(0, n).mapToObj(m -> "*").collect(Collectors.joining())).forEach(System.out::println);





	}
}
