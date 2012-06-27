import actions.MessageDialogShow;
import actions.MockDialogShow;
import actions.MockPhotoShow;
import actions.SlideShowHandler;
import fi.iki.jka.JPhotoShow;
import org.junit.Test;

public class JPhotoFrameTest {

    @Test()
    public void test()
    {
        new SlideShowHandler(null, new MockPhotoShow(), new MockDialogShow()).handle();
    }

}
