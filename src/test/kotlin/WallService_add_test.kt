import attachments.Attachment
import attachments.AudioAttachment
import org.junit.Test
import org.junit.Assert.*

class WallServiceAddTest {
    @Test
    fun updateExisting() {
        val service = WallService
        val addedPost = service.add(Post())

        val expectedPostId = 1

        assertEquals(expectedPostId,addedPost.id)
    }
}