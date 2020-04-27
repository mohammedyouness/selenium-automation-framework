package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload() {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\Mohamed Abou Elsoud\\Desktop\\IntelliJ-Workspace\\SeleniumTAU\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files is incorrect");
    }
}
