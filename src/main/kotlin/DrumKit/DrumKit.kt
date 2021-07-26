class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean){
    fun playSnare() {
        if(hasSnare) println("bang bang bang!")
    }
    fun playTopHat() {
        if(hasTopHat) println("ding ding ba-da-bing")
    }
}

fun main(args: Array<String>) {
 val d = DrumKit(true, true)
 d.playTopHat()
 d.playSnare()
 d.hasSnare = false
 d.playTopHat()
 d.playSnare()
}