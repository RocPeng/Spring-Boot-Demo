package com.liger.ambition.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by roc_peng on 2017/8/15.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 继承自己的MyMapper
 */

public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
