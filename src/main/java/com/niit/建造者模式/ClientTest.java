package com.niit.建造者模式;

public class ClientTest
{

    /**
     *  [一句话功能简述]
     *  [功能详细描述]
     *  @param args    
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        DirectorService directorService = new DirectorServiceImpl(new BuilderServiceImpl());
        directorService.directorAirShip();

    }

}
