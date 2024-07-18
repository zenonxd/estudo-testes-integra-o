package com.demo.swplanetapi.common;

import com.demo.swplanetapi.domain.Planet;

public class PlanetConstrants {
    public static final Planet PLANET = new Planet("name", "climate", "terrain");
    public static final Planet INVALID_PLANET = new Planet("", "", "");
}
