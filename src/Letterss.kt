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
    fun toUpperCase (text:String): String{
        var output=""
        for (t in text.indices){
            output+= text[t].toUpperCase()
        }
        return output
    }
    fun toLowerCase (text:String): String{
        var output=""
        for (t in text.indices){
            output+= text[t].toLowerCase()
        }
        return output
    }
    fun toTrim (text:String):String{
        val s = text.trim()
        return s
    }
}