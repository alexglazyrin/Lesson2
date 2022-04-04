public class MyArrayDataException1 extends Exception {

    public int i;
    public int j;

    MyArrayDataException1(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
