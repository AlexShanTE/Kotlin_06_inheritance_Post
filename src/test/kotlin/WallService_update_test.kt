import org.junit.Test
import org.junit.Assert.*

class WallServiceUpdateTest {
    @Test
    fun updateExisting() {
        val service = WallService
        service.add(Post(attachments = null)) //id = 1
        service.add(Post(attachments = null)) //id = 2
        service.add(Post(attachments = null)) //id = 3
        val updatedPost = Post(id = 2, text = "BlaBlaBla",attachments = null)
        val result = service.update(updatedPost)
        assertTrue(result)
    }
    @Test
    fun updateNotExisting() {
        val service = WallService
        service.add(Post(attachments = null)) //id = 1
        service.add(Post(attachments = null)) //id = 2
        service.add(Post(attachments = null)) //id = 3
        val updatedPost = Post(id = 0, text = "BlaBlaBla",attachments = null) //post with id 0 not exist
        val result = service.update(updatedPost)
        assertFalse(result)
    }
}