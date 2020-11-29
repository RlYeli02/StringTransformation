class Letters{
    fun toCamelCase(text:String):String{
        val words = text.split(" ").toMutableList()
        var output=""

        for (w in words){
            output += w.capitalize()
        }
        output = output.trim()
        return output
    }
    fun toPascalCase (text:String):String{
        val words = text.split(" ").toMutableList()
        var output=""

        for (w in words){
            output += w.capitalize()
        }
        output = output.trim()
        return output
    }
}