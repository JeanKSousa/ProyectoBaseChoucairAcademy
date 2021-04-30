package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_CC = Target.the("Selecciona cursos choucair")
            .located(By.xpath("//div[@id='certificaciones']//strong"));

    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final  Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[contains(text(), 'Ir')]"));

    public static  final  Target SELECT_COURSE = Target.the("Dar click para buscar el curso")
            .located(By.xpath("//a[contains(text(), 'Advanced Level Test Manager')]"));

    public static  final  Target NAME_COURSE = Target.the("Dar click para buscar el curso")
            .located(By.xpath("//a[contains(text(), 'Advanced Level Test Manager')]"));
}
