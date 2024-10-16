package cl.bootcamp.ejercicioindividual14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import cl.bootcamp.ejercicioindividual14.navigation.NavManager
import cl.bootcamp.ejercicioindividual14.ui.theme.EjercicioIndividual14Theme
import cl.bootcamp.ejercicioindividual14.viewModel.PatientsListViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel: PatientsListViewModel by viewModels()
        setContent {
            EjercicioIndividual14Theme {
                NavManager(viewModel)
            }
        }
    }
}

