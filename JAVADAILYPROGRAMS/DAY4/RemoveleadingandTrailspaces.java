package DAY4;

public class RemoveleadingandTrailspaces {
    public static void main(String[] args) {
        String input = "        Hello and Welcome Arun !!   ";

        // Prints the original input with leading and trailing spaces
        System.out.println("Original: '" + input + "");

        // Removes both leading and trailing whitespaces
        System.out.println("trim(): '" + input.trim() + "");

        // Removes both leading and trailing spaces/tabs using regex
        System.out.println("Regex both trim: '" + input.replaceAll("^[ \t]+|[ \t]+$", "") + "");

        // Removes only leading spaces/tabs
        System.out.println("Regex leading trim: '" + input.replaceAll("^[ \t]+", "") + "");

        // Removes only trailing spaces/tabs
        System.out.println("Regex trailing trim: '" + input.replaceAll("[ \t]+$", "") + "");
    }
}

