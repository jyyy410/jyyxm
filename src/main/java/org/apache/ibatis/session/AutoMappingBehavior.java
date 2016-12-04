package org.apache.ibatis.session;
/**
 * 自动映射枚举类
 *  [一句话功能简述]
 *  [功能详细描述]
 * @作者 jinyy
 * @version [版本号, 2016-11-12]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public enum AutoMappingBehavior
{
    /**
     * Disables auto-mapping.
     */
    NONE,

    /**
     * Will only auto-map results with no nested result mappings defined inside.
     */
    PARTIAL,

    /**
     * Will auto-map result mappings of any complexity (containing nested or otherwise).
     */
    FULL
}
