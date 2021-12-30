package StructureType.Proxy;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2021/12/30
 **/
import java.net.URL;

public class ImageViewer {

    public static void main(String[] args) throws Exception {
        // 模拟请求图片url
        String image = "http://image.jpg";
        URL url = new URL(image);
        // 模拟开始加载高分辨率图片
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        // 模拟使用图片代理
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
