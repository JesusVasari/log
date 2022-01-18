import java.util.logging.Level
import java.util.logging.LogManager

val l = LogManager.getLogManager().getLogger("").apply { level = Level.ALL }

fun main() {
    l.info ( "hola" )
    l.severe("hola")
    l.warning("hola")
}