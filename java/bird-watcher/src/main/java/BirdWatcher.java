
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length != 0)
            return birdsPerDay[birdsPerDay.length - 1];
        else return 0;
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length != 0) {
            for (int i = 0; i < 1; i++) {
                birdsPerDay[birdsPerDay.length - 1] += 1;
            }
        }
    }

    public boolean hasDayWithoutBirds() {
        boolean without = false;
        for(int i : birdsPerDay) {
            if (i == 0) {
                without = true;
                break;
            }
        }
        return without;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays>7){
            numberOfDays = 7;
        }
        if(birdsPerDay.length != 0){
            int sum = 0;
            for (int i = 0; i < numberOfDays; i++) {
                sum += birdsPerDay[i];
            }
            return sum;
        } else return 0;
    }

    public int getBusyDays() {
        int sum = 0;
        for(int i : birdsPerDay){
            if(i >= 5){
                sum++;
            }
        }
        return sum;
    }
}
