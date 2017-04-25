package com.niit.建造者模式.Vo;

public class AirShip
{
private Engine engine;
private Orb orb;
private EscapeTower escapeTower;
public Engine getEngine() {
    return engine;
}
public void setEngine(Engine engine) {
    this.engine = engine;
}
public Orb getOrb() {
    return orb;
}
public void setOrb(Orb orb) {
    this.orb = orb;
}
public EscapeTower getEscapeTower() {
    return escapeTower;
}
public void setEscapeTower(EscapeTower escapeTower) {
    this.escapeTower = escapeTower;
}
}
