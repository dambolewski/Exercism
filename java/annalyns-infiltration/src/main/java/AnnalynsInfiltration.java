class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent && !knightIsAwake && !archerIsAwake && !prisonerIsAwake) {
            return true;
        } else if (prisonerIsAwake && petDogIsPresent && !archerIsAwake) {
            return true;
        } else if (knightIsAwake && !archerIsAwake && !prisonerIsAwake && petDogIsPresent){
            return true;
        } else return !knightIsAwake && !archerIsAwake && prisonerIsAwake;
    }
}
