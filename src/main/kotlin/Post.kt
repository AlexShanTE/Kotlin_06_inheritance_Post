import attachments.Attachment

data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int? = 0,
    val date: Int = 1231,
    val text: String = "",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments(1, true, true, true, true),
    val copyright: Copyright = Copyright(1, "Link", "name", "Type"),
    val likes: Likes = Likes(0, true, true, true),
    val reposts: Reposts = Reposts(0, true),
    val views: Views = Views(0),
    val postType: String = "PostType",
    val postSource: PostSource? = PostSource("type", "platform", "data", "url"),
    val attachments: kotlin.Array<Attachment> = emptyArray(),
    val geo: Geo = Geo("type", "coordinates", Place()),
    val signerId: Int? = 0,
    val copyHistory: kotlin.Array<Post>? = null,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: Donut = Donut(true, 1, PlaceHolder(), true, "EditMode"),
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

    data class PostSource(
        val type: String,
        val platform: String,
        val data: String,
        val url: String
    )

    data class Geo(
        val type: String,
        val coordinates: String,
        val place: Place? = Place()
    )

    data class Donut(
        val isDonut: Boolean,
        val paidDuration: Int,
        val placeHolder: PlaceHolder,
        val canPublishFreeCopy: Boolean,
        val editMode: String
    )

    class PlaceHolder()
    class Place(
        val id: Int = 0,
        val title: String = "title",
        val latitude: Int = 0,
        val longitude: Int = 0,
        val created: Int = 0,
        val icon: Int = 0,
        val checkins: Int = 0,
        val updated: Int = 0,
        val type: Int = 0,
        val country: Int = 0,
        val city: Int = 0,
        val address: String = "address"
    )
}

