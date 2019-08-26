package  org.zhouyou;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

/**
 * @Auther: Allen zhou
 * @Date: 2019-08-07 14:27
 * @Description:
 */
public class Main {
    static {
        //必须要写
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("opencv\t"+Core.VERSION);
    }

    public static void main(String[] args) {
        new Main().test();
    }

    public static void test(){
        Mat src= Imgcodecs.imread("G:\\baiduImg\\性感美女_52\\34.jpg");
        HighGui gui=new HighGui();
        gui.imshow("哈妮",src);
        gui.waitKey(1000);
    }
}
