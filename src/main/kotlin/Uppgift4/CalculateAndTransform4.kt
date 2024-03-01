package Uppgift4

class CalculateAndTransform4 {

    //Beräknar summa Horisontell a-uppgift
    fun calculateHorizontal(dataFromWeb: List <String>) : Int {
        val horizontalData = dataFromWeb.filter { e -> e.contains("forward") } //Lista av forward
        val intHozData = horizontalData.map { it.filter { it.isDigit() }.toInt() } //Gör om till int-lista
        val sumHozData = intHozData.map { it }.sum() //Räknar ut summan

        return sumHozData
    }

    //Beräknar summa UP eller DOWN
    fun calculateUpOrDown(dataFromWeb: List <String>, position: String) : Int {
        var upData = dataFromWeb.filter { e -> e.contains(position) } //Sorterar på up
        upData = upData.map { it.replace(position + " ", "") } //Tar bort up
        val intUpData = upData.map { it.toInt() } //Konverterar till int list
        val sumUpData = intUpData.map { it }.sum() //Summerar
        return sumUpData
    }

    //Räknar ut depth i b-uppgift.
    fun calculateDepth(dataList: List<String>): Int {
        var aim = 0;
        var depth = 0;

        for (e in dataList) {
            if (e.contains("forward")) { //Om det avser forward.
                depth = depth + (aim * e.substring(e.length - 1).toInt())
            } else if (e.contains("down")) {
                aim = aim + e.substring(e.length - 1).toInt() //down
            } else {
                aim = aim - e.substring(e.length - 1).toInt() //up
            }
        }

        return depth
    }
}