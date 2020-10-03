package uaslp.enginering.labs;

import java.util.ArrayList;
import java.util.Collections;

public class ListBox extends Control {
    /* Because it's a list it has to have an array of options */
    private ArrayList<String> options;

    /* ... -> Ellipsis operator indicates variable arguments (0 to n) */
    public ListBox(String ... options) {
        /* Initialization of the arrayList in ListBox class */
        this.options = new ArrayList<>(options.length);

        /* Add all the options from parameters to the arrayList */
        Collections.addAll(this.options, options);
    }

    public void draw() {
        for(String option : options)
            System.out.print(option + " - ");
    }
}
