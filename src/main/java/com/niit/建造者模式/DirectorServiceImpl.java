package com.niit.建造者模式;

import com.niit.建造者模式.Vo.AirShip;
import com.niit.建造者模式.Vo.Engine;
import com.niit.建造者模式.Vo.EscapeTower;
import com.niit.建造者模式.Vo.Orb;

public class DirectorServiceImpl implements DirectorService
{
    BuiderService buiderService;
    

    public DirectorServiceImpl(BuiderService buiderService) {
        this.buiderService = buiderService;
    }

    @Override
    public AirShip directorAirShip() {
        Engine engine = buiderService.buiderEngine();
        EscapeTower escapeTower = buiderService.buiderEscapeTower();
        Orb orb = buiderService.builderOrb();
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrb(orb);
        return airShip;
    }

}
