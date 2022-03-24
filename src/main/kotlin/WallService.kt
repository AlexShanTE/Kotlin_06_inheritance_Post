
object WallService {
    private var postArray: Array<Post> = emptyArray<Post>()
    private var id = 1

    fun add(post: Post): Post {
        postArray += post.copy(id = id)
        id++
        return postArray.last()
    }

    fun update(post: Post): Boolean {
        var res:Boolean = false
        for ((index, element) in postArray.withIndex()){
             if (element.id == post.id) {
                postArray[index] = post.copy(id = element.id, date = element.date)
                res = true
            }
        }
        return res
    }
}