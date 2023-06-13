package imgReader;

// 图片读取器接口
 interface ImageReader{
    void readImage();
}
 class GifReader implements ImageReader{
    public void readImage(){
        System.out.println(" 读取Gif格式的图片");
    }
}
 class JpgReader implements ImageReader{
    public void readImage(){
        System.out.println(" 读取Jpg格式的图片");
    }
}
 abstract class OperatingSystem{
    protected ImageReader reader;

    public OperatingSystem(ImageReader reader){
        this.reader = reader;
    }

    abstract void runImage();
}
 class Windows extends OperatingSystem{
    public Windows(ImageReader reader){
        super(reader);
    }

    void runImage(){
        System.out.print("Windows系统正在");
        reader.readImage();
    }
}
 class Android extends OperatingSystem{
    public Android(ImageReader reader){
        super(reader);
    }

    void runImage(){
        System.out.print("Android系统正在");
        reader.readImage();
    }
}
 class Linux extends OperatingSystem{
    public Linux(ImageReader reader){
        super(reader);
    }

    void runImage(){
        System.out.print("Linux系统正在");
        reader.readImage();
    }
}

public class Client {
    public static void main(String[] args) {
        ImageReader reader = new GifReader();
        OperatingSystem windows = new Windows(reader);
        windows.runImage();

        ImageReader reader2 = new JpgReader();
        OperatingSystem android = new Android(reader2);
        android.runImage();

        ImageReader reader3 = new JpgReader();
        OperatingSystem linux = new Linux(reader3);
        linux.runImage();
    }
}
