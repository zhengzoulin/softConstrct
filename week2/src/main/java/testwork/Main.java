//package testwork;
//
//abstract class ImageReaderFactory {
//    public abstract ImageReader createImageReader();
//}
//
//class GifReaderFactory extends ImageReaderFactory {
//    public GifReader createImageReader() {
//        return new GifReader();
//    }
//}
//
//class JpgReaderFactory extends ImageReaderFactory {
//    public JpgReader createImageReader() {
//        return new JpgReader();
//    }
//}
//
//interface ImageReader {
//    void readImage();
//}
//
//class GifReader implements ImageReader {
//    public void readImage() {
//        System.out.println("Reading GIF image.");
//    }
//}
//
//class JpgReader implemenpublic class TestDemo {
//    public static abstract class ImageReaderFactory{
//
//    }
//
//    public static class GifReader{
//        void ImageReader(){
//            System.out.println(123);
//        }
//    }
//    public static class JPEGReader{
//        void ImageReader(){
//            System.out.println(456);
//        }
//    }
//    public static class GifReaderFactory extends ImageReaderFactory{
//        public GifReader createImageReader(){
//            GifReader gifReader=new GifReader();
//            return gifReader;
//        }
//    }
//    public static class JPEGReaderFactory extends ImageReaderFactory{
//        JPEGReader createImageReader(){
//            return new JPEGReader();
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        GifReader gifReader=null;
//        JPEGReader jpegReader=null;
//        ImageReaderFactory gifReaderFactory=new GifReaderFactory();
//        ImageReaderFactory jPEGReaderFactory=new JPEGReaderFactory();
//        gifReader= ((GifReaderFactory) gifReaderFactory).createImageReader();
//        jpegReader= ((JPEGReaderFactory) jPEGReaderFactory).createImageReader();
//
//        gifReader.ImageReader();
//        jpegReader.ImageReader();
//
//
//    }
//}
//    ts ImageReader {
//    public void readImage() {
//        System.out.println("Reading JPEG image.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        ImageReaderFactory gifReaderFactory = new GifReaderFactory();
//        ImageReader gifReader = gifReaderFactory.createImageReader();
//        gifReader.readImage();
//
//        ImageReaderFactory jpgReaderFactory = new JpgReaderFactory();
//        ImageReader jpgReader = jpgReaderFactory.createImageReader();
//        jpgReader.readImage();
//    }
//}