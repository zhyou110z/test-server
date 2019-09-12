package org.zhouyou;

/**
 * @Auther: Allen zhou
 * @Date: 2019-08-22 09:00
 * @Description:
 */
public class SynchronizedTest {

    boolean flag = true;

    public synchronized   void test1(){

        System.out.println("aaaa'");
        while (flag){
            flag = false;
            test2();
        }
        try {
            Thread.sleep(1000l);
            Thread.yield();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("bbbb'");

    }


    public  void  test2(){
        Thread thread = new Thread(()->test1());
        thread.start();
        try {
            thread.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
