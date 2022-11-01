public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 96;
        int height = 207;
        int bmi =  weight / (height * height);;
        System.out.println(bmi);
        System.out.println(weight);
        System.out.println(height);
    }
}
