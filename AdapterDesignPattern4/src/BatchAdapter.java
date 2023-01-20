public class BatchAdapter implements IIO{

    private BatchIO batch;
    public BatchAdapter(){
        batch = new BatchIO();
    }

    @Override
    public void createTextFile(String path) {
        batch.dosyaOlustur(path);
    }

    @Override
    public void createFolder(String path) {
        batch.klasorOlustur(path);
    }

    @Override
    public void copy(String source, String destination) {
        batch.kopyala(source,destination);
    }
}
