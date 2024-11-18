public class WeatherTemperature {

    public static void main(String[] args) {
        // Step 1: Define a matrix (2D array) to store temperature data for 3 cities and 7 days
        // Each row represents a city, each column represents a day of the week (Monday to Sunday)
        int[][] temperatureMatrix = {
            {21, 23, 25, 28, 30, 29, 27},  // Temperatures for City 1 (Day 1 to Day 7)
            {18, 20, 22, 21, 23, 24, 25},  // Temperatures for City 2
            {15, 17, 19, 20, 21, 22, 23}   // Temperatures for City 3
        };
        
        // Step 2: Calculate and print the average temperature for each city
        for (int i = 0; i < temperatureMatrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < temperatureMatrix[i].length; j++) {
                sum += temperatureMatrix[i][j];
            }
            double averageTemperature = sum / 7.0;  // Dividing by 7 for average
            System.out.println("City " + (i + 1) + " Average Temperature: " + averageTemperature + "°C");
        }

        // Step 3: Find and print the highest temperature recorded for each city
        for (int i = 0; i < temperatureMatrix.length; i++) {
            int maxTemperature = temperatureMatrix[i][0];  // Assume the first day's temperature is the highest initially
            for (int j = 1; j < temperatureMatrix[i].length; j++) {
                if (temperatureMatrix[i][j] > maxTemperature) {
                    maxTemperature = temperatureMatrix[i][j];
                }
            }
            System.out.println("City " + (i + 1) + " Highest Temperature: " + maxTemperature + "°C");
        }
    }
}
