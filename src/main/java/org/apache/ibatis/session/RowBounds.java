package org.apache.ibatis.session;
/**
 * 分页参数对象，当前第几页，每页大小，默认是最大的数字和第一页
 *  [一句话功能简述]
 *  [功能详细描述]
 * @作者 jinyy
 * @version [版本号, 2016-11-9]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class RowBounds
{
    public static final int NO_ROW_OFFSET = 0;
    public static final int NO_ROW_LIMIT = Integer.MAX_VALUE;//jyy这句好
    public static final RowBounds DEFAULT = new RowBounds();//jyy 这个默认的对象是干嘛的？

    //offset,limit就等于一般分页的start,limit,
    private int offset;
    private int limit;

    //默认是一页Integer.MAX_VALUE条jyy
    public RowBounds() {
      this.offset = NO_ROW_OFFSET;
      this.limit = NO_ROW_LIMIT;
    }

    public RowBounds(int offset, int limit) {
      this.offset = offset;
      this.limit = limit;
    }

    public int getOffset() {
      return offset;
    }

    public int getLimit() {
      return limit;
    }
}
