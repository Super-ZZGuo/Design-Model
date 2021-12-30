package StructureType.Proxy;

/**
 * @Author zzguo
 * @Description 虚拟代理 在高分辨率图片完全加载之前使用 模版图片 代替
 * @Date 2021/12/30
 **/
public class ImageProxy implements Image{

    private HighResolutionImage highResolutionImage;

    public ImageProxy(HighResolutionImage highResolutionImage) {
        this.highResolutionImage = highResolutionImage;
    }

    @Override
    public void showImage() {
        while (!highResolutionImage.isLoad()) {
            try {
                // 每 500ms 加载一次模版图片
                System.out.println("模版图片: " + highResolutionImage.getWidth() + " " + highResolutionImage.getHeight());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        highResolutionImage.showImage();
    }
}
