package four.lv2;

import java.io.*;

public class Tools {
    //创建一个文件
    public static void createNewFile(String filePath) throws IOException {
        File file = new File(filePath);
        file.createNewFile();
    }
    //返回文件的大小
    public static void getLength(String filePath) {
        File file = new File(filePath);
        System.out.println("大小:"+file.length()+"字节");
    }

    //向文件写入数据
    public static void write(String filePath, String str) throws IOException {
        File file = new File(filePath);
        Writer out;
        out = new FileWriter(file);
        out.write(str);
        out.close();
    }

    //从文件读取内容
    public static void read(String filePath) throws IOException {
        File file = new File(filePath);
        Reader reader;
        reader = new FileReader(file);
        int len = 0;
        char c[] = new char[1024];
        int temp = 0;
        while ((temp = reader.read()) != -1) {
            c[len] = (char) temp;
            len++;
        }
        reader.close();
        System.out.println("内容:" + new String(c, 0, len));
    }
}
