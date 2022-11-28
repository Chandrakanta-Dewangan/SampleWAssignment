package com.learning.data.core.network

import com.learning.data.core.network.api.ClassifiedListingApi
import com.learning.data.core.network.api.GetAllAdsResponse
import retrofit2.Retrofit

open class NetworkDataSource(
    retrofitClient: Retrofit
) : ClassifiedListingApi {

    private val listingClient: ClassifiedListingApi by lazy {
        retrofitClient.create(
            ClassifiedListingApi::class.java
        )
    }

    override suspend fun getAllAds(): GetAllAdsResponse =
        listingClient.getAllAds()
}
    


