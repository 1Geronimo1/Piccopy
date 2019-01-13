import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

/**
 * 功能描述:
 *
 * @author: 许宏超 1630090038
 * @Date: 2019/1/13 10:04
 */
public class PicCopyForChar {
    String target = "PicName";
    FileReader fileReader;
    FileWriter fileWriter;
    int extname;
    public PicCopyForChar(String Picpath) throws  Exception{

        File file = new File( Picpath);
        if (!file.exists()){
            // 存在的情况
            JOptionPane.showMessageDialog( null,"照片不存在" );
            return;
        }else {
            // 存在的情况
            /*String PicName = "294140.jpg";*/
extname = Picpath.lastIndexOf( "," );
        }
    }

    // 目标文件路径


    public  void uploadPic(String path){

        File file = new File(target + "/" + System.currentTimeMillis() + extname );
        try {
            fileWriter = new FileWriter( file );
            int length;
            while ((length = fileReader.read()) != -1){
                fileWriter.write( length );
            }
        }catch (Exception e){

        }
    }
}
