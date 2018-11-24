package com.peidou.templatetest;

import com.peidou.lib.AppUtils;
import com.peidou.lib.BaseApp;

/**
 * <pre>
 *      作者  ：肖坤
 *      时间  ：2018/11/22
 *      描述  ：
 *      版本  ：1.0
 * </pre>
 */
public class App extends BaseApp {


    private static App mApp;

    /**
     * 获取App实例
     *
     * @return
     */
    public static App getInstance() {
        return mApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        AppUtils.init(this);
    }


}
