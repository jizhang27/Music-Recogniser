package logic;

import javax.swing.filechooser.FileFilter;

import utility.Utils;

import java.io.File;

/**
 * Created by workshop on 9/18/2015.
 */
public class AudioFilter extends FileFilter {

    //Accept all directories and all gif, jpg, tiff, or png files.
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = Utils.getExtension(f);
        if (extension != null) {
            if (extension.equals(Utils.wav) || extension.equals(Utils.mp3)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    //The description of this filter
    public String getDescription() {
        return "Just Audio";
    }
}
