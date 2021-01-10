package hos.houns.domain.entity

data class PostUiModel(val userId: Long, val id: Long, val title: String, val body: String) {
    companion object {
        val EMPTY = PostUiModel(0L, 0L, "", "")
    }
}