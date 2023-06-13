package testwork;

public class TestDemo {
    public static interface  ImageReaderFactory{
        ImageReader getImageReader();
    }
    public interface ImageReader{
        void ReadImage();
    }
    public static class GifReader implements ImageReader {
        @Override
        public void ReadImage() {
            System.out.println("读取GIF格式的图片");
        }
    }
    public static class JPEGReader implements ImageReader{
        @Override
        public void ReadImage() {
            System.out.println("读取JPEG格式的图片");

        }
    }
    public static class GifReaderFactory implements ImageReaderFactory{
        @Override
        public ImageReader getImageReader() {
            ImageReader gifReader=new GifReader();
            return gifReader;
        }
    }
    public static class JPEGReaderFactory implements ImageReaderFactory{
        @Override
        public ImageReader getImageReader() {
            ImageReader jpegReader=new JPEGReader();
            return jpegReader;
        }
    }

    public static void main(String[] args) {
        GifReader gifReader=null;
        JPEGReader jpegReader=null;
        ImageReaderFactory gifReaderFactory=new GifReaderFactory();
        ImageReaderFactory jPEGReaderFactory=new JPEGReaderFactory();
        gifReader= (GifReader) gifReaderFactory.getImageReader();
        jpegReader= (JPEGReader) (jPEGReaderFactory).getImageReader();
        gifReader.ReadImage();
        jpegReader.ReadImage();
    }
}

