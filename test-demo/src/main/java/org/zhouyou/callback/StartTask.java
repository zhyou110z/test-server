package org.zhouyou.callback;

/**
 * @Auther: Allen zhou
 * @Date: 2019-09-02 11:02
 * @Description:
 */
public class StartTask {




    public static void main(String[] args) {
        StartTask2 startTask2 = new StartTask2();
        startTask2.printTask2(new ITaskCallback() {
            @Override
            public void onSuccess(String rs) {
                System.out.println("onSuccess : " + rs);
            }

            @Override
            public void onFailed() {
                System.out.println("onFailed");
            }
        });

    }
}
