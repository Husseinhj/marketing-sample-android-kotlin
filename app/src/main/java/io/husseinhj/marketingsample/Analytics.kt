package io.husseinhj.marketingsample

import android.content.Context
import androidx.core.os.bundleOf
import com.google.firebase.analytics.FirebaseAnalytics

class Analytics {

    fun trackEvent(id: String, item: String, context: Context) {
        val bundle = bundleOf(
                FirebaseAnalytics.Param.ITEM_ID to id,
                FirebaseAnalytics.Param.ITEM_NAME to item,
                FirebaseAnalytics.Param.CONTENT_TYPE to "string"
        )

        context?.let { it1 ->
            FirebaseAnalytics.getInstance(it1).logEvent(FirebaseAnalytics.Event.SELECT_ITEM, bundle)
        }
    }

    fun trackSearchEvent(id: String, item: String, context: Context) {
        val bundle = bundleOf(
                FirebaseAnalytics.Param.ITEM_ID to id,
                FirebaseAnalytics.Param.ITEM_NAME to item,
                FirebaseAnalytics.Param.CONTENT_TYPE to "string"
        )

        context?.let { it1 ->
            FirebaseAnalytics.getInstance(it1).logEvent(FirebaseAnalytics.Event.SEARCH, bundle)
        }
    }

    fun trackLoginEvent(email: String, context: Context) {
        val bundle = bundleOf(
                "userId" to email,
        )

        context?.let { it1 ->
            FirebaseAnalytics.getInstance(it1).logEvent(FirebaseAnalytics.Event.LOGIN, bundle)
        }
    }

    fun trackSignUpEvent(email: String, context: Context) {
        val bundle = bundleOf(
                "userId" to email,
        )

        context?.let { it1 ->
            FirebaseAnalytics.getInstance(it1).logEvent(FirebaseAnalytics.Event.SIGN_UP, bundle)
        }
    }
}