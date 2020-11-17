package mx.udg.cuvalles.superrecicler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mx.udg.cuvalles.superrecicler.adapters.PaisAdapter
import mx.udg.cuvalles.superrecicler.modelo.Pais

class MainActivity : AppCompatActivity() {
    var myRecycler:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecycler = findViewById(R.id.myRecycler)

        val listaPaises = ArrayList<Pais>()

        listaPaises.add(Pais("Mexico","http://gg.gg/n06xh"))
        listaPaises.add(Pais("EU","https://bit.ly/2UpKmkj"))
        listaPaises.add(Pais("Venezuela","https://bit.ly/36znLHp"))

        myRecycler!!.layoutManager = GridLayoutManager(this,1)
        myRecycler!!.setHasFixedSize(true)
        myRecycler!!.adapter = PaisAdapter(listaPaises,this)
    }
}