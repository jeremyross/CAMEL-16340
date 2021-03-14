package org.jeremyross;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class CamelTest extends CamelTestSupport {

    @Test
    public void test() {
    }

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:doit")
                    .split(body())
                        .to("salesforce:query");
            }
        };
    }
}
