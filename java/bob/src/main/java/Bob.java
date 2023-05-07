public class Bob {

    public String hey(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();

        boolean question = s.endsWith("?");
        boolean yell = s.toUpperCase().equals(s) && !s.toLowerCase().equals(s);
        boolean empty = s.isEmpty();

        if (question) {
            if (yell) {
                sb.append("Calm down, I know what I'm doing!");
            } else
                sb.append("Sure.");
        } else if (yell) {
            sb.append("Whoa, chill out!");

        } else if (empty) {
            sb.append("Fine. Be that way!");
        } else {
            sb.append("Whatever.");
        }
        return sb.toString();
    }
}
