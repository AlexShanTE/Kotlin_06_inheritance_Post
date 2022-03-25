package attachments
import attachments.mediaTypes.*

interface Attachment {
    val type:String
}
data class AudioAttachment(val audio: Audio, override val type: String = "Audio"):Attachment
data class DocAttachment(val document: Document, override val type: String = "Document"):Attachment
data class PhotoAttachment(val photo: Photo, override val type: String = "Photo"):Attachment
data class PageAttachment(val page: Page, override val type: String = "Page"):Attachment
data class VideoAttachment(val video: Video, override val type: String = "Video"):Attachment

