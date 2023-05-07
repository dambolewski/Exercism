public class BeerSong {

    public String sing(int start, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i >= start - count + 1; i--) {
            if (i > 2) {
                result.append(i).append(" bottles of beer on the wall, ").append(i).append(" bottles of beer.\n").append("Take one down and pass it around, ").append(i - 1).append(" bottles of beer on the wall.\n\n");
            } else if (i == 2) {
                result.append(i).append(" bottles of beer on the wall, ").append(i).append(" bottles of beer.\n").append("Take one down and pass it around, ").append(i - 1).append(" bottle of beer on the wall.\n\n");
            } else if (i == 1) {
                result.append(i).append(" bottle of beer on the wall, ").append(i).append(" bottle of beer.\n").append("Take it down and pass it around, no more bottles of beer on the wall.\n\n");
            } else {
                result.append("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n\n");
            }
        }
        return result.toString();
    }

    public String singSong() {
        StringBuilder result = new StringBuilder();
        for (int i = 99; i >= 1; i--) {
            if (i > 2) {
                result.append(i).append(" bottles of beer on the wall, ").append(i).append(" bottles of beer.\n").append("Take one down and pass it around, ").append(i - 1).append(" bottles of beer on the wall.\n\n");
            } else if (i == 2) {
                result.append(i).append(" bottles of beer on the wall, ").append(i).append(" bottles of beer.\n").append("Take one down and pass it around, ").append(i - 1).append(" bottle of beer on the wall.\n\n");
            } else {
                result.append("1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n\n");
            }
        }
        result.append("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n\n");
        return result.toString();
    }
}