package com.ajal.tech.route;

public enum ControllerRoute {

    API("/api"),
    VERSION("/v1"),
    STUDENT("/students"),
    SUBJECT("/subjects"),
    RATING("/ratings");

    private String route;

    ControllerRoute(String route) {
        this.route = route;
    }
}
