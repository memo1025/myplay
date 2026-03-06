import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class GetStarted_1 {
    public static void main(String[] args) {

        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.setContent("<a href=\"https://playwright.dev\">link one</a>\n" +
                    "<a href=\"https://playwright.dev\">link two</a>\n" +
                    "<button>Click me</button>");
            System.out.println(" AriaRole.LINK " + page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()).count());
            System.out.println(" AriaRole.LINK " + page.getByRole(AriaRole.LINK).count());

        }
    }
}