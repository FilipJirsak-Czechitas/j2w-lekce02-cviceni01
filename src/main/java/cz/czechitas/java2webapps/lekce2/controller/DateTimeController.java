package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Kontroler, který obsahuje dvě metody. Spring kontroler sám vytvoří a zvaolá správnou metodu v závislosti na tom, kterou adresu prohlížeč volá.
 * <p>
 * Adresa {@code /} není pokrytá žádnou metodou kontroleru. Spring se v tom případě pokusí najít soubor {@code src/main/resources/static/index.html}
 * a odeslat prohlížeči ten. V našem projektu takový soubor je, tím pádem se na úvodní obrazovce zobrazí příslušná úvodní stránka.
 *
 * @author Filip Jirsák
 */
@Controller
public class DateTimeController {
    /**
     * Metoda kontroleru zobrazující datum. Je Springem volaná v okamžiku, kdy prohlížeč požaduje adresu {@code /datum}.
     *
     * @return Sdružený objekt obsahující model a informace o view.
     */
    @GetMapping("/datum")
    public ModelAndView datum() {
        //Vytvoříme si sdružený objekt pro model a view. Použijeme view „datum“, tedy šablonu v souboru „src/main/resources/templates/datum.ftlh“.
        ModelAndView result = new ModelAndView("datum");
        //Do modelu pod klíčem „datum“ vložíme aktuální datum.
        result.addObject("datum", LocalDate.now());
        //Sdružený objekt vrátíme z metody, Spring jej vezme a zavolá příslušnou Thymeleaf šablonu a předá jí data z našeho modelu.
        return result;
    }

    /**
     * Metoda kontroleru zobrazující čas. Je Springem volaná v okamžiku, kdy prohlížeč požaduje adresu {@code /cas}.
     *
     * @return Sdružený objekt obsahující model a informace o view.
     */
    @GetMapping("/cas")
    public ModelAndView cas() {
        //Vytvoříme si sdružený objekt pro model a view. Použijeme view „datum“, tedy šablonu v souboru „src/main/resources/templates/datum.ftlh“.
        ModelAndView result = new ModelAndView("cas");
        //Do modelu pod klíčem „datum“ vložíme aktuální čas.
        result.addObject("cas", LocalTime.now());
        //Sdružený objekt vrátíme z metody, Spring jej vezme a zavolá příslušnou Thymeleaf šablonu a předá jí data z našeho modelu.
        return result;
    }
}
