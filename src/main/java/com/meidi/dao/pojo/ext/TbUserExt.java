package com.meidi.dao.pojo.ext;

import com.meidi.dao.pojo.TbUser;

public class TbUserExt extends TbUser {
    /* 消费总金额 */
    private Integer totalConsume;

    public Integer getTotalConsume() {
        return totalConsume;
    }

    public void setTotalConsume(Integer totalConsume) {
        this.totalConsume = totalConsume;
    }
}
