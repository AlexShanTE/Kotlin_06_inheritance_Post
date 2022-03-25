package attachments.mediaTypes

class Document(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int,
    val type: Int,
    val preview: Preview?
)

class Preview(photo: Photo?, graffiti: Graffiti?, audioMessage: AudioMessage?) {
    class Photo(val sizes: Array<PhotoCopy>){
        class PhotoCopy(
            val url:String,
            val width: Int,
            val height: Int,
            val type:String
        )
    }
    class Graffiti(
        val src: String,
        val width: Int,
        val height: Int
    )
    class AudioMessage(
        val duration:Int,
        val waveForm:Array<Int>,
        val linkOgg:String,
        val linkMp3:String
        )
}