# Lekce 2 – datum a čas

Úvodní webová stránka bude obsahovat dva odkazy – na stránku s aktuálním datem a stránku s aktuálním časem. Dále budou na webu dvě stránky – stránka na adrese
`/datum` bude zobrazovat aktuální datum, stránka na adrese `/cas` bude zobrazovat aktuální čas (v okamžiku načtení stránky).

1. Udělej fork zdrojového repository do svého účtu na GitHubu.
1. Naklonuj si repository **ze svého účtu** na GitHubu na lokální počítač.
1. Úvodní stránka `static/index.html` už je připravená.
1. Vytvoř kontrolér – třídu `cz.czechitas.java2webapps.lekce2.controller.MainController`.
1. V kontroléru budou dvě metody – jedna bude navázána na cestu `/datum`, druhá na cestu `/cas`.
1. Obě metody budou vracet `ModelAndView`, view bude pro každou metodu jiné.
1. Metoda pro výpis data vloží do modelu datum zformátované v českém formátu:
1. Metoda pro výpis času vloží do modelu čas (hodiny a minuty) zformátované v českém formátu:
1. Zkontroluj výsledek v prohlížeči.

## Mohlo by se hodit
* odkaz na stránku [Lekce 2](https://java.czechitas.cz/2021-jaro/java-2/lekce-2.html)
