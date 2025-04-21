package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_estrategia_01Page {
    WebDriver driver;

    By estrategiaLink = By.id("estrategia-link");
    By aprobarButton = By.id("aprobar-btn");
    By confirmacionLabel = By.id("confirmacion");

    public tc_estrategia_01Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToEstrategiasPage() {
        driver.findElement(estrategiaLink).click();
    }

    public void revisarEstrategia() {
        // Implement logic to review strategy here
        driver.findElement(aprobarButton).click();
    }

    public void verificarAprobacionEstrategia() {
        String confirmacionTexto = driver.findElement(confirmacionLabel).getText();
        assert confirmacionTexto.contains("Estrategia aprobada");
    }
}