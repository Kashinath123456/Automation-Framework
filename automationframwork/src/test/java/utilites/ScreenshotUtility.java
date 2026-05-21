package utilites;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {

public static void capture(
WebDriver driver,
String name) throws Exception {

File src=
((TakesScreenshot)driver)
.getScreenshotAs(
OutputType.FILE);

File dest=
new File(
"./src/test/resources/screenshots/"
+name+".png");

FileHandler.copy(src,dest);

}
}