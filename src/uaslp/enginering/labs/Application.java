package uaslp.enginering.labs;

/** This class is for the MAIN construction for all classes **/
public class Application {

    public void run() {

        /* Main building of the whole application */
        Menu menu = buildApplicationMenu();

        menu.draw();

    }

    private Menu buildApplicationMenu() {
        /* Create the main application Menu (empty) */
        Menu applicationMenu = new Menu();

        /* Create the file menu */
        Menu fileMenu = buildMenuFile(); // <- Check build method!
        /* Add the submenu 'file' to the main application array of menus */
        applicationMenu.addOption(fileMenu);

        /* Create the edit menu */
        Menu editMenu = buildMenuEdit();
        /* Add the submenu 'edit' to the main application array of menus */
        applicationMenu.addOption(editMenu);

        /* Create the view menu */
        Menu viewMenu = buildMenuView();
        /* Add the submenu 'view' to the main application array of menus */
        applicationMenu.addOption(viewMenu);

        /* Create the navigate menu */
        Menu navigateMenu = buildMenuNavigate();
        /* Add the submenu 'navigate' to the main application array of menus */
        applicationMenu.addOption(navigateMenu);

        /* Individual checkboxes to the applicationMenu */
        // [ ] Un texto
        applicationMenu.addOption(new Checkbox("Un texto"));
        applicationMenu.addOption(new Checkbox("Otro texto"));

        /* ListBox to the applicationMenu */
        // Opción 1 - Opcion 2 - Opcion 3
        applicationMenu.addOption(new ListBox("Opcion 1", "Opcion 2", "Opción 3"));
        applicationMenu.addOption(new Checkbox("Opcion 5"));

        /* Adds an edit box to the applicationMenu */
        // [|        ]
        applicationMenu.addOption(new EditBox());

        /* Adds a button to the applicationMenu */
        applicationMenu.addOption(new Button("Exit"));
        applicationMenu.addOption(new ListBox("Opcion 4", "Opcion 5"));
        applicationMenu.addOption(new EditBox());

        return applicationMenu;
    }

    private Menu buildMenuNavigate() {
        Menu navigateFile = new Menu("Navigate");

        navigateFile.addOption(new Button("Back"), "B");
        navigateFile.addOption(new Button("Forward"), "F");
        navigateFile.addOption(new Separator());
        navigateFile.addOption(new Button("Search everywhere"), "S");
        navigateFile.addOption(new Separator());
        navigateFile.addOption(new Button("Class"), "C");

        return navigateFile;
    }

    private Menu buildMenuView() {
        Menu viewFile = new Menu("View");

        viewFile.addOption(new Button("Tool Windows"), "T");
        viewFile.addOption(new Button("Appearance"), "A");

        return viewFile;
    }

    private Menu buildMenuEdit() {
        Menu editFile = new Menu("Edit");

        editFile.addOption(new Button("Undo"), "U");
        editFile.addOption(new Button("Redo"), "R");
        editFile.addOption(new Separator());
        editFile.addOption(new Button("Cut"), "C");
        editFile.addOption(new Button("Copy"));
        editFile.addOption(new Button("Paste"));
        editFile.addOption(new Button("Delete"));

        return editFile;
    }

    private Menu buildMenuFile() {
        Menu menuFile = new Menu("File");

        menuFile.addOption(new Button("Open"), "O");
        menuFile.addOption(new Button("Close project"), "X");
        menuFile.addOption(new Separator());
        menuFile.addOption(new Button("Settings"), "S");
        menuFile.addOption(new Button("Project Structure"));
        menuFile.addOption(new Separator());

        return menuFile;
    }
}

