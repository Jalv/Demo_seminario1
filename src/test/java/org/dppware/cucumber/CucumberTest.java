package org.dppware.cucumber;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"json:target/cucumber"})
public class CucumberTest {

}
