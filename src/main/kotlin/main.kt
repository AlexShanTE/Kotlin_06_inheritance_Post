import attachments.*
import attachments.mediaTypes.Audio

fun main() {
    val post1 = Post()
    val post2 = Post()
    val post3 = Post()

    val post4 = Post(id = 2, date = 1111, text = "UpdatedPost")
    val post5 = Post(id = 2222, text = "UpdatedPost")

    WallService.add(post1)
    WallService.add(post2)
    WallService.add(post3)

    println(WallService.postArray[0])
    println(WallService.postArray[1])
    println(WallService.postArray[2])
    println(WallService.update(post4)) //true
    println(WallService.update(post5)) //false
    println(WallService.postArray[1])
    val audio: Audio = Audio(
        1, 1, "", "", 1, "", 1, 1, 1, 1, true, true
    )
    val audioAttachment: Attachment = AudioAttachment(audio)
    println(audioAttachment.type)
}