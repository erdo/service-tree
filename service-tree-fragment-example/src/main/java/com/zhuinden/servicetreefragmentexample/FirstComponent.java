package com.zhuinden.servicetreefragmentexample;

import dagger.Component;

/**
 * Created by Owner on 2017. 03. 07..
 */
@FragmentScope
@Component(dependencies = {MainComponent.class})
public interface FirstComponent {
    void inject(FirstFragment firstFragment);
}
