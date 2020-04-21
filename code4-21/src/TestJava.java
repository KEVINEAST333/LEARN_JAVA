public class TestJava {
    public static void main(String[] args) {
        /*int[] array = new int[10];
        int[] array2 = new int[]{1,2,3};
        int[] array3 = {1,2,3}; */
        Dog[] pets = new Dog[7];
        for(int i = 0;i < pets.length;i++) {
            pets[i] = new Dog();
        }
        pets[5].age = 10;
        pets[5].sex = "man";
        System.out.println(pets[5].toString());
        System.out.println(pets[4].toString());
    }
}
