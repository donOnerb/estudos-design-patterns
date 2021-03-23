package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	    var config = "Windows";
	    Dialog dialog;
	    if(config.equals("Windows")) {
	        dialog = new WindowsDialog();
        } else if(config.equals("Web")) {
	        dialog = new WebDialog();
        } else {
	        throw new Exception("Algum erro! blá blá blá!");
        }
	   dialog.render();
    }
}
