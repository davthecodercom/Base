package soy.gabimoreno.data.network.mapper

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test
import soy.gabimoreno.data.network.model.post.ContentApiModel
import soy.gabimoreno.data.network.model.post.PostApiModel
import soy.gabimoreno.data.network.model.post.TitleApiModel

class PostMapperKtTest {

    @Test
    fun `GIVEN a PostApiModel list WHEN toDomain THEN return the expected posts`() {
        val postApiModelList = listOf(buildPostApiModel())

        val result = postApiModelList.toDomain()

        result.forEach { post ->
            post.id shouldBeEqualTo ID
            post.title shouldBeEqualTo TITLE
            post.content shouldBeEqualTo CONTENT
            // TODO: Complete this
        }
    }

    private fun buildPostApiModel() = PostApiModel(
        id = ID,
        titleApiModel = TitleApiModel(TITLE),
        contentApiModel = ContentApiModel(CONTENT),
        authorId = AUTHOR_ID,
        categoryIds = CATEGORY_IDS,
        url = URL,
        dateString = DATE_STRING
    )
}

private const val ID = 1234L
private const val TITLE = "title"
private const val CONTENT = "content"
private const val AUTHOR_ID = 1
private val CATEGORY_IDS = listOf(1, 2)
private const val URL = "https://example.com"
private const val DATE_STRING = "2022-09-05T12:46:23"
