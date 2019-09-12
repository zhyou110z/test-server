package org.zhouyou.callback;

/**
 * @Auther: Allen zhou
 * @Date: 2019-09-02 11:02
 * @Description:
 */
public class StartTask2 {

    public  void printTask2(ITaskCallback iTaskCallback){

        System.out.println("start ..");
        iTaskCallback.onSuccess("1");

    }


}
