package com.example.practice17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.LightTheme)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.theme_menu_item -> title = "Сменить тему"
            R.id.about_menu_item -> title = "О программе"  }
        return super.onOptionsItemSelected(item)
    }

    fun themeClick(item: MenuItem) {
        setTheme(R.style.LightTheme)
        setContentView(R.layout.activity_main)
    }
    fun aboutClick(item: MenuItem) {
        val intent: Intent =Intent(this@MainActivity,AboutActivity::class.java)
        startActivity(intent)
    }
}
