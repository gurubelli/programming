package enumsandannotations;

public class Item30UseEnums {

}

enum Operation {

	PLUS, MINUS, TIMES, DIVIDE;

	// Do the arithmetic op represented by this constant
	double apply(double x, double y) {
		switch (this) {
		case PLUS:
			return x + y;
		case MINUS:
			return x - y;
		case TIMES:
			return x * y;
		case DIVIDE:
			return x / y;
		}
		throw new AssertionError("Unknown op: " + this); // If this statement
															// does not exist
															// then throws error
	}
}

enum Operation2 {

	PLUS {
		@Override
		double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS {
		@Override
		double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES {
		@Override
		double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE {
		@Override
		double apply(double x, double y) {
			return x / y;
		}
	};
	abstract double apply(double x, double y);
}
