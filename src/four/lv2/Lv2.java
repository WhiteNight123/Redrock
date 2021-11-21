package four.lv2;
import java.io.IOException;

import static four.lv2.Tools.*;
public class Lv2 {
    public static void main(String[] args) throws IOException {
        String filePath="D:\\text.txt";
        createNewFile(filePath);
        write(filePath,"红岩太卷了");
        getLength(filePath);
        read(filePath);
    }
}
