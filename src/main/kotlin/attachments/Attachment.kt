package attachments
import attachments.mediaTypes.*

sealed class Attachment (val type:String)

data class AudioAttachment(val audio: Audio):Attachment("Audio")
data class DocAttachment(val document: Document):Attachment("Document")
data class PhotoAttachment(val photo: Photo):Attachment("Photo")
data class PageAttachment(val page: Page):Attachment("Page")
data class VideoAttachment(val video: Video):Attachment("Video")

