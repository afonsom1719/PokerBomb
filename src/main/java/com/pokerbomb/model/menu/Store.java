package com.pokerbomb.model.menu;

import com.pokerbomb.model.Model;

public class Store implements Model {

    public enum Option {JUNGLE, DYNAMITE, DEFREEZE, EXIT}
    public String[] optString = {"BUY JUNGLE POWERUP", "BUY DYNAMITE POWERUP", "BUY DEFREEZE POWERUP", "EXIT"};

    Store.Option selected;
    Store.Option[] opt = Store.Option.values();

    public Store() {
        this.selected = Store.Option.JUNGLE;
    }

    public Store.Option getSelected() {
        return selected;
    }

    public void setSelected(Store.Option selected) {
        this.selected = selected;
    }

    public int getPosElem(Store.Option target) {
        int i = 0;
        for (; opt[i] != target; i++) ;
        return i;
    }

    public void nextSelected() {
        if (selected == Store.Option.EXIT) selected = Store.Option.JUNGLE;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i++;
            selected = opt[i];
        }
    }

    public void previousSelected() {
        if (selected == Store.Option.JUNGLE) selected = Store.Option.EXIT;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i--;
            selected = opt[i];
        }
    }

    public String enumToString(Store.Option storeOption) {
        int position = getPosElem(storeOption);
        return optString[position];
    }
}
