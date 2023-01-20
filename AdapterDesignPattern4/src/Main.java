public class Main {
    public static void main(String[] args) {
        IIO io = new BatchAdapter();
        io.createFolder("c:");
        io = new BufferIO();
        io.createFolder("d:/");
    }
}