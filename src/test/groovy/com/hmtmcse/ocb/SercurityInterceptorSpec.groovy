package com.hmtmcse.ocb

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class SercurityInterceptorSpec extends Specification implements InterceptorUnitTest<SercurityInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test sercurity interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"sercurity")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
