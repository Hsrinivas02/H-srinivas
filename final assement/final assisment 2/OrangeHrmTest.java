package Last_Assesment_Task_2;

import Last_Assesment_Task_2.utilities.Excel;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class OrangeHrmTest extends BaseClass {


    @Test
    public void buzzPostTest() throws IOException {

        // 1. Click on Buzz
        buzzPage.clickBuzz();

        // 2. Read text from Excel
        String postText = Excel.getData(1, 0);

        System.out.println(
                "Excel Data : " + postText
        );

        // 3. Enter text in What's on your mind?
        buzzPage.enterMindText(postText);

        // 4. Click Post
        buzzPage.clickPost();

        // 5. Verify post in Recent Posts
        boolean result =
                buzzVerificationPage.verifyPost(postText);

        Assert.assertTrue(
                result,
                "Post is not displayed in Recent Posts"
        );

        System.out.println(
                "Post is displayed in Recent Posts"
        );
    }
}