package com.sunnyweather.android.logic.model
import com.google.gson.annotations.SerializedName
/**
 * @author wenji.zhao
 * @time 2022/12/29 3:47 下午
 * @email wj.zhao08@zuche.com
 * @desc
 */
class PlaceResponse(val status: String, val places: List<Place>)

class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

class Location(val lng: String, val lat: String)