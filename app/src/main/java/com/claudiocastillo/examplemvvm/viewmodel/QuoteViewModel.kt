package com.claudiocastillo.examplemvvm.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.claudiocastillo.examplemvvm.model.QuoteModel
import com.claudiocastillo.examplemvvm.model.QuoteProvider

//Paso 3
class QuoteViewModel:ViewModel() {
    //eL LiveData permite a nuestro activity
    //suscribirse a un modelo de datos nuestro y que se llama automaticamente
    //cuando se realiza un cambio en dicho modelo

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote: QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}