package features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by xinrui on 23/10/2017.
 */
public class Stepdef {
    String loginResult = null;
    @Given("^存在用户账号为 (\\S*) ，密码为 (\\S*)$")
    public void hasUser(String phone, String password) throws Throwable {
/*        DataFactory df = new DataFactory();
        df.createUser(phone, password);*/
        System.out.println("hasUser");
    }

    @When("^用账号 (\\S*) ，密码 (\\S*) 登录$")
    public void login(String phone, String password) throws Throwable {
//        loginResult = UserProto.login(phone, password).getDescription().getContent();
        System.out.println("login");
    }

    @Then("返回结果为 (\\S*)")
    public void checkResult(String expect) throws Throwable{
//        assertThat(loginResult).isEqualTo(expect);
        System.out.println("checkResult");
    }
}

