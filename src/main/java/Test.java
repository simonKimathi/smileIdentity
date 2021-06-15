import org.apache.commons.codec.binary.Base64;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) throws Exception{
        File f =  new File("yona.png");
        String encodstring = encodeFileToBase64Binary(f);
        System.out.println(encodstring);
    }

    private static String encodeFileToBase64Binary(File file) throws Exception{
        FileInputStream fileInputStreamReader = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        fileInputStreamReader.read(bytes);
        return new String(Base64.encodeBase64(bytes), StandardCharsets.UTF_8);
    }
}
