package se.yrgo.sbcvm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import se.yrgo.sbcvm.domain.Book;

import java.time.LocalDate;

import java.util.List;

@Controller
public class BookController {
    private List<Book> books = List.of(
            new Book("En bra plats i skallen", "Marcus Berggren", "Coming-of-age"),
            new Book("Inventering", "Erlend Loe", "Satire"),
            new Book("Detaljerna", "Ia Genberg", "Literary fiction"),
            new Book("Lejonflock", "Linda Jones", "Coming-of-age"),
            new Book("Väggen", "Marlen Haushofer", "Dystopian fiction"));

    @GetMapping("/home")
    public String homePage(Model model) {
        LocalDate today = LocalDate.now();
        model.addAttribute("message", "Welcome to the Book Club");
        model.addAttribute("date", today);
        return "home";
    }

    @GetMapping("/booklist")
    public ModelAndView books() {
        return new ModelAndView("booklist", "books", books);
    }

    @GetMapping("/genre")
    public ModelAndView showGenreForm(@RequestParam(required = false) String type) {
        List<Book> result = books;

        if (type != null && !type.isEmpty()) {
            result = books.stream()
                    .filter(b -> b.getGenre().equalsIgnoreCase(type.trim()))
                    .toList();
        }
        ModelAndView mav = new ModelAndView("genre");
        mav.addObject("books", result);
        mav.addObject("selectedGenre", type);
        return mav;
    }
}
