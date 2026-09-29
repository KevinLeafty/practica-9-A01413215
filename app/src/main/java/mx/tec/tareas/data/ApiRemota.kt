package mx.tec.tareas.data

import kotlinx.coroutines.delay
import mx.tec.tareas.domain.Tarea
import javax.inject.Inject

class ApiRemota @Inject constructor() {

    suspend fun descargarTareas(): List<Tarea> {
        delay(1500)
        return listOf(
            Tarea("Entregar la práctica 8", "Móviles", "Hoy"),
            Tarea("Estudiar para el parcial", "Cálculo", "Jueves"),
            Tarea("Revisar el pull request del equipo", "Reto", "Viernes"),
            Tarea("Leer el capítulo 3", "Ética", "Lunes")
        )
    }
}