package mvcapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Контроллер для главной страницы приложения.
 */

//Аннотация @Controller говорит component-scan что нужно создать спринг-бин из этого класса
// (поэтому рекомендуется оставлять в нем конструктор по-умолчанию без параметров).

//Все объекты-бины в спринге по-умолчанию являются синглтонами.
// Т.е. на все приложение создается один единственный экземпляр нашего контроллера,
// который обрабатывает все запросы, в том числе может и параллельно.
@Controller
public class WelcomeController {
    private int visitorCount = 0;

    //Аннотация @RequestMapping говорит, что метод index будет обрабатывать запросы по URL /index.html от корня приложения
    // (если приложение развернуто на сервере под контекстом /mvc то соответственно полный URL будет http://localhost:8080/mvc/index.html).
//Tакже она может принимать wildcards (regexp) и использовать в качестве пути переменные,
// значения которых можно получить в параметре метода - фактически можно добиться практически любой сложности URL.
    @RequestMapping("/index.html")
    // метод index (название произвольное, главное чтобы он был public) принимает на вход объект модели,
    // которую может заполнить в теле метода, и возвращает String - имя jsp страницы, которая представляет собой view.
    // Параметры у метода и возвращаемое значение могут быть самые разнообразные, в зависимости от потребностей конкретной логики контроллера.
    public String index(Model model) {
        model.addAttribute("visitorCount", visitorCount++);
        return "WEB-INF/jsp/index.jsp";
    }
}
