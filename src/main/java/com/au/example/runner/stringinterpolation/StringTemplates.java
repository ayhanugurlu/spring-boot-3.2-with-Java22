package com.au.example.runner.stringinterpolation;

import com.au.example.runner.ExampleRunner;
import org.springframework.stereotype.Component;

@Component
class StringTemplates implements ExampleRunner {

    @Override
    public void run() throws Throwable {
        var name = "ayhan";
        System.out.println(STR."""
            the name is: \{name.toUpperCase()}
        """);
    }

}
