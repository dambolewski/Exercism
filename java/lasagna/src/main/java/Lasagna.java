public class Lasagna {
    public static int expectedMinutesInOven(){
        return 40;
    }

    public static int remainingMinutesInOven(int n){
        return expectedMinutesInOven()-n;
    }

    public static int preparationTimeInMinutes(int n){
        return n*2;
    }

    public static int totalTimeInMinutes(int n, int m){
        return preparationTimeInMinutes(n)+m;
    }
}
