public class TestDrive {
    public static void main(String[] args) {
        try {
            int [] array = null;
            System.out.println(array.length);

        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("ssssss");
    }

}
