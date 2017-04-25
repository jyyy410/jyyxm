package com.niit.建造者模式;

import com.niit.建造者模式.Vo.Engine;
import com.niit.建造者模式.Vo.EscapeTower;
import com.niit.建造者模式.Vo.Orb;

/**
 * 
 *  [建造者模式]
 *  [一个对象有好多组件组成，需要构建许多零件，还要按照我们的顺序装配起来，实现组件的单独构造和装配的分离；
 *  buider构建者，构建各个组件   director装配，装配各个组件
 *  ]
 * @作者 jinyy
 * @version [版本号, 2017-3-9]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface BuiderService
{
  public Engine buiderEngine();
  public EscapeTower buiderEscapeTower();
  public Orb builderOrb();
}
