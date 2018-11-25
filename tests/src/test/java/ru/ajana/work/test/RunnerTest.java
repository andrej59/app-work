package ru.ajana.work.test;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Запускает все тесты.
 *
 * @author Andrey Kharintsev on 25.11.2018
 */

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "ru.ajana.work.test.cucumber",
    dryRun = false,
    strict = false,
    snippets = SnippetType.CAMELCASE,
    plugin = {"pretty", "html:target/cucumber", "junit:target/junit-report.xml"}
    //name = "^Успешное|Успешная.*"
)
public class RunnerTest {

}
