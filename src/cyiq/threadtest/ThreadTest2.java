package cyiq.threadtest;


public class ThreadTest2 {
    public static void main(String args[]) {
        MyThread3 t1 = new MyThread3("t1");
        /* ͬʱ�������������߳�t1��t2��t1��t2ִ�еĶ���run()���� */
        /* ��������ִ�й������ܹ���3���߳��ڲ���ִ�У��ֱ�Ϊ���߳�t1��t2�Լ����߳� */
        MyThread3 t2 = new MyThread3("t2");
        t1.start();// �������߳�t1
        t2.start();// �������߳�t2
        for (int i = 0; i <= 5; i++) {
            System.out.println("I am main Thread");
        }
    }
}

class MyThread3 extends Thread {
    MyThread3(String s) {
        super(s);
    }

    public void run() {
   
        for (int i = 1; i <20; i++) {
        	synchronized(this){
        		
            System.out.printf(getName() + "��" + i);
            if (i % 2 == 0) {
            	System.out.println("����ִ��");
                yield();// ��ִ�е�i�ܱ�2����ʱ��ǰִ�е��߳̾��ó�������һ����ִ��run()�������߳�������ִ��
                /*
                 * �ڳ�������еĹ����п��Կ�����
                 * �߳�t1ִ�е�(i%2==0)��ʱ�ͻ��ó��߳���t2�߳�������ִ�� 
                 * ���߳�t2ִ�е�(i%2==0)��ʱҲ���ó��̸߳�t1�߳�����ִ��
                 */
            }else{
            	System.out.println();
            }
        	}
            
        }
    }
}
