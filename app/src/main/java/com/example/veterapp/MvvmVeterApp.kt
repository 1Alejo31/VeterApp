package com.example.veterapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*Se crea la clase MvvmVeterApp con extencion de Application, que es para que sea la primera clase
en ser llamada cuando se inicie la aplicacion*/

@HiltAndroidApp
class MvvmVeterApp : Application()