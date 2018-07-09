package com.carus.api.bug;

import org.springframework.stereotype.Controller;
import java.util.Optional;

@Controller
public class DemoApiController implements DemoApi {

    private final DemoApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public DemoApiController(DemoApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public DemoApiDelegate getDelegate() {
        return delegate;
    }
}
