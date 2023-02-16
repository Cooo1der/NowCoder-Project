package com.spring.nowcoder.bean;

import lombok.Data;
import lombok.ToString;

/**
 * 封装分页相关的信息
 */
//@Data
//@ToString
public class Page {

    // 当前页码
    private int current = 1;
    // 显示数据上限
    private int limit = 10;
    // 数据总数
    private int rows;
    // 查询路径（用于复用分页链接）
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        // 添加判断条件
        if (current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @return 获取当前页的起始行
     */
    public int getOffset() {
        return (current - 1) * limit;
    }

    /**
     *
     * @return 获取总页数
     */
    public int getTotal() {
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    /**
     *
     * @return 获取起始页码
     */
    public int getFrom() {
        return current - 2 >= 1 ? current - 2 : 1;
    }

    /**
     *
     * @return 获取起始页码
     */
    public int getTo() {
        return current + 2 <= getTotal() ? current + 2 : getTotal();
    }
}
