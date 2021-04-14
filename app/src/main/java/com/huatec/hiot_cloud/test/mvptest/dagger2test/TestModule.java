package com.huatec.hiot_cloud.test.mvptest.dagger2test;

import dagger.Module;
import dagger.Provides;

/**
 *dagger2测试类
 */

@Module
public class TestModule {

    @Provides
    public ThirdObj getThirdObj(){
        return new ThirdObj();
    }
}
