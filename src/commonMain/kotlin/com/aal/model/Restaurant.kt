package com.aal.model

class Restaurant(id:Int, val iconUrl:String, val name:String, val supportText:String, val price:String, val score:Double, val numReviews:Int, val lat:Double, val lon:Double): Obj(id) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Restaurant) return false

        if (iconUrl != other.iconUrl) return false
        if (name != other.name) return false
        if (supportText != other.supportText) return false
        if (price != other.price) return false
        if (score != other.score) return false
        if (numReviews != other.numReviews) return false
        if (lat != other.lat) return false
        if (lon != other.lon) return false

        return true
    }

    override fun hashCode(): Int {
        var result = iconUrl.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + supportText.hashCode()
        result = 31 * result + price.hashCode()
        result = 31 * result + score.hashCode()
        result = 31 * result + numReviews
        result = 31 * result + lat.hashCode()
        result = 31 * result + lon.hashCode()
        return result
    }

    override fun toString(): String {
        return "Restaurant(id= '$id', iconUrl='$iconUrl', name='$name', supportText='$supportText', price='$price', score=$score, numReviews=$numReviews, lat=$lat, lon=$lon)"
    }
}