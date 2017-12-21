package org.launchcode.models.forms;

import org.hibernate.validator.constraints.NotEmpty;
import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {

//    declare fields
    private Menu menu;

    private Iterable<Cheese> cheeses;

    @NotNull
    private int menuId;

    @NotNull
    private int cheeseId;


// getters and setters
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }

    public void setCheeses(Iterable<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }


//    default constructor
    public AddMenuItemForm() {}


//    regular constructor
    public AddMenuItemForm(Menu menu, Iterable<Cheese> cheeses) {
        this.menu = menu;
        this.cheeses = cheeses;
    }
}
