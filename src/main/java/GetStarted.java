import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class GetStarted {
    public static void main(String[] args) {

        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("https://playwright.dev");
            System.out.println(page.title());

            System.out.println("Button = "+page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()).count());
             System.out.println("Link = "+page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()).count());
            System.out.println("page.getByRole(AriaRole.LINK).count() = " + page.getByRole(AriaRole.LINK).count());

        }
    }
}