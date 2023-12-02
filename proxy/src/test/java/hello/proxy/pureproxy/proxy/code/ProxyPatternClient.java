package hello.proxy.pureproxy.proxy.code;

import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;

public class ProxyPatternClient {

    private Subject subject;

    public ProxyPatternClient(Subject subject) {
        this.subject = subject;
    }

    public void execute() {
        subject.opertaion();
    }
}
