public class HighestAltitude {

    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};

        int result = largestAltitude(gain);

        System.out.println("Highest Altitude = " + result);
    }

    static int largestAltitude(int[] gain) {

        int altitude = 0;
        int highest = 0;

        for (int i = 0; i < gain.length; i++) {

            altitude = altitude + gain[i];

            if (altitude > highest) {
                highest = altitude;
            }
        }

        return highest;
    }
}