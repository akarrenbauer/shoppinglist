package de.aswggmbh.thymeleafshoppinglist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;



@Controller
@RequestMapping("/shoppinglist")
public class ShoppingListController {
	private ShoppingListItemRepository repository;

	public ShoppingListController(ShoppingListItemRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public String shoppingList(Model model) {
		model.addAttribute("shoppingList", repository.findAll() );
		model.addAttribute("shoppingListItem", new ShoppingListItem());
		return "shoppinglist";
	}

	@PostMapping
	public String append(Model model, @Valid @ModelAttribute ShoppingListItem item) {
		repository.save(item);
		return "redirect:/shoppinglist";
	}
}	
