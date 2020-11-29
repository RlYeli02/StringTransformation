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
    fun tocamelCase (text:String): String{
        val words = text.split(" ").toMutableList()
        var output=""
        for(w in words){
            output += w.capitalize()
        }
        output = output.trim()
        return output
    }
    fun toSnakeCase(text:String): String {
        val words = text.split("").toMutableList()
        var output=""
        for(w in words.indices){
            if(words[w]==" "){
                output += "_"
            }
            else{
                output += words[w]
            }
        }
        return output
    }
}