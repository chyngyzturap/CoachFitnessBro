package com.pharos.utils

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object ThreadUtils {

    fun init(getThreadName: () -> String) {
        ThreadUtils.getThreadName = getThreadName
    }

    actual var getThreadName: () -> String = { METHOD_GET_THREAD_NAME_NOT_INIT_MESSAGE }
}

private const val METHOD_GET_THREAD_NAME_NOT_INIT_MESSAGE =
    "The method for getting the thread name is not initialized (please call ThreadUtils.init(getThreadName: () -> String))"
