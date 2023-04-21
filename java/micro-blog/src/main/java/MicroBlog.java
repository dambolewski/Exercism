class MicroBlog {
    public String truncate(String input) {
        StringBuilder builder = new StringBuilder();
        input.codePoints().limit(5).forEach(builder::appendCodePoint);
        return builder.toString();
        }
}
