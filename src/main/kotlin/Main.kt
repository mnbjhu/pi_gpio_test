import uk.pigpioj.PigpioConstants
import uk.pigpioj.PigpioJ

fun main() {
    try{
        val gpio = PigpioJ.autoDetectedImplementation()
        while (true){
            gpio.setMode(16, PigpioConstants.MODE_PI_OUTPUT)
            gpio.write(16, true)
            Thread.sleep(1000)
            gpio.write(16, false)
            Thread.sleep(1000)
        }
    } catch (e: InterruptedException){
        throw e
    }
}