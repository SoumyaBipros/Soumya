package com.bip;

public class WishMessage {

	public String hello(String name) {
		return "Hi " + name + " Welcome to soap Good Morning";
	}

	public String wish(int time) {
		if (time >= 5 && time < 12) {
			return "Good Morning";
		} else if (time >= 12 && time < 17) {
			return "Good Afternoon";
		} else if (time >= 17 && time < 21) {
			return "Good Afternoon";
		} else
			return "Good Night";
	}

}
