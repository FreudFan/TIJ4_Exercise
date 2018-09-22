package 第二章;

public class Ex10 {
    public static void main(String[] args) {
        if (args.length == 0 || args[0].equals("-h")) {
            System.out.println("Hello,");
        } else if (args[0].equals("-g")) {
            System.out.println("Goodbye,");
        }

        for (int i = 0; i < args.length;i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}

/*在命令行编译运行此程序
    java Ex10 -g cruel world
    会显示结果  Goodbye, -g cruel world
    args[] 用来保存运行时命令行输入的参数，如‘-g cruel world'
 */
