import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 功能描述:
 *
 * @author: 许宏超 1630090038
 * @Date: 2019/1/13 10:05
 */
public class PicCopyForStream {

    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    String extName;

    public  void upload(String targetPath){
        File file = new File(  targetPath+"/" + System.currentTimeMillis() + extName);
    try {

        fileOutputStream = new FileOutputStream(file);
        int length;
        byte [] bytes = new byte[1024];
        while ((length = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write( bytes,0,length );
                fileOutputStream.flush();
        }
        fileInputStream.close();
        fileOutputStream.close();
    }catch (Exception e){
        e.getStackTrace();
    }

    }
    public PicCopyForStream(String picPath) {
        File file = new File( picPath );

        if (!(file.exists())) {
            JOptionPane.showMessageDialog( null, "输入的照片不存在" );
            return;
        } else {
            try {
                extName = picPath.substring( picPath.lastIndexOf( "." ) );
                fileInputStream = new FileInputStream( file );
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
