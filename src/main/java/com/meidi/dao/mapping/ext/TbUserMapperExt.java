package com.meidi.dao.mapping.ext;

import com.meidi.dao.mapping.TbUserMapper;
import com.meidi.dao.pojo.ext.TbUserExt;

public interface TbUserMapperExt extends TbUserMapper {
    TbUserExt selectComsumeByPriKey(Integer id);
}
