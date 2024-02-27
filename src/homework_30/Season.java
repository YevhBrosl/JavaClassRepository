package homework_30;

//Реализуйте Enum для определения четырех времен года с методами,
//возвращающими среднюю температуру для каждого времени года.

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;
private int[] temperatures;

    private double getAverageTemperature(int[] temperatures) {
        double average = 0;
        int sum =0;
        for (int i = 0; i < temperatures.length; i++) {
            sum = sum + temperatures[i];
        }
        average = (double) sum / temperatures.length;
        return average;
    }

    public static void main(String[] args) {

        Season season = Season.WINTER;
        int[] temperatures = {0, -3, -5, -4, -7, -9, -3, -1, 2, 5, 1, -6};
        System.out.println(season.getAverageTemperature(temperatures));

    }





}
