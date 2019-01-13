import javax.swing.*;
import java.io.File;

/**
 * 功能描述:
 *
 * @author: 许宏超 1630090038
 * @Date: 2019/1/13 10:23
 */
public class mainTest {
    public static void main(String[] args) throws Exception {

        JFileChooser jFileChooser = new JFileChooser();
        int i = jFileChooser.showOpenDialog( null );
        PicCopyForStream picCopyForChar = null;
        if (i == 0) {
            File selectedFile = jFileChooser.getSelectedFile();
            picCopyForChar = new PicCopyForStream( selectedFile.getAbsolutePath() );
            jFileChooser.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );

            // 选择绝对路径
            int j = jFileChooser.showOpenDialog( null );
            if (j == 0) {
                picCopyForChar.upload( jFileChooser.getSelectedFile().getPath() );
            }
        }
    }
}
