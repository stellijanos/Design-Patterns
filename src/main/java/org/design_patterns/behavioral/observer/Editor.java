package org.design_patterns.behavioral.observer;

public class Editor {

    public EventManager events = new EventManager("open", "save");

    private String file = "";

    public void openFile(String file) {
        this.file = file;
        events.notify("open", this.file);
    }

     public void saveFile() {
        if (!file.isEmpty()) {
            events.notify("save", file);
        }
    }
}
