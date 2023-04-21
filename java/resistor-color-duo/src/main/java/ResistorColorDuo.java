class ResistorColorDuo {
    int value(String[] colors) {
                 String values = "";
        for (int i = 0; i < 2; i++) {
            values += colorCode(colors[i]);
        }
        return Integer.parseInt(values);
    }

    public int colorCode(String color){
        int number = 0;
        switch (color) {
            case "black" -> {
                number = 0;
            }
            case "brown" -> {
                number = 1;
            }
            case "red" -> {
                number = 2;
            }
            case "orange" -> {
                number = 3;
            }
            case "yellow" -> {
                number = 4;
            }
            case "green" -> {
                number = 5;
            }
            case "blue" -> {
                number = 6;
            }
            case "violet" -> {
                number = 7;
            }
            case "grey" -> {
                number = 8;
            }
            case "white" -> {
                number = 9;
            }
        }
        return number;
    }
}
