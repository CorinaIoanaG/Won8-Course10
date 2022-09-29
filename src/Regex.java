public class Regex {
    public static void main(String[] args) {
        String text = "Corina merge la mare. me";
        if (text != null) {
            System.out.println(text.replaceAll("m[A-Za-z]+e|me", "*"));
        }
        text = "888.7";
        doubleConvert(text);
        text = "80";
        doubleConvert(text);
        text = "147h";
        doubleConvert(text);
        text = "788.9f";
        doubleConvert(text);
    }

    private static void doubleConvert(String text) {
        if (text.matches("[0-9]+\\.{0,1}[0-9]*") && (text != null)) {
            System.out.println(Double.parseDouble(text));
        } else {
            System.out.println("Not a double. Impossible to convert.");
        }
    }
}
