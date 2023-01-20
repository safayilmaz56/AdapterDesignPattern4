public class BufferIO implements IIO{
    @Override
    public void createTextFile(String path) {
        System.out.println("create text file with bufferıo:" + path);
    }

    @Override
    public void createFolder(String path) {
        System.out.println("create folder with bufferıo:" + path);
    }

    @Override
    public void copy(String source, String destination) {
        System.out.println("copied from " + source + " to " + destination + "with bufferıo");
    }
}
