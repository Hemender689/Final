package Runner_pak;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\training_d2.03.07\\eclipse-workspace\\TEST\\My_Feature\\UserLogin.feature",
glue = "stepDefi", plugin = {"report","json:/cucumber.json"})
public class UserRunner {

}
