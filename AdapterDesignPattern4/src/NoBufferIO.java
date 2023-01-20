public class NoBufferIO implements IIO{
    @Override
    public void createTextFile(String path) {
        System.out.println("create text file with nobufferıo:" + path);
    }

    @Override
    public void createFolder(String path) {
        System.out.println("create folder with nobufferıo:" + path);
    }

    @Override
    public void copy(String source, String destination) {
        System.out.println("copied from " + source + " to " + destination + "with nobufferıo");
    }
}
