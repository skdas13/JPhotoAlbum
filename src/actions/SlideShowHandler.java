package actions;

import fi.iki.jka.JPhotoCollection;
import fi.iki.jka.JPhotoFrame;
import fi.iki.jka.JPhotoList;
import fi.iki.jka.JPhotoShow;

import javax.swing.*;

public class SlideShowHandler implements ActionHandler {

    private final JPhotoCollection photos;
    private final PhotoShow photoShow;
    private final DialogShow dialogShow;

    public SlideShowHandler(JPhotoCollection photos, PhotoShow photoShow, DialogShow dialogShow) {
        this.photos = photos;
        this.photoShow = photoShow;
        this.dialogShow = dialogShow;
    }

    public boolean canHandle() {
        return photos != null && photos.size() > 0;
    }

    public void handle() {
        if (canHandle()) {
            photoShow.go();
        }
        else {
            dialogShow.go();
        }
    }

}
