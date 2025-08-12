public class DoOp {
    public static String operate(String[] args) {
        if (args.length == 3) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]);
            return switch (args[1]) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        yield "Error";
                    }
                    yield num1 / num2;
                }
                case "%" -> {
                    if (num2 == 0) {
                        yield "Error";
                    }
                    yield num1 % num2;
                }
                default -> "Error";
            } + "";

        } else {
            return "Error";
        }

    }
}