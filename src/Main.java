public class Main {
    public static void main(String[] args) {

        WeatherAPI x = new WeatherAPI();
        GUI y = new GUI(x);
        y.createWindow();
        y.setUpButton();
        y.greenBackground();

    }
}
