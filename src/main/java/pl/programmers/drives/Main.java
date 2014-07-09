package pl.programmers.drives;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isCDInTheDrive());
    }

    public static boolean isCDInTheDrive() {
        String cdName = "eLicence_v1.0";

        List<File> files = Arrays.asList(File.listRoots());
        for (File drv : files) {
            String drvName = FileSystemView.getFileSystemView().getSystemDisplayName(drv);
            System.out.println(drvName);
            if (drvName.contains(cdName)) {
                return true;
            }
        }

        return false;
    }

}

