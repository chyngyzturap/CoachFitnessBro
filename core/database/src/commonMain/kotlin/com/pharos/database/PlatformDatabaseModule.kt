package com.pharos.database

import org.koin.core.module.Module

internal expect fun platformDatabaseModule(fileName: String): Module
