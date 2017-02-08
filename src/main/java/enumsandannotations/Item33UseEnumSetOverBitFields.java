package enumsandannotations;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Item33UseEnumSetOverBitFields {

	public enum Style {
		BOLD("1"), ITALIC("2"), UNDERLINE("3"), STRIKETHROUGH("4");

		private final String value;

		Style(String value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {

		Set<Style> enumSet = EnumSet.of(Style.BOLD);
		Style.values();
		System.out.println(Style.valueOf("BOLD"));
		System.out.println(" Ordinal - " + Style.BOLD.ordinal());
		Collections.unmodifiableSet(new HashSet());
	}
}
