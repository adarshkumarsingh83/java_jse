package com.espark.adarsh.test

import com.espark.adarsh.Utils
import spock.lang.Specification

class TestGroovy extends Specification {

    Utils utils =new Utils();

    def 'test utils'(){

        when:
        utils!=null

        then:
        String response = utils.getMessage();

        expect:
        response.equals(System.getProperty("user.name"+"welcome"))
    }
}
