class Letters{
    fun toUpperCase (text:String): String{
        var output=""
        for(w in text.indices){
            output += text[w].toUpperCase()
        }
        return output
    }
    fun toLowerCase (text:String): String{
        var output=""
        for(w in text.indices){
            output += text[w].toLowerCase()
        }
        return output
    }
}