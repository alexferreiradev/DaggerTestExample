package com.tomoima.daggertestexample

import com.tomoima.daggertestexample.api.ApiModule
import com.tomoima.daggertestexample.data.PrefModule
import com.tomoima.daggertestexample.repository.RepositoryModule
import com.tomoima.daggertestexample.signup.SignupActivityTest
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        PrefModule::class,
        ApiModule::class,
        RepositoryModule::class)
)
interface TestAppComponent : AppComponent {
    fun inject(test: SignupActivityTest)
}