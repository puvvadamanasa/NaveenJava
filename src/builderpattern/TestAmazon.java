package builderpattern;

public class TestAmazon {
	public static void main(String[] args) {
		EcommApp e = new EcommApp();
		e.login().login("sd", "sd")
		         .login("ds", "sds", 123).
		         search().search("sf").
		         search("sd", "sdf");
		e.login().search();
		e.login();
		e.login().login("dfj", "dfg")
        .login("sdf", "dsf", 123).
        search().search("sdfsd").
        search("dsfsd", "dsfsd");
	}

}
