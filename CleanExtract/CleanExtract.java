import java.util.Arrays;

public class CleanExtract {
    public static String extract(String s) {
        String[] splited = Arrays.stream(s.split("\\|"))
                .filter(e -> !e.trim().equals(""))
                .map(e -> {
                    if (e.contains(".")) {
                        int first_dot = e.indexOf('.');
                        int last_dot = e.lastIndexOf('.');
                        if (first_dot != last_dot) {
                            return e.substring(first_dot + 1, last_dot).trim();

                        } else {
                            return e.substring(first_dot + 1).trim();
                        }
                    }else{
                        return e;
                    }
                })
                .filter(e -> !e.trim().equals(""))
                .toArray(String[]::new);
        return String.join(" ", splited);
    }
}
