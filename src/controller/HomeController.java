package controller;

public class HomeController extends ApplicationController {

	public HomeController(String action) {
		super(action);
	}

	public Responder<String> Index() {
		return new Responder<String>("Hello World!");
	}

	// TODO
	//		implement About() method
	//		see test/controller/homecontrollertest
}
