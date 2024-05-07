package com.example.roomapp.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hero")
data class Hero(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val image: String,
) {
    companion object {
        val heroes = listOf<Hero>(
            Hero(
                1,
                "Spiderman",
                "https://www.superherodb.com/pictures2/portraits/10/100/133.jpg",
            ),
            Hero(
                2,
                "Ironman",
                "https://www.superherodb.com/pictures2/portraits/10/100/85.jpg",
            ),
            Hero(
                3,
                "Captain America",
                "https://www.superherodb.com/pictures2/portraits/10/100/274.jpg",
            ),
            Hero(
                4,
                "Thor",
                "https://www.superherodb.com/pictures2/portraits/10/100/140.jpg",
            ),
            Hero(
                5,
                "Hulk",
                "https://www.superherodb.com/pictures2/portraits/10/100/83.jpg",
            ),
            Hero(
                6,
                "Batman",
                "https://hips.hearstapps.com/hmg-prod/images/batman-1646054773.jpeg?crop=0.5625xw:1xh;center,top&resize=640:*",
            ),
            Hero(
                7,
                "Superman",
                "https://ew.com/thmb/IWTSy6GrKCmZBSIcZwC84oHmNdw=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/mos-10175c_2-2000-116d947875b84ddcabb01baa1fa1b389.jpg",
            ),
            Hero(
                8,
                "Wonder",
                "https://static.wikia.nocookie.net/dccu/images/6/6f/JL_Wonder_Woman.jpg/revision/latest?cb=20160914003449",
            ),
            Hero(
                9,
                "Flash",
                "https://i.blogs.es/d60e27/the-flash/840_560.jpeg",
            ),
            Hero(
                10,
                "Green Lantern",
                "https://static.wikia.nocookie.net/marvel_dc/images/8/83/Hal_Jordan_and_the_Green_Lantern_Corps_Vol_1_45_Textless_Variant.jpg/revision/latest?cb=20180523193425",
            ),
        )
    }
}