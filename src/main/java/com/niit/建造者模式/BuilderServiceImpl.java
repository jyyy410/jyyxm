package com.niit.建造者模式;

import com.niit.建造者模式.Vo.Engine;
import com.niit.建造者模式.Vo.EscapeTower;
import com.niit.建造者模式.Vo.Orb;

public class BuilderServiceImpl implements BuiderService
{

    @Override
    public Engine buiderEngine() {
        System.out.println("创建builderengine");
        return new Engine();
    }

    @Override
    public EscapeTower buiderEscapeTower() {
        System.out.println("创建逃逸塔");
        return new EscapeTower();
    }

    @Override
    public Orb builderOrb() {
        System.out.println("创建发动机");
        return new Orb();
    }

}
