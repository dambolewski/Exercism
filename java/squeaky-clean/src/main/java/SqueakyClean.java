import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replaceAll(" ", "_").replaceAll("[\\p{Cntrl}]", "CTRL")
                .replaceAll("[0-9]|[\\x{0001f300}-\\x{0001f64f}]|[\\u03B1-\\u03C9]", "");

        Matcher matcher = Pattern.compile("-(\\D)").matcher(identifier);
        if (matcher.find()) identifier = matcher.replaceAll(matcher.group(1).toUpperCase());
        return identifier;
        }
}
