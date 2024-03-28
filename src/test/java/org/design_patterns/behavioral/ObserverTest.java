package org.design_patterns.behavioral;

import org.design_patterns.behavioral.observer.Editor;
import org.design_patterns.behavioral.observer.EmailNotificationListener;
import org.design_patterns.behavioral.observer.LogOpenListener;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void test() {
        Editor editor = new Editor();
        EmailNotificationListener emailListener = new EmailNotificationListener();
        LogOpenListener logOpenListener = new LogOpenListener();

        editor.events.subscribe("open", emailListener);
        editor.events.subscribe("save", emailListener);
        editor.events.subscribe("open", logOpenListener);

        editor.openFile("test.jpg");
        editor.saveFile();

        System.out.println();

        editor.events.unsubscribe("save", emailListener);

        editor.openFile("test1.jpg");
        editor.saveFile();
    }
}
