package org.design_patterns.behavioral;

import org.design_patterns.behavioral.chainOfResponsability.AuthenticationHandler;
import org.design_patterns.behavioral.chainOfResponsability.ContentTypeHandler;
import org.design_patterns.behavioral.chainOfResponsability.PayloadHandler;
import org.junit.Test;

public class ChainOfResponsabilityTest {

    @Test
    public void test() {
        AuthenticationHandler auth = new AuthenticationHandler("1234");
        ContentTypeHandler type = new ContentTypeHandler("JSON");
        PayloadHandler payload = new PayloadHandler("Body:{\"username\":\"Janos\"}");

        auth.next = type;
        type.next = payload;

        String withAuthentication = auth.addHandler("Headers with authentication");
        System.out.println(withAuthentication);

        System.out.println();

        String withoutAuth = type.addHandler("Headers without auth");
        System.out.println(withoutAuth);
    }
}
