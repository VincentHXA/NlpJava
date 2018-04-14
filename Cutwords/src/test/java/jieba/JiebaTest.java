package jieba;

import junit.framework.TestCase;


public class JiebaTest extends TestCase {

    public void testDemoProcessInSearchMode() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        String[] input = new String[] {
                "这是一个伸手不见五指的黑夜。我叫孙悟空，我爱北京，我爱Python和C++。", "我不喜欢日本和服。", "雷猴回归人间。",
                "工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作", "结果婚的和尚未结过婚的"
        };

        for(String sentence : input) {
            System.out.println(Jieba.demoProcessInSearchMode(sentence));
        }
    }

    public void testDemoProcessInIndexMode() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        String[] input = new String[] {
                "这是一个伸手不见五指的黑夜。我叫孙悟空，我爱北京，我爱Python和C++。", "我不喜欢日本和服。", "雷猴回归人间。",
                "工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作", "结果婚的和尚未结过婚的"
        };

        for(String sentence : input) {
            System.out.println(Jieba.demoProcessInIndexMode(sentence));
        }
    }

    public void testDemoSentenceProcess() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        String[] input = new String[] {
                "这是一个伸手不见五指的黑夜。我叫孙悟空，我爱北京，我爱Python和C++。", "我不喜欢日本和服。", "雷猴回归人间。",
                "工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作", "结果婚的和尚未结过婚的"
        };

        for(String sentence : input) {
            System.out.println(Jieba.demoSentenceProcess(sentence).toString());
        }
    }
}