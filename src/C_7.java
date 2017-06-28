
public class C<T> {
	C() {
	}

	C(T t) {
	}

	C(C<T> c) {
	}

	static <U> C<U> m(C<U> c) {
		return c;
	}

	public static void main(String[] args) {
		C<String> c =
			m(new C<>(
				m(new C<>(
					m(new C<>(
						m(new C<>(
							m(new C<>(
								m(new C<>(
									m(new C<>(
									))
								))
							))
						))
					))
				))
			));
	}
}
