package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseTest{
    @Test
    public void imgDownload(){
        fileUploadPage.open();
        fileUploadPage.buttonChoice();
        File file = new File("src/test/img/adel.jpg");
        fileUploadPage.buttonUpload();


    }
}
