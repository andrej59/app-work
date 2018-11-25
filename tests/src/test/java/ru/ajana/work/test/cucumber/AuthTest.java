package ru.ajana.work.test.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Аутентификация банковкой карты.
 *
 * @author Andrey Kharintsev on 25.11.2018
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/auth.feature",
    glue = "ru.ajana.work.test.cucumber.steps",
    tags = "@all",
    dryRun = false,
    strict = false,
    snippets = SnippetType.CAMELCASE,
    plugin = {"pretty", "html:target/cucumber", "junit:target/junit-report.xml"}
    //name = "^Успешное|Успешная.*"
)
public class AuthTest {

}
