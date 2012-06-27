package actions;

import fi.iki.jka.JPhotoCollection;
import fi.iki.jka.JPhotoFrame;
import fi.iki.jka.JPhotoList;

import javax.swing.*;

import static junit.framework.Assert.assertTrue;

public class MessageDialogShow implements DialogShow {

    private final JPhotoFrame jPhotoFrame;
    private final String app_name;

    public MessageDialogShow(JPhotoFrame jPhotoFrame, String APP_NAME) {
        this.jPhotoFrame = jPhotoFrame;
        this.app_name = APP_NAME;
    }

    public void go() {
        JOptionPane.showMessageDialog(jPhotoFrame, "No photos to show!", app_name, JOptionPane.ERROR_MESSAGE);
    }
}
