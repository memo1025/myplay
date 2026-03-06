import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class CountElementsExample {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch( );
            Page page = browser.newPage();

            // Navigate to a sample page
            page.navigate("https://playwright.dev/");

            // Count links by tag name
            int linkCount = page.locator("a").count();
            System.out.println("Number of links: " + linkCount);

            // Count visible links only
            int visibleLinkCount = page.locator("a:visible").count();
            System.out.println("Number of visible links: " + visibleLinkCount);

            // Count links by role (accessibility-friendly)
            int roleLinkCount = page.getByRole(AriaRole.LINK).count();
            System.out.println("Number of links by role: " + roleLinkCount);

            // Count buttons by tag name
            int buttonCount = page.locator("button").count();
            System.out.println("Number of buttons: " + buttonCount);

            // Count images by tag name
            int imageCount = page.locator("img").count();
            System.out.println("Number of images: " + imageCount);

            // Count input fields by tag name
            int inputCount = page.locator("input").count();
            System.out.println("Number of input fields: " + inputCount);

            // Count elements by text
            int getStartedCount = page.getByText("Get started").count();
            System.out.println("Number of 'Get started' texts: " + getStartedCount);

            browser.close();
        }
    }
}