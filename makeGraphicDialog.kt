/*
#Made by s.seyedalian
#gmail:seyedalian10@gmail.com

*/

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.support.annotation.DrawableRes
import android.support.annotation.LayoutRes
import android.support.annotation.NonNull


abstract class  makeGraphicDialog(@NonNull context:Context,@LayoutRes  idLayout:Int) {
    val dialogBuilder = AlertDialog.Builder(context)
    private val layoutInflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val dialogView: View = layoutInflater.inflate(idLayout,null)
    lateinit var alertDialog:AlertDialog

    constructor(context:Context,idLayout:Int ,show:Boolean) : this(context,idLayout){
        dialogBuilder.setView(dialogView)
        init()
        alertDialog=dialogBuilder.create()

        if(show)
        alertDialog.show()

    }

    fun dismis() {
        alertDialog.dismiss()
    }


    protected abstract fun init()

    fun show(){
        alertDialog.show()
    }

    fun setWindowShap(@DrawableRes idShap: Int) {
        alertDialog.getWindow().setBackgroundDrawableResource(idShap)

    }
}
