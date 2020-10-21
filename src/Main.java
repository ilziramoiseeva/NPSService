public class Main {
    public static void main(String[] args) {
        NPSService service = new NPSService();

        System.out.println(service.nps(new int[]{1, 2, 3, 4,7,10,9,1,8,10,11}));
    }
}
