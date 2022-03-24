import java.util.*
import javax.swing.text.View

data class Post(
    var id: Int = 0,
    val ownerId: Int = 1,
    val fromId: Int = 1,
    val createdBy: Int = 1,
    val date: Int = 1231,
    val text: String = "",
    val replyOwnerId: Int = 1,
    val replyPostId: Int = 1,
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments(1,true,true,true,true),
    val copyright: Copyright = Copyright(1,"Link","name","Type"),
    val likes: Likes = Likes(0,true,true,true),
    val reposts: Reposts = Reposts(0,true),
    val views: Views = Views(0),
    val postType: String = "PostType",
    val signerId: Int = 1,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: Donut = Donut(true,1,PlaceHolder(),true,"EditMode"),
    val postPonedId: Int = 1
) {
    data class Comments(
        val count: Int,
        val canPost: Boolean,
        val groupsCanPost: Boolean,
        val canClose: Boolean,
        val canOpen: Boolean
    )

    data class Copyright(
        val id: Int,
        val link: String,
        val name: String,
        val type: String
    )

    data class Likes(
        val count: Int,
        val userLikes: Boolean,
        val canLike: Boolean,
        val canPublish: Boolean
    )

    data class Reposts(
        val count: Int,
        val userReposted: Boolean
    )

    data class Views(
        val count: Int
    )

    data class Donut(
        val isDonut: Boolean,
        val paidDuration: Int,
        val placeHolder: PlaceHolder,
        val canPublishFreeCopy: Boolean,
        val editMode: String
    )

    class PlaceHolder()
}

