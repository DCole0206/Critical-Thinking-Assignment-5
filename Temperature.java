public class Temperature {
    public static void main(String[] args) {
        // Array to store daily temperatures
        double[] temperatures = {72.5, 75.0, 68.8, 70.2, 73.4, 78.1, 71.6};

        // Display all temperatures
        System.out.print("Daily Temperatures: ");
        for (double temp : temperatures) {
            System.out.print(temp + " ");
        }
        System.out.println();

        // Calculate the average temperature
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        double average = sum / temperatures.length;
        System.out.println("Average Temperature: " + Math.round(average * 100.0) / 100.0);

        // Find the highest and lowest temperatures
        double highest = temperatures[0];
        double lowest = temperatures[0];
        for (double temp : temperatures) {
            if (temp > highest) {
                highest = temp;
            }
            if (temp < lowest) {
                lowest = temp;
            }
        }
        System.out.println("Highest Temperature: " + highest);
        System.out.println("Lowest Temperature: " + lowest);
    }
}
