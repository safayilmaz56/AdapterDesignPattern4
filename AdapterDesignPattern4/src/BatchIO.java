public class BatchIO {
    public void dosyaOlustur(String dosyaYolu){
        System.out.println("create text file with batchıo:" + dosyaYolu);
    }
    public void klasorOlustur(String dosyaYolu){
        System.out.println("create folder with batchıo:" + dosyaYolu);
    }
    public void kopyala(String kaynak,String hedef){
        System.out.println("copied from " + kaynak + " to " + hedef + "with batchıo");
    }
}
